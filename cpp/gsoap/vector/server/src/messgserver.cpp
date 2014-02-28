#include <stdio.h>
#include <stdlib.h>
#include <vector>
#include <string>


#include "messgH.h"
#include "messg.nsmap"

using namespace std;

//////////////////////////////////////////////////////////////
//
int ns__test1( 	struct soap *p_soap,
		int p_code,
		std::string p_chaine,
		struct ns__messgResponse &p_out ) {

	int i;
	struct ns1__Subset s;

	printf("ns__test1 [%d:%s]\n", p_code, p_chaine.c_str() );
	p_out.nombre = p_code*2;
	p_out.chaine = (char*)soap_malloc( p_soap, 100 );

	sprintf( p_out.chaine, "On multiplie %d par 2 : %d", p_code, p_code*2 );
	for (i=0; i<p_code; i++) {
		p_out.vecteur.push_back(i*2);

		s.val=i;
		s.str= (char*)soap_malloc( p_soap, 10 );
		sprintf(s.str, "toto%d", i);
		p_out.vecteur2.push_back(s);
	}

	return SOAP_OK;
}

//////////////////////////////////////////////////////////////
//
int ns__test2( struct soap *p_soap,
		std::vector<int> p_vecteur,
		char **p_retour ) {

	int i;

	printf("Test2\n");
	for (i=0; i<p_vecteur.size(); i++) {
		printf("Value=%d\n",p_vecteur[i]);
	}

	*p_retour = (char*)soap_malloc( p_soap, 512 );
	sprintf( *p_retour, "Nombre d’elements : %d", p_vecteur.size() );

	if(i==0) {
		soap_fault(p_soap);
		p_soap->fault->faultstring = (char*)"Probleme dans la requete";
		return SOAP_FAULT;
	}

	return SOAP_OK;
}

//////////////////////////////////////////////////////////////



void * FL_traitementRequeteSOAP(void *p_tsoap) {

	struct soap *v_soap = (struct soap *)p_tsoap;

	pthread_detach( pthread_self() );

	soap_serve( (struct soap*)v_soap );
	soap_destroy( (struct soap*)v_soap );
	soap_end( (struct soap*)v_soap );
	soap_done( (struct soap*)v_soap );

	free( v_soap );
	pthread_exit( NULL );

	return NULL;
}



////////////////////////////////////////////////////////////////////////////////
//	Main
////////////////////////////////////////////////////////////////////////////////
int main(int argc,char *argv[]) {


	if (argc < 2) {
		fprintf(stderr, "Usage: port\n");
		fprintf(stderr, "ex : %s 31000\n", argv[0]);
		exit(0);
	}


	struct soap v_soap; // contexte du service SOAP
	struct soap *v_tsoap; // on clône le contexte SOAP pourle thread

	pthread_t v_tid;
	// l’identifiant du thread
	// on initialise la socket

	soap_init(&v_soap );

	// on crée la socket mère de connexion
	if (soap_bind(&v_soap, NULL, atoi(argv[1]), 100) < 0) { return -1; }

	// on gère une boucle infinie pour recevoir les requêtes
	for (;;) {

		v_soap.accept_timeout = 1;

		// on rend l’attente non bloquante
		if (soap_accept(&v_soap) < 0) { continue; }
		v_tsoap = soap_copy( &v_soap );
		pthread_create( &v_tid, NULL, (void*(*)(void*))FL_traitementRequeteSOAP, (void*)v_tsoap );

	}

	soap_done( &v_soap );

	return 0;
}


