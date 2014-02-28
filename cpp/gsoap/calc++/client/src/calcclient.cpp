#include "soapcalcProxy.h"
#include "calc.nsmap"

// const char server[] = "http://websrv.cs.fsu.edu/~engelen/calcserver.cgi";
const char server[] = "http://localhost:31000";

int main(int argc, char **argv) {

	if (argc < 5) {
		fprintf(stderr, "Usage: url [add|sub|mul|div|pow] num num\n");
		fprintf(stderr, "ex : %s http://localhost:31000 add  24 45\n", argv[0]);
		exit(0);
	}

	double a, b, result;

	a = strtod(argv[3], NULL);
	b = strtod(argv[4], NULL);

	calcProxy calc;
	calc.soap_endpoint = argv[1];

	switch (*argv[2]) {
		case 'a':
			calc.add(a, b, &result);
			break;
		case 's':
			calc.sub(a, b, &result);
			break;
		case 'm':
			calc.mul(a, b, &result);
			break;
		case 'd':
			calc.div(a, b, &result);
			break;
		case 'p':
			calc.pow(a, b, &result);
			break;
		default:
			fprintf(stderr, "Unknown command\n");
			exit(0);
	}

	if (calc.error)
		calc.soap_stream_fault(std::cerr);
	else
		printf("result : %g\n", result);

	return 0;
}

