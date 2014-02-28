
#include "S29370C.h"
// #include "S29370S.h"


#define DEF_SIPS_OKCDE		"00" // Cde Sips si carte autorisé
#define DEF_SIPS_KOCDE		"90" // Cde Sips si carte non autorisé
#define DEF_AMADEUS_OKCDE	"OK"
#define DEF_AMADEUS_KOCDE	"-"
#define ADH                     "00"

// Adhesion
#define CALLMODE		"S"
#define DOM			""
#define FRESHNESS		"9"
#define RETURNNAME		""
#define REALDATE		""
#define REALHOUR		""

#define CLIENTPROCESSID         "ARIES"
#define SYSTMEMODE              "T" // T : Test - P : Prod - R : Recette - Dev : D,


///////////////////////////////////////////////////////////
// DECLARATION DES ATTRIBUS CONTENUS DANS LA CHAINE XML //
///////////////////////////////////////////////////////////
#define MAX_ATTRIB_VERSION_CHR  16 // nbre max. de caractères contenu ds le tableau
const char c_attrib[][MAX_ATTRIB_VERSION_CHR+1]={ // /!\ ATTENTION : MAX_ATTRIB_CHR = 16 (chaîne max. : "merchant_country")
     "name",
     "component",
     "amount",
     "origin",
     "cvv_key",
     "cvv_flag",
     "card_type",
     "card_number",
     "merchant_id",
     "card_validity",
     "currency_code",
     "transaction_id",
     "merchant_country" //<--- CHAINE MAXI. (16 caractères)
    };
const char c_nbAttrib = sizeof(c_attrib)/(MAX_ATTRIB_VERSION_CHR+1); // nbre d'éléments du tableau


// Type de messages pour lesquels la réponse est OK
#define MAX_MESSNAME_CHR  6 //  CHAINE MAXI. (6 caractères)
const char c_messOK[][MAX_MESSNAME_CHR+1]={ "advice", "cancel"};
const char c_nbMessOK = sizeof(c_messOK)/(MAX_MESSNAME_CHR+1);


// Les UserID utilisés dans les appels adhesion : CHAINE MAXI. (8 caractères)
// BACK_PAR (pour oid PARAF011G), BACK_RUN (pour oid RUNAF010J)
const char c_UserId[][S29370_L_USERID]={"BACK_PAR", "BACK_RUN"};
const char c_nbUserId = sizeof(c_UserId)/S29370_L_USERID;


struct Parser {

  private:
     WIS29370_TYPE  IN; // requête envoyée au service
     WOS29370_TYPE  OUT; // réponse du service

     std::string str_response;

  public:
     Parser(SipsConfig *, std::string);
     virtual ~Parser(){}
     std::string& Get_Response() {  return str_response; } // CHAINE XML RENVOYEE A ACE
};


