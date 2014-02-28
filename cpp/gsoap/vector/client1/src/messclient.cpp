#include "messgH.h"
#include "messg.nsmap"

using namespace std;


////////////////////////////////////////////////////////////////////////////////
//	Main
////////////////////////////////////////////////////////////////////////////////

int main(int argc, char **argv){



	if (argc < 4) {
		fprintf(stderr, "Usage: url unInt uneString \n");
		fprintf(stderr, "ex : %s http://localhost:31000 24 test\n", argv[0]);
		exit(0);
	}

	int i;

	ns__messgResponse v_reponse;
	struct soap v_soap;
	soap_init( &v_soap );


	// soap_set_namespaces( &v_soap, messg_namespaces );
	soap_call_ns__test1( &v_soap, argv[1], "",atoi(argv[2]), argv[3], v_reponse );

	if (v_soap.error) { soap_print_fault(&v_soap, stderr); }
	printf("Nombre=%d Chaine=[%s]\n", v_reponse.nombre, v_reponse.chaine );
	printf("Nombre d’elements : %d\n", v_reponse.vecteur.size() );

	for (i=0; i<v_reponse.vecteur.size(); i++) {
		printf("i=%d - %d - %s\n", v_reponse.vecteur[i], v_reponse.vecteur2[i].val, v_reponse.vecteur2[i].str);
	}

	soap_destroy(&v_soap);
	soap_end(&v_soap);
	soap_done(&v_soap);

	return SOAP_OK;

}

