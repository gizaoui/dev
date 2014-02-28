


#define BUFFREADSOCK 320
#define PORT 31001
#define MAX_RCV	200
#define MAX_THREAD 100
#define ENDPARSER "</service>" // Parser de fin de message



struct Request {

  private:
     pthread_t 	thr_req,  // Recupération du message
     		thr_resp; // Traitement de message + renvoi la réponse au client
     std::string str_xml; // Accueil le message reconstitué
     bool bol_request,  // Acquitement : "message pret à être traité"
     	  bol_response; // Acquitement : "fin de traitement du message"
     int i_conn; // Connexion
     static SipsConfig *conf; // Message d'erreur Sips/Amadeus
     static pthread_mutex_t mut_nbth;
     static unsigned char uc_nbthread; // Nbre de traitement en cours

  public:

     Request(int,SipsConfig*);
     ~Request();
     Request(const Request &){};

     std::string & Get_Xml();
     int Get_Conn();
     void Start(); // Traitement de message + renvoi la réponse au client
     static void Run(void*);
     static void Inc_NbThread();
     static void Dec_NbThread();
     unsigned char Get_NbThread();

     static void Rcv(void*);
     bool Get_Request();  // Lance le traitement (de 'Connect::Pop' sur 'Request::Start')
     bool Get_Response(); // Lance le traitement (de 'Connect::Pop' sur 'Request::Start')
     void Set_Request();  // Acquitement : "message pret à être traité"
     void Set_Response(); // Traitement de message effectuée
                          // + renvoi la réponse au client
                          // + autorise la destruction de l'instance Del_Rcv
     void Set_XmlMess(std::string&);
};



struct Connect {

  private:
    static SipsConfig *conf;  // Message d'erreur Sips/Amadeus
    static int i_port;
    static unsigned char uc_maxthread; // Nbre max. de traitement en cours
    static unsigned short us_maxrecv; // Max. de connection en memoire (vector)
    static pthread_mutex_t mut_sinchro;
    static vector<Request*> v_rcv;

  public:
    Connect(char**, int); // Lancement des threads
    virtual ~Connect(){}
    Connect(const Connect &){}
    static void Push(void); // Gestion des connexions
    static void Pop(void); // Dépile la lst des instances contenant les chaînes xml

};

