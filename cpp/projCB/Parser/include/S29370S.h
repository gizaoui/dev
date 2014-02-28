/************************************************************/
/* Genere par GenStub                                       */
/* Interface & souche C en mode Serveur                     */
/*                                                          */
/* Service Adhesion numero : S29370                       */
/************************************************************/
#ifndef __S29370S__


#define __S29370S__
#include "S29370.h" 
/*************************************/
/* Les unions pour les buffers	     */
/*************************************/

/*************************************/
/* Fonctions *************************/
/*************************************/
/* Sous Programme correspondant au Service S29370 */
#if defined( __cplusplus )
extern "C" 
{
#endif
  void S29370S(WIS29370_TYPE *IN, WOS29370_TYPE *OUT);
  /* ---------------------------------------------------- */ 
  /*Fonctions Generees Utiles pour le Dump des Structures */
  /* ---------------------------------------------------- */ 
  void PrintIn_S29370 (WIS29370_TYPE *IN);
  void PrintOut_S29370 (WOS29370_TYPE *OUT);
#if defined( __cplusplus )
}
#endif

/* ----------------------------------------------- */ 
/* Methodes Utilisees pour la Generation des Stubs */ 
/* ----------------------------------------------- */ 
#if defined( __cplusplus )
  extern char * S29370S( char *const Buffer_In, char *Buffer_Length, 
			   long *Error_Code );
  extern void DecodeIN_S29370( char *in, WIS29370_TYPE *IN, int Longu);
  extern void EncodeOUT_S29370( char *out, WOS29370_TYPE *OUT );
  extern void InitOut_S29370( WOS29370_TYPE *OUT );
#endif

#endif
