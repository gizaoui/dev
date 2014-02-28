#include "soapH.h"
#include "calc.nsmap"


int main(int argc, char **argv) {

	SOAP_SOCKET m, s; // master and slave sockets

	struct soap soap; // the gSOAP runtime context

	soap_init(&soap); // initialize the context (only once!)

	if (argc < 2) {
		soap_serve(&soap);	/* serve as CGI application */
	}
	else {

		int port=atoi(argv[1]);

		m = soap_bind(&soap, NULL, port, 100);

		if (!soap_valid_socket(m)) {
			soap_print_fault(&soap, stderr);
			exit(-1);
		}

		fprintf(stderr, "Socket connection successful: master socket = %d\n", m);

		for (;;) {

			s = soap_accept(&soap);

			fprintf(stderr, "Socket connection successful: slave socket = %d\n", s);

			if (!soap_valid_socket(s))	{
				soap_print_fault(&soap, stderr);
				exit(-1);
			}

			soap_serve(&soap);
			soap_end(&soap);
		}
	}

	return 0;
}


//////////////////////////////////////////////////////////////////////

int ns__add(struct soap *soap, double a, double b, double *result){
	*result = a + b;
	return SOAP_OK;
}


int ns__sub(struct soap *soap, double a, double b, double *result){
	*result = a - b;
	return SOAP_OK;
}


int ns__mul(struct soap *soap, double a, double b, double *result){
	*result = a * b;
	return SOAP_OK;
}


int ns__div(struct soap *soap, double a, double b, double *result){

	if (b) {
		*result=a/b;
	}
	else {
		char *s = (char*)soap_malloc(soap, 1024);
		sprintf(s, "<error xmlns=\"http://tempuri.org/\">Can't divide %f by %f</error>", a, b);
		return soap_sender_fault(soap, "Division by zero", s);
	}

	return SOAP_OK;
}


int ns__pow(struct soap *soap, double a, double b, double *result) {

	*result = pow(a,b);

	if (soap_errno == EDOM) {	/* soap_errno is like errno, but compatible with Win32 */
		char *s = (char*)soap_malloc(soap, 1024);
		sprintf(s, "Can't take the power of %f to %f", a, b);
		sprintf(s, "<error xmlns=\"http://tempuri.org/\">Can't take power of %f to %f</error>", a, b);
		return soap_sender_fault(soap, "Power function domain error", s);
	}

	return SOAP_OK;
}

