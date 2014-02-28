#include "messgH.h"
#include "messg.nsmap"

using namespace std;


////////////////////////////////////////////////////////////////////////////////
//	Main
////////////////////////////////////////////////////////////////////////////////
int main(int argc, char **argv){


	if (argc < 2) {
		fprintf(stderr, "Usage: url \n");
		fprintf(stderr, "ex : %s http://localhost:31000\n", argv[0]);
		exit(0);
	}

	int i;
	std::vector<int> v_vecteur;
	char *v_chaine;
	struct soap v_soap;

	soap_init( &v_soap );

	for (i=1; i<=12; i++) {
		v_vecteur.push_back(i*10);
	}

	soap_call_ns__test2( &v_soap, argv[1], "", v_vecteur, &v_chaine );

	if (v_soap.error) { soap_print_fault(&v_soap, stderr); }

	printf("Chaine=[%s]\n", v_chaine );

	soap_destroy(&v_soap);
	soap_end(&v_soap);
	soap_done(&v_soap);

	return SOAP_OK;
}

