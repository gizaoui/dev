#include <iostream>
#include <string.h>
#include <fstream>
#include <map>
#include <vector>
#include <algorithm>

using namespace std;

#include "Tools.h"
#include "SipsConfig.h"
#include "Parser.h"


Parser::Parser(SipsConfig *c,
               std::string str_xml ) { // recopie de la chaîne

   // Initialisation de structure Adhesion
   memset(&IN, 0, sizeof(WIS29370_TYPE ));
   memset(&OUT, 0, sizeof(WIS29370_TYPE ));

   /////////////////////////////////////////
   //     DECRIPTAGE DE LA CHAINE XML     //
   /////////////////////////////////////////


   // Récup. date & heure
   std::string str_name;
   struct tm *p_tm;
   time_t l_hour;


   // Parse de la chaîne de caractère (XML)
   Split spl((char*)str_xml.c_str(),'"',0);
   char c_init=0;
   for(char c_spl=0; c_spl<spl.Get_Count();++c_spl) // Boucle sur le tableau des attribus obtenus après 'split'
      try {
        for(char c_f=c_init;c_f<c_nbAttrib;++c_f) // Boucle sur les attribus définis dans la table 'c_attrib' ci_dessus
           if(strstr(spl[c_spl], c_attrib[c_f])!=NULL) { // Matching sut les attribus définies dans la table
              std::string str_amount;
	      char c_dec;

	       switch(c_f) {

	         case 0: // name
                    try {
	              str_name.clear();
	              str_name.append(spl[c_spl+1]);
                    }
                    catch (OutOfIndex o) { ERRMSG("index 'case 0' (max. = : "<<o.ui_out<<")"); }
	            break;

	         case 2: // amount
                     try {
                        Trim::Ltrim(spl[c_spl+1],'0');
                        c_dec=strlen(spl[c_spl+1])-2; // Déf. de la position des cents (2 chiffres après le séparateur)

                        // Formatage du 'montant'
                        if(c_dec>0) { // Si somme >= à 1 euros
                          str_amount.append(spl[c_spl+1]);
                          str_amount.insert(c_dec,".");
                        }
                        else if(c_dec==0) { // Somme < 1 euros
                          str_amount.append("0.");
                          str_amount.append(spl[c_spl+1]);
                        }
                        else str_amount.append("0.00");

                        strncpy(IN.CommonCcData.PriceInfo.Amount,str_amount.c_str(),S29370_L_AMOUNT-1); // S29370_L_AMOUNT
                        break;
                     }
                     catch (OutOfIndex o) { ERRMSG("index 'case 2' (max. = : "<<o.ui_out<<")"); }

	        case 3: // origin
	            // 'BACK_PAR' (pour oid 'PARAF011G'), 'BACK_RUN' (pour oid 'RUNAF010J')
                    try { strncpy(IN.Habilitation.UserId,spl[c_spl+1],S29370_L_USERID-1); }
                    catch (OutOfIndex o) { ERRMSG("index 'case 3' (max. = : "<<o.ui_out<<")"); }
	            break;

	        case 4: // cvv_key
                    try { strncpy(IN.HiddenDataType.SecurityId,spl[c_spl+1], S29370_L_SECURITYID-1); } // S29370_L_SECURITYID
                    catch (OutOfIndex o) { ERRMSG("index 'case 4' (max. = : "<<o.ui_out<<")"); }
                    break;

                case 5: // cvv_flag
                   try {
                     if(spl[c_spl+1][0]!='1') // Re-initialise
                       memset(IN.HiddenDataType.SecurityId,'\0',sizeof(IN.HiddenDataType.SecurityId));
                   }
                   catch (OutOfIndex o) { ERRMSG("index 'case 5' (max. = : "<<o.ui_out<<")"); }
                   break;

                case 6: // card_type
                     try { strncpy(IN.CommonCcData.CcInfo.VendorCode,spl[c_spl+1], S29370_L_VENDORCODE-1); } // S29370_L_VENDORCODE
                     catch (OutOfIndex o) { ERRMSG("index 'case 6' (max. = : "<<o.ui_out<<")"); }
                     break;

                  case 7: // card_number
                     try { strncpy(IN.CommonCcData.CcInfo.CardNumber,spl[c_spl+1], S29370_L_CARDNUMBER-1); } // S29370_L_CARDNUMBER
                     catch (OutOfIndex o) { ERRMSG("index 'case 7' (max. = : "<<o.ui_out<<")"); }
                     break;

                  case 9: // card_validity
                     try {
                        char c_month[3], c_year[3]; // Param. d'extraction du mois et de l'année afin d'obtenir le format 'mmyy'
                        memset(c_month,'\0',sizeof(c_month));
                        memset(c_year,'\0',sizeof(c_year));
                        strncpy(c_month,spl[c_spl+1]+4,2); // mois
                        strncpy(c_year,spl[c_spl+1]+2,2);  // année
                        sprintf(IN.CommonCcData.CcInfo.ExpiryDate,"%s%s\0",c_month,c_year); // S29370_L_EXPIRYDATE
                     }
                     catch (OutOfIndex o) { ERRMSG("index 'case 8' (max. = : "<<o.ui_out<<")"); }

                    break;

               }; // switch ...


	      ++c_init; // Repositionnemet a partir de l'élément trouvé dans la tbl 'c_attrib'
	      break; // Sortie de la seconde boucle
           }
      }
      catch (OutOfIndex o) { ERRMSG("Dépassement d'index (max. = : "<<o.ui_out<<")"); }

      // Paramètres de requête à evoyer à Adhesion
      TRACEMSG("name : "<<str_name.c_str()); // author, advice ou cancel
      TRACEMSG("amount : "<<IN.CommonCcData.PriceInfo.Amount);
      TRACEMSG("origin (UserId) : "<<IN.Habilitation.UserId);
      TRACEMSG("cvv_key : "<<IN.HiddenDataType.SecurityId);
      TRACEMSG("card_type : "<<IN.CommonCcData.CcInfo.VendorCode);
      TRACEMSG("card_number : "<<IN.CommonCcData.CcInfo.CardNumber);
      TRACEMSG("card_validity : "<<IN.CommonCcData.CcInfo.ExpiryDate);

      // Affectation des champs 'Transaction_Time' et 'Transaction_Date'
      char c_hour[5], c_date[9];
      (void) time(&l_hour);
      p_tm = gmtime(&l_hour);
      sprintf(c_hour,"%02d%02d\0",p_tm->tm_hour, p_tm->tm_min); // Récup. de l'heure du system : 'HHMM'
      sprintf(c_date,"20%02d%02d%02d",p_tm->tm_year-100, p_tm->tm_mon+1, p_tm->tm_mday);// Récup de la date du system : 'YYYYMMDD'


      // Recherche du type de message (confirmation ou annulation)
      char c_m;
      for(c_m=0; c_m<c_nbMessOK; ++c_m)
        if(strncmp(c_messOK[c_m],str_name.c_str(),MAX_MESSNAME_CHR)==0) break;


      str_response.clear();

      if(c_m < c_nbMessOK) { // CONFIRMATION OU ANNULATION (name = 'advice' ou 'cancel')
            str_response.append("<response><attrib Authorization_ID=\"999999\" Currency_Code=\"\" CVV_Response_Code=\"\" Data=\"\" Error_Message=\"SERVICE OK\" New_Status=\"\" Response_Code=\"");  str_response.append(DEF_SIPS_OKCDE); // Cde Sips si carte autorisé ("00")
            str_response.append("\" Transaction_Time=\""); str_response.append(c_hour);
            str_response.append("\" Transaction_Date=\""); str_response.append(c_date);
            str_response.append("\" Transaction_Certificate=\"\"/></response>");
      }
      else { // author

#ifdef __TST__

      str_response.append("<response><attrib Authorization_ID=\"999999\" Currency_Code=\"EUR\" CVV_Response_Code=\"\" Data=\"\" Error_Message=\"SERVICE OK\" New_Status=\"\" Response_Code=\""); str_response.append(ADH);
      str_response.append("\" Transaction_Time=\""); str_response.append(c_hour);
      str_response.append("\" Transaction_Date=\""); str_response.append(c_date);
      str_response.append("\" Transaction_Certificate=\"\"/></response>");

#else
            TRACEMSG("Appel adh");
            long l_Error_Code=-1; // Appel Adhesion


#ifndef __BOUCHON__

             // Appel du service Adhesion
             S29370( &IN,
		     &OUT,
		     (char*)CALLMODE,
		     (char*)DOM,
		     (char*)FRESHNESS,
		     (char*)RETURNNAME,
		     (char*)REALDATE,
		     (char*)REALHOUR,
		     (char*)CLIENTPROCESSID,
		     (char*)SYSTMEMODE,
		     &l_Error_Code);

#else
              l_Error_Code=0;

              // 6612 : Erreur de sécurité (cde Amadeus)
              strcpy(OUT.Exception.LibError, " 6612 Error sips message - 90 ");
              strcpy(OUT.CommonCcData.CcInfoType.AuthorizationCode,"AuthorizationCode");
              strcpy(OUT.CommonCcData.PriceInfo.Currency,"Currency");
              strcpy(OUT.FreeText.Text,"Text");
#endif
             // Fonctionnement correct du service
             if(l_Error_Code==0){

	       // Extraction du retour Amadeus
	       std::string str_SipsCode, str_SipsDesc,
                           str_libError(OUT.Exception.LibError); // Copy de la chaîne
	       TRACEMSG("OUT.Exception.LibError > "<<OUT.Exception.LibError);

               // Dans ce cas d'une présence d'erreur revoyée par le service Adhesion,
               // (DEF_SIPS_KOCDE=90 : Cde Sips pour carte non autorisé)
               // la chaîne 'OUT.Exception.LibError' contient :
               // - Le numéro d'erreur Sips
               // - Le message d'erreur Sips
               // - Le type d'erreur
               // ex : " 6612 Error message - 90 "
               char *c_pAmadeusErrCde=strstr(OUT.Exception.LibError, DEF_SIPS_KOCDE);

               // présence de l'erreur '90' (carte non autorisé)
	       if(c_pAmadeusErrCde!=NULL){ // Gestion de l'erreur Amadeus

                 // Extraction du cde sips
                 char * c_sipsErr = Trim::Ltrim(OUT.Exception.LibError); // suppression des primiers espaces
	         strstr(c_sipsErr, " ")[0]='\0';

                 // Récupération de la correspondance Sips  (cde Amadeus)
                 try {
                    Data * d = (*c)[c_sipsErr];
                    str_SipsCode.append(d->Get_SipsCde());
                    str_SipsDesc.append(d->Get_SipsDesc());
                 }
                 catch(ExceptMess e) {
                     TRACEMSG(e.get_mess()<<"("<<OUT.Exception.LibError<<")");
                     str_SipsCode.append(DEF_SIPS_KOCDE);
                 }

                 TRACEMSG("Erreur Sips :"<<c_sipsErr<<"-> "<<str_SipsCode.c_str()<<" ("<<str_SipsDesc<<")");
	      }
	      else if(strstr(OUT.Exception.LibError, DEF_SIPS_OKCDE)!=NULL) // présence du "OK"
	         str_SipsCode.append(DEF_SIPS_OKCDE);
	      else
                 str_SipsCode.append(DEF_SIPS_KOCDE);


	      // Construction de la chaîne XML de retour vers ACE
	      str_response.append("<response><attrib Authorization_ID=\"");
	      str_response.append(OUT.CommonCcData.CcInfoType.AuthorizationCode); //<---- Authorization_ID
              str_response.append("\" Currency_Code=\"");
	      str_response.append(OUT.CommonCcData.PriceInfo.Currency); //<-------------- Currency_Code
	      str_response.append("\" CVV_Response_Code=\"");
	      str_response.append(OUT.FreeText.Text); //<-------------------------------- CVV_Response_Code
	      str_response.append("\" Data=\"");
	      str_response.append(""); //<----------------------------------------------------- Data ?
	      str_response.append("\" Error_Message=\"");
	      str_response.append(str_libError.c_str()); //<----------------------------------- Error_Message
	      str_response.append("\" New_Status=\"");
	      str_response.append(""); //<----------------------------------------------------- New_Status ?
	      str_response.append("\" Response_Code=\"");
	      str_response.append(str_SipsCode.c_str()); //<----------------------------------- Response_Code
	      str_response.append("\" Transaction_Time=\"");
	      str_response.append(c_hour); //<------------------------------------------------- Transaction_Time
	      str_response.append("\" Transaction_Date=\"");
	      str_response.append(c_date); //<------------------------------------------------- Transaction_Date
	      str_response.append("\" Transaction_Certificate=\"");
	      str_response.append(""); //<----------------------------------------------------- Transaction_Certificate ?
	      str_response.append("\"/></response>");

	 } // if(l_Error_Code==0) ...



#endif

  } // if(c_m < c_nbMessOK) ...


}


