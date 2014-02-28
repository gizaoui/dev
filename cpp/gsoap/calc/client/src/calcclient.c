#include "soapH.h"
#include "calc.nsmap"


// const char server[] =  "http://localhost:31000"; /* to test against samples/webserver */


int main(int argc, char **argv) {

	struct soap soap;
	double a, b, result;

	if (argc < 5)  {
		fprintf(stderr, "Usage: url [add|sub|mul|div|pow] num num\n");
		fprintf(stderr, "ex : %s http://localhost:31000 add 4 7\n", argv[0]);
		exit(0);
	}

	soap_init1(&soap, SOAP_XML_INDENT);

	a = strtod(argv[3], NULL);
	b = strtod(argv[4], NULL);

	switch (*argv[2]) {

		case 'a':
			soap_call_ns__add(&soap, argv[1], "", a, b, &result);
			break;

		case 's':
			soap_call_ns__sub(&soap, argv[1], "", a, b, &result);
			break;

		case 'm':
			soap_call_ns__mul(&soap, argv[1], "", a, b, &result);
			break;

		case 'd':
			soap_call_ns__div(&soap, argv[1], "", a, b, &result);
			break;

		case 'p':
			soap_call_ns__pow(&soap, argv[1], "", a, b, &result);
			break;

		default:
			fprintf(stderr, "Unknown command\n");
			exit(0);
	}

	if (soap.error) {
		soap_print_fault(&soap, stderr);
		exit(1);
	}
	else {
		printf("result = %g\n", result);
	}

	soap_destroy(&soap);
	soap_end(&soap);
	soap_done(&soap);

	return 0;
}
