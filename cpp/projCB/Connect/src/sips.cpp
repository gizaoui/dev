#include <iostream>
#include <pthread.h>
#include <stdlib.h>
#include <signal.h>
#include <sys/socket.h>
#include <string.h>
#include <arpa/inet.h>
#include <unistd.h>
#include <fcntl.h>
#include <vector>
#include <algorithm>
#include <poll.h>

#include <fstream>
#include <map>
#include <vector>
#include <algorithm>


using namespace std;

#include "Tools.h"
#include "SipsConfig.h"
#include "Parser.h"
#include "sips.h"



//-------------------------------------------[ Connect ]-------------------------------------------

SipsConfig *Connect::conf;
int Connect::i_port=PORT; // Port socket
pthread_mutex_t Connect::mut_sinchro;  	// Partage de param entre 'Push' et 'Pop'
vector<Request*> Connect::v_rcv;


extern "C" void *Call_Push(void* id)  {
  Connect::Push();
  return NULL;
}

extern "C" void *Call_Pop(void* id)  {
  Connect::Pop();
  return NULL;
}

// CONSTRUCTEUR
Connect::Connect(char **c_arg, int i_arg) {


    if(c_arg!=NULL) { conf= new SipsConfig(c_arg[1]); }
    else {
        TRACEMSG("Chargement du fichier de configuration par défaut : './ConvAmadeusSipsCde.txt'");
        conf= new SipsConfig("./ConvAmadeusSipsCde.txt");
    }

    if(c_arg!=NULL && i_arg>2) i_port=atoi(c_arg[2]);
    else TRACEMSG("Connexion par défaut sur le port : "<<i_port);

/*
    // TEST
    const char * c_advice = "<service name=\"advice\" component=\"office\"><advice origin=\"3333333333333333\" merchant_id=\"012132156456456\" payment_date=\"20061013\" transaction_id=\"000307\" authorisation_id=\"N55555\" merchant_country=\"fr\"/></service>";
    const char * c_author = "<service name=\"author\" component=\"office\"><author amount=\"000000010000\" origin=\"BACK_PAR\" cvv_key=\"\" cvv_flag=\"0\" card_type=\"CA\" card_number=\"5132839000000027\" merchant_id=\"012132156456456\" card_validity=\"200804\" currency_code=\"978\" transaction_id=\"000302\" merchant_country=\"fr\"/></service>";
    const char * c_cancel = "<service name=\"cancel\" component=\"office\"><cancel amount=\"000000001000\" origin=\"3333333333333333\" merchant_id=\"012132156456456\" payment_date=\"20061013\" currency_code=\"978\" transaction_id=\"000307\" merchant_country=\"fr\"/></service>";
    Parser xml(conf, std::string(c_author));
    delete conf;
    return;
*/

    // Déclare le port innocupé après l'arret du process
    signal (SIGPIPE, SIG_IGN);

    // DEMARRAGE DES THREADS
    pthread_t thr_Push, thr_Pop;

    if((pthread_mutex_init(&mut_sinchro, NULL))!=0){
	ERRMSG("ECHEC LORS DE L'INITIALISATION DU MUTEX 'mut_sinchro'");
        exit(0);
    }
    pthread_mutex_unlock(&mut_sinchro);
    pthread_create(&thr_Push,NULL,Call_Push,NULL); // Gestion des connections
    pthread_create(&thr_Pop,NULL,Call_Pop,NULL);   // Dépile la lst des instances contenant les chaînes xml
    while(pthread_join(thr_Push,NULL)==0 || pthread_join(thr_Pop,NULL)==0);

}


// Gestion des connections
void Connect::Push()   {

    int i_sock, i_cust_len, i_serv_len;
    struct sockaddr_in serv_addr, cust_addr;

    // création de la socket serveur
    if((i_sock=socket(PF_INET,SOCK_STREAM,0))==-1) {
	ERRMSG("server: socket failed");
	exit(1);
    }

    // init socket serveur
    bzero((char *)&serv_addr, sizeof serv_addr);
    serv_addr.sin_family=AF_INET;
    serv_addr.sin_port=htons(i_port);
    serv_addr.sin_addr.s_addr=INADDR_ANY;

    int i_sockopt=1;
    if(setsockopt(i_sock, SOL_SOCKET, SO_REUSEADDR, &i_sockopt, sizeof(int)) < 0) {
	ERRMSG("setsockopt failed");
	exit(1);
    }

    fcntl (i_sock, F_SETFD, 1);

    i_serv_len=sizeof(serv_addr);
    if(bind(i_sock,(struct sockaddr*)&serv_addr,i_serv_len)==-1) {
	ERRMSG("serveur: port occupé");
        close(i_sock);
	exit(1);
    }

    if((listen(i_sock,5))==-1) {
        ERRMSG("server: listen failed");
        exit(1);
    }

    // Attente des connections
    for(;;){

	int i_con=-1;
        i_cust_len=sizeof(cust_addr);
        if((i_con=accept(i_sock,(struct sockaddr*)&cust_addr,(socklen_t*)&i_cust_len))==-1){
           ERRMSG("server: accept failed");
           exit(1);
        }

	// Test si le nbre de connection maxi. est atteint
	if(v_rcv.size()>MAX_RCV) {
	  const char *c_err="<error message=\"Too much customer\"/>";
	  TRACEMSG(c_err<<" ("<<v_rcv.size()<<")");
          write(i_con,c_err,strlen(c_err));
	  close(i_con);
	}
	else {
    	  pthread_mutex_lock(&mut_sinchro);
	  v_rcv.push_back(new Request(i_con, conf));
    	  pthread_mutex_unlock(&mut_sinchro);
	}

   } // for(;;)

}


// Foncteur de suppression
bool Del_Rcv(Request *st_rcv) {
   if(st_rcv->Get_Response()) {
     delete st_rcv;
     return true;
   }
   else return false;
}



// Dépile la lst des instances contenant les chaînes xml
void Connect::Pop(){

   for(;;) {

      vector<Request*>::iterator itv_rcv;

      pthread_mutex_lock(&mut_sinchro);
      unsigned int ui_nbStart=0;
      for(itv_rcv=v_rcv.begin(); itv_rcv!=v_rcv.end(); ++itv_rcv) {
         // Limitation du nbre de traitement simultannés
	 if((*itv_rcv)->Get_NbThread()>MAX_THREAD){
	    TRACEMSG("Max. Thread : "<<(*itv_rcv)->Get_NbThread());
	    break;
	 }
         // Le message est complet -> debut du traitement
	 if((*itv_rcv)->Get_Request() && !(*itv_rcv)->Get_Response()) (*itv_rcv)->Start();
      }
      pthread_mutex_unlock(&mut_sinchro);

      pthread_mutex_lock(&mut_sinchro);
      // Suppression de toutes les instances de la classe 'Request' traitant les requêtes:
      // - 'Del_Rcv' libère le contenu 'delete st_rcv'
      // - 'v_rcv.erase' libère le contenant
      v_rcv.erase(remove_if(v_rcv.begin(),v_rcv.end(),Del_Rcv),v_rcv.end());
      pthread_mutex_unlock(&mut_sinchro);

      poll(0,0,100);

  } // for(;;)

}

//-------------------------------------------[ Request ]-------------------------------------------


extern "C" void* Call_Rcv(void* data) {
    Request::Rcv(((Request**)data));
    return NULL;
}

extern "C" void* Call_Run(void* data) {
    Request::Run(((Request**)data));
    return NULL;
}


unsigned char Request::uc_nbthread=0;
pthread_mutex_t  Request::mut_nbth;
SipsConfig *Request::conf;



Request::Request(int i_c, SipsConfig *sc){

  i_conn=i_c;
  conf=sc;
  bol_request=false;
  bol_response=false;

  if((pthread_mutex_init(&mut_nbth, NULL))!=0){
    ERRMSG("ECHEC LORS DE L'INITIALISATION DU MUTEX 2");
     exit(1);
  }

  pthread_attr_t at_read;

  if(pthread_attr_init(&at_read)!=0){
       ERRMSG("Echec lors de la création de l'attribut");
       exit(1);
  }

  if(pthread_attr_setdetachstate(&at_read, PTHREAD_CREATE_DETACHED)!=0){
       ERRMSG("Echec de la définition de l'attribut détaché");
       exit(1);
  }

  if(pthread_create(&thr_req, &at_read, Call_Rcv, (Request*)this)!=0){
       ERRMSG("Echec lors de la creation du thread");
       exit(1);
  }

  // Attente destruction du thread (AUCUNE BOUCLE ...)
  (void)pthread_attr_destroy(&at_read);
}


Request::~Request(){

 if(!bol_request)
   if(pthread_cancel(thr_req)!=0)
      ERRMSG("WARNING : 'pthread_cancel' (thr_req)");

 if(!bol_response)
   if(pthread_cancel(thr_resp)!=0)
      ERRMSG("WARNING : 'pthread_cancel' (thr_resp)");

 // TRACEMSG("DESTR. Request"<<endl;
 poll(0,0,5); // /!\ Permet au foncteur 'Del_Rcv' d'éviter l'utilisation de pointeurs NULL

}


void Request::Set_XmlMess(string &str_mess) {
   str_xml=str_mess;
}


// LANCEE PAR LE THREAD 'Call_Rcv'
void Request::Rcv(void *p){

  char c_mess[BUFFREADSOCK+1];
  string s_mess;
  int i_read;
  s_mess.clear();
  memset(c_mess,'\0',BUFFREADSOCK+1);

  // Récupération de la totalité du message
  while((i_read=read(((Request*)p)->Get_Conn(), c_mess, BUFFREADSOCK))!=0) {
    // TRACEMSG(c_mess<<endl;
    s_mess.append(c_mess);
    if(strstr(s_mess.c_str(),ENDPARSER)!=NULL) { // Dernière ligne
       ((Request*)p)->Set_XmlMess(s_mess); // Le message est entier
       s_mess.clear();
       break;
    }
    memset(c_mess,'\0',BUFFREADSOCK+1);
  } // while((read ...

   ((Request*)p)->Set_Request(); // Acquitement : "message pret à être traité"
}



// Acquitement : "message complet et pret à être traité"
void Request::Set_Request() {  bol_request=true; }
bool Request::Get_Request(){ return bol_request; }

// Acquitement : "message traité"
void Request::Set_Response(){ bol_response=true; }
bool Request::Get_Response(){ return bol_response; }


void Request::Inc_NbThread(){
   pthread_mutex_lock(&mut_nbth);
   ++uc_nbthread;
   pthread_mutex_unlock(&mut_nbth);
}


void Request::Dec_NbThread(){
   pthread_mutex_lock(&mut_nbth);
   --uc_nbthread;
   pthread_mutex_unlock(&mut_nbth);
}


unsigned char Request::Get_NbThread(){
   return uc_nbthread;
}

string & Request::Get_Xml(){
  return str_xml;
}

int Request::Get_Conn(){
   return i_conn;
}

void  Request::Start() {

  pthread_attr_t at_read;

  if(pthread_attr_init(&at_read)!=0){
       ERRMSG("Echec lors de la création de l'attribut");
       exit(1);
  }

  if(pthread_attr_setdetachstate(&at_read, PTHREAD_CREATE_DETACHED)!=0){
       ERRMSG("Echec de la définition de l'attribut détaché");
       exit(1);
  }

  if(pthread_create(&thr_resp, &at_read, Call_Run, (Request*)this)!=0){
       ERRMSG("Echec lors de la creation du thread");
       exit(1);
  }

  // Attente destruction du thread (AUCUNE BOUCLE ...)
  (void)pthread_attr_destroy(&at_read);
}


// TRAITEMENT DE LA REQUETE
void Request::Run(void *p) {

  Inc_NbThread(); // Incrémentation du nbre de message en cours de traitement

  // Traitement de la chaîne xml
  Parser xml(conf, ((Request*)p)->Get_Xml());

  // Renvoi le résultat de la requête
  write(((Request*)p)->Get_Conn(), xml.Get_Response().c_str(), ((Request*)p)->Get_Xml().size());

  close(((Request*)p)->Get_Conn()); // Fermeture de la connection

  Dec_NbThread();// Décrémentation du nbre de message en cours de traitement

  ((Request*)p)->Set_Response(); // Acquitement : "fin de traitement du message"
}





//-------------------------------------------[ main ]-------------------------------------------


int main(int argc,char **argv) {

  if(argc>1) Connect c((char**)argv, argc);
  else Connect c(NULL, argc);
  return 0;
}

