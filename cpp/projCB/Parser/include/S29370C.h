/*************************************************************/
/* Genere par GenStub	                                     */
/* Interface & souche C en mode Client                       */
/*                                                           */
/* Service Adhesion numero : /af/ADHESION/include/S29370.h   */
/*************************************************************/
#ifndef __S29370C__
#define __S29370C__
#include "S29370.h"


#if ! defined( _Service_Retcode_Type_ )
#define _Service_Retcode_Type_
  struct Service_Retcode {
    long   error_code;
    double time;
  };
#endif

#if ! defined( _Service_Statistiques_ )
#define _Service_Statistiques_
  struct Service_Statistiques {
    char serveur[40];
    char jour[13];
    char heure[3];
    char mn[3];
    char nbmsgin[13];
    char nbmsgout[13];
  } ;
#endif

#ifdef __cplusplus
extern "C"{
#endif

/* ------------------------------------- */ 
/* Prototype d'Appel du Service S29370   */ 
/* ------------------------------------- */ 
#if defined( CLIENT_HEADER_V0 ) || defined( CLIENT_HEADER_V1 ) || defined( CLIENT_HEADER_V2 )
void S29370(
  WIS29370_TYPE *StructIn, 
  WOS29370_TYPE *StructOut,
  char *Mode_Appel,
  char *Domaine,
  char *Fraicheur,
  char *Nom_Retour,
  char *Date_Real,
  char *Heure_Real,
  char *Calling_App,
  char *Mode_System,
  long *Error_Code
  );
#else
void S29370(
  WIS29370_TYPE *StructIn, 
  WOS29370_TYPE *StructOut,
  char *Mode_Appel,
  char *Domaine,
  char *Fraicheur,
  char *Nom_Retour,
  char *Date_Real,
  char *Heure_Real,
  char *Calling_App,
  char *Mode_System,
  long *Error_Code
  );
#endif

/* ----------------------------------------------------- */ 
/* Fonctions Generees Utiles pour le Dump des Structures */
/* ----------------------------------------------------- */ 
void PrintIn_S29370(WIS29370_TYPE *IN);
void PrintOut_S29370(WOS29370_TYPE *OUT);
#if defined( CLIENT_HEADER_V0 ) || defined( CLIENT_HEADER_V1 ) || defined( CLIENT_HEADER_V2 )
void Ping_S29370(
  char *Mode_Appel,               /* P=ping I=Question, W=ONE WAY */
  char *Mode_System,              /* Serveur Adhesion appele      */
  struct Service_Retcode *retcode /* Structure de retour          */
  );
#else
void Ping_S29370( 
  char *Domaine, 
  char *Fraicheur,
  char *Ident_Process_Client,
  char *Mode_System,
  struct Service_Retcode *retcode
  ) ;
#endif
int Stat_S29370( char  *Domaine, 
  char  *Fraicheur,
  char  *Ident_Process_Client,
  char  *Mode_System,
  long  *Error_Code,
  struct Service_Statistiques stat[] ) ;

#ifdef __cplusplus
}
#endif

#if !defined( CLIENT_HEADER_V0 ) && !defined( CLIENT_HEADER_V1 ) && !defined( CLIENT_HEADER_V2 )
#ifdef __cplusplus
void S29370( 
  WIS29370_TYPE *StructIn,
  WOS29370_TYPE *StructOut,
  char *Mode_Appel,
  char *Domaine, 
  char *Fraicheur,
  char *Ident_Process_Client,
  char *Mode_System,
  long *Error_Code
  );
#ifdef __cplusplus
extern "C"{
#endif
void S29370_BIS( 
  WIS29370_TYPE *StructIn,
  WOS29370_TYPE *StructOut,
  char *Mode_Appel,
  char *Domaine, 
  char *Fraicheur,
  char *Ident_Process_Client,
  char *Mode_System,
  long *Error_Code
  );
#ifdef __cplusplus
}
#endif
void S29370_PDM( 
  WIS29370_TYPE *StructIn,
  WOS29370_TYPE *StructOut,
  char *Mode_Appel,
  char *Domaine, 
  char *Fraicheur,
  char *Ident_Process_Client,
  char *Mode_System,
  long *Error_Code
  );
#endif
#endif

/* ----------------------------------------------- */ 
/* Methodes Utilisees pour la Generation des Stubs */ 
/* ----------------------------------------------- */ 
extern void DecodeOUT_S29370(char *in, WOS29370_TYPE *IN, int longu);
extern void EncodeIN_S29370(char *out, WIS29370_TYPE *OUT);

#endif
