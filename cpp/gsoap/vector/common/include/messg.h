//gsoap ns service name:	messg
//gsoap ns service protocol:	SOAP
//gsoap ns service style:	rpc
//gsoap ns service encoding:	literal
//gsoap ns service namespace:	http://localhost:8080/messg.wsdl
//gsoap ns service location:	http://localhost:8080/messgserver
//gsoap ns schema namespace:	urn:messg

#include <vector>


////////////////////////////////////////

struct ns1__Subset {
	int val;
	char *str;
};

template <class T> class std::vector;

class ns__messgResponse {
	int nombre;
	char *chaine;
	std::vector<int> vecteur;
    std::vector<struct ns1__Subset> vecteur2;
};

int ns__test1( int, std::string, ns__messgResponse &out );

////////////////////////////////////////

int ns__test2( std::vector<int>, char** );

