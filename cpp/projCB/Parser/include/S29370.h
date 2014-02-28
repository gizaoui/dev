/*--------------------------------------------------------/
/                                                         /
/          GENERATION DE LA PROCEDURE C                   /
/                                                         /
/          SERVICE S29370
/          Verify Credit Card
/                                                         /
/          GEDISA 2000 Version 1.0 du 3 aout 2001        /
/---------------------------------------------------------/
/          Fichier S29370.h
/ 
/          genere le 12/07/2006 18:53:29
/--------------------------------------------------------*/

#ifndef S29370_H
#define S29370_H


/*---------------------- DEFINE -----------------------*/

#define S29370_L_USERID                       9
#define S29370_L_PWD                          9
#define S29370_L_QALPWD                       4
#define S29370_L_KEYCRYPT                     17
#define S29370_L_NEWPWD                       9
#define S29370_L_ROLE                         21
#define S29370_L_POINTOFSALE                  10
#define S29370_L_VENDORCODE                   3
#define S29370_L_CARDNUMBER                   20
#define S29370_L_EXPIRYDATE                   7
#define S29370_L_AUTHORIZATIONCODE            9
#define S29370_L_VALIDATINGCARRIER            4
#define S29370_L_CURRENCY                     4
#define S29370_L_AMOUNT                       15
#define S29370_L_ADRESSCODE                   21
#define S29370_L_ZIPCODE                      10
#define S29370_L_RESULTCODE                   2
#define S29370_L_TYPE                         5
#define S29370_L_ID                           16
#define S29370_L_REJECTCODE                   6
#define S29370_L_SECURITYID                   5
#define S29370_L_NUMERROR                     6
#define S29370_L_LIBERROR                     65
#define S29370_L_ERRORCODE                    6
#define S29370_L_ERRORTYPE                    2
#define S29370_MAX_FREETEXTTYPE               10
#define S29370_L_TEXT                         71
#define S29370_L_NUMBER                       13
#define S29370_L_AUTHORIZINDIC                2
#define S29370_L_POINTOFSERVICE               3
#define S29370_L_TRANSACIDENTIFIER            16
#define S29370_L_STIPREASON                   2
#define S29370_L_VALIDATIONCODE               5
#define S29370_L_CURRENCYINFO                 6
#define S29370_L_RATE                         11
#define S29370_L_ORIGINALDATA                 43
#define S29370_L_REPLACEAMOUNT                13

/*--------------------FIN DU DEFINE -------------------*/



/*-------------------------------------------------------
/               Structure en entree
/------------------------------------------------------*/


#ifndef IS29370_CcInfo_Type
#define IS29370_CcInfo_Type
typedef struct {
     char VendorCode[S29370_L_VENDORCODE];                   /*Code_du_fournisseur_(VI__CA__AX...)*/
     char CardNumber[S29370_L_CARDNUMBER];                   /*Numero_de_carte*/
     char ExpiryDate[S29370_L_EXPIRYDATE];                   /*Date_d_expiration_de_la_carte_(MMYY)*/
     char AuthorizationCode[S29370_L_AUTHORIZATIONCODE];     /*Code_d_autorisation*/
     char ValidatingCarrier[S29370_L_VALIDATINGCARRIER];     /*Code_Compagnie*/
} WIS29370_CcInfo_Type;                                      /* CcInfo */
#endif

#ifndef IS29370_PriceInfo_Type
#define IS29370_PriceInfo_Type
typedef struct {
     char Currency[S29370_L_CURRENCY];                       /*Code_monnaie*/
     char Amount[S29370_L_AMOUNT];                           /*Montant_de_la_transaction*/
} WIS29370_PriceInfo_Type;                                   /* PriceInfo */
#endif

#ifndef IS29370_AvsInfo_Type
#define IS29370_AvsInfo_Type
typedef struct {
     char AdressCode[S29370_L_ADRESSCODE];                   /*Adresse*/
     char ZipCode[S29370_L_ZIPCODE];                         /*Zip_Code*/
     char ResultCode[S29370_L_RESULTCODE];                   /*AVS_Code*/
} WIS29370_AvsInfo_Type;                                     /* AvsInfo */
#endif

#ifndef IS29370_MerchantInfo_Type
#define IS29370_MerchantInfo_Type
typedef struct {
     char Type[S29370_L_TYPE];                               /*Type_marchand*/
     char Id[S29370_L_ID];                                   /*Id_marchand*/
} WIS29370_MerchantInfo_Type;                                /* MerchandInfo */
#endif

#ifndef IS29370_Habilitation_Type
#define IS29370_Habilitation_Type
typedef struct {
     char UserId[S29370_L_USERID];                           /*Identifiant_du_solliciteur*/
     char Pwd[S29370_L_PWD];                                 /*Mot_de_Passe*/
     char QalPwd[S29370_L_QALPWD];                           /*Qualifieur_de_mot_de_passe*/
     char KeyCrypt[S29370_L_KEYCRYPT];                       /*Cle_de_cryptage*/
     char NewPwd[S29370_L_NEWPWD];                           /*Nouveau_Mdp*/
     char Role[S29370_L_ROLE];                               /*Role*/
} WIS29370_Habilitation_Type;                                /* Habilitation */
#endif

#ifndef IS29370_CommonCcData_Type
#define IS29370_CommonCcData_Type
typedef struct {
     WIS29370_CcInfo_Type CcInfo;                            /* CcInfo*/
     WIS29370_PriceInfo_Type PriceInfo;                      /* PriceInfo*/
     WIS29370_AvsInfo_Type AvsInfo;                          /* AvsInfo*/
     WIS29370_MerchantInfo_Type MerchantInfo;                /* MerchandInfo*/
     char RejectCode[S29370_L_REJECTCODE];                   /*Code_rejet*/
} WIS29370_CommonCcData_Type;                                /* CommonCcDataIn */
#endif

#ifndef IS29370_HiddenDataType_Type
#define IS29370_HiddenDataType_Type
typedef struct {
     char SecurityId[S29370_L_SECURITYID];                   /*Code_cryptogramme*/
} WIS29370_HiddenDataType_Type;                              /* HiddenData */
#endif

#ifndef IS29370_Type
#define IS29370_Type
typedef struct {
     WIS29370_Habilitation_Type Habilitation;                /*Habilitation*/
     char PointOfSale[S29370_L_POINTOFSALE];                  /*Point_de_vente*/
     WIS29370_CommonCcData_Type CommonCcData;                /*CommonCcDataIn*/
     WIS29370_HiddenDataType_Type HiddenDataType;            /*HiddenData*/
     char end;
} WIS29370_TYPE;                                             /* structure IN */
#endif

/*-------------------------------------------------------
/     Structure en Sortie
/------------------------------------------------------*/


#ifndef OS29370_FreeTextType_Type
#define OS29370_FreeTextType_Type
typedef struct {
     char Text[S29370_L_TEXT];                               /*Texte*/
} WOS29370_FreeTextType_Type;                                /*Texte*/
#endif

#ifndef OS29370_CcInfoType_Type
#define OS29370_CcInfoType_Type
typedef struct {
     char VendorCode[S29370_L_VENDORCODE];                   /*Code_du_fournisseur_(VI__CA__AX...)*/
     char CardNumber[S29370_L_CARDNUMBER];                   /*Numero_de_carte*/
     char ExpiryDate[S29370_L_EXPIRYDATE];                   /*Date_d_expiration_de_la_carte_(MMYY)*/
     char AuthorizationCode[S29370_L_AUTHORIZATIONCODE];     /*Code_d_autorisation*/
     char ValidatingCarrier[S29370_L_VALIDATINGCARRIER];     /*Code_Compagnie*/
} WOS29370_CcInfoType_Type;                                  /*CcInfo*/
#endif

#ifndef OS29370_PriceInfo_Type
#define OS29370_PriceInfo_Type
typedef struct {
     char Currency[S29370_L_CURRENCY];                       /*Code_monnaie*/
     char Amount[S29370_L_AMOUNT];                           /*Montant_de_la_transaction*/
} WOS29370_PriceInfo_Type;                                   /*PriceInfo*/
#endif

#ifndef OS29370_AvsInfo_Type
#define OS29370_AvsInfo_Type
typedef struct {
     char AdressCode[S29370_L_ADRESSCODE];                   /*Adresse*/
     char ZipCode[S29370_L_ZIPCODE];                         /*Zip_Code*/
     char ResultCode[S29370_L_RESULTCODE];                   /*AVS_Code*/
} WOS29370_AvsInfo_Type;                                     /*AvsInfo*/
#endif

#ifndef OS29370_MerchantInfo_Type
#define OS29370_MerchantInfo_Type
typedef struct {
     char Type[S29370_L_TYPE];                               /*Type_marchand*/
     char Id[S29370_L_ID];                                   /*Id_marchand*/
} WOS29370_MerchantInfo_Type;                                /*MerchandInfo*/
#endif

#ifndef OS29370_MsgRef_Type
#define OS29370_MsgRef_Type
typedef struct {
     char Number[S29370_L_NUMBER];                           /*Reference*/
     char AuthorizIndic[S29370_L_AUTHORIZINDIC];             /*Indicateur_d_autorisation*/
     char PointOfService[S29370_L_POINTOFSERVICE];           /*Point_de_services*/
} WOS29370_MsgRef_Type;                                      /*MsgRef*/
#endif

#ifndef OS29370_RespIdentification_Type
#define OS29370_RespIdentification_Type
typedef struct {
     char TransacIdentifier[S29370_L_TRANSACIDENTIFIER];     /*Identifiant_de_la_transaction*/
     char StipReason[S29370_L_STIPREASON];                   /*Entite_repondante*/
     char ValidationCode[S29370_L_VALIDATIONCODE];           /*Code_de_validation*/
} WOS29370_RespIdentification_Type;                          /*RespIdentification*/
#endif

#ifndef OS29370_CardBilligInfo_Type
#define OS29370_CardBilligInfo_Type
typedef struct {
     char Currencyinfo[S29370_L_CURRENCYINFO];               /*Code_monnaie_de_la_transaction*/
     char Amount[S29370_L_AMOUNT];                           /*Montant_de_la_transaction*/
     char Rate[S29370_L_RATE];                               /*Taux_de_la_transaction*/
} WOS29370_CardBilligInfo_Type;                              /*CardBillingInfo*/
#endif

#ifndef OS29370_ReversalInfo_Type
#define OS29370_ReversalInfo_Type
typedef struct {
     char OriginalData[S29370_L_ORIGINALDATA];               /*Original_Data_Element*/
     char ReplaceAmount[S29370_L_REPLACEAMOUNT];             /*Montant*/
} WOS29370_ReversalInfo_Type;                                /*ReservalInfo*/
#endif

#ifndef OS29370_Exception_Type
#define OS29370_Exception_Type
typedef struct {
     char NumError[S29370_L_NUMERROR];                       /*Numero_Erreur*/
     char LibError[S29370_L_LIBERROR];                       /*Libelle_Erreur*/
} WOS29370_Exception_Type;                                   /*Exception*/
#endif

#ifndef OS29370_ErrorInfoType_Type
#define OS29370_ErrorInfoType_Type
typedef struct {
     char ErrorCode[S29370_L_ERRORCODE];                     /*Code_erreur*/
     char ErrorType[S29370_L_ERRORTYPE];                     /*Type_Erreur*/
     WOS29370_FreeTextType_Type FreeTextType[S29370_MAX_FREETEXTTYPE]; /*Texte*/
} WOS29370_ErrorInfoType_Type;                               /*InfoOrWarning*/
#endif

#ifndef OS29370_CommonCcData_Type
#define OS29370_CommonCcData_Type
typedef struct {
     WOS29370_CcInfoType_Type CcInfoType;                    /*CcInfo*/
     WOS29370_PriceInfo_Type PriceInfo;                      /*PriceInfo*/
     WOS29370_AvsInfo_Type AvsInfo;                          /*AvsInfo*/
     WOS29370_MerchantInfo_Type MerchantInfo;                /*MerchandInfo*/
     char RejectCode[S29370_L_REJECTCODE];                   /*Code_rejet*/
} WOS29370_CommonCcData_Type;                                /*CommonCcDataOut*/
#endif

#ifndef OS29370_VisaInfo_Type
#define OS29370_VisaInfo_Type
typedef struct {
     WOS29370_MsgRef_Type MsgRef;                            /*MsgRef*/
     WOS29370_RespIdentification_Type RespIdentification;    /*RespIdentification*/
     WOS29370_CardBilligInfo_Type CardBilligInfo;            /*CardBillingInfo*/
     WOS29370_ReversalInfo_Type ReversalInfo;                /*ReservalInfo*/
} WOS29370_VisaInfo_Type;                                    /*VisaInfo*/
#endif

#ifndef OS29370_FreeText_Type
#define OS29370_FreeText_Type
typedef struct {
     char Text[S29370_L_TEXT];                               /*Texte*/
} WOS29370_FreeText_Type;                                    /*SecurityIdResponse*/
#endif

#ifndef OS29370_Type
#define OS29370_Type
typedef struct {
     WOS29370_Exception_Type Exception;                      /* Exception*/
     WOS29370_ErrorInfoType_Type ErrorInfoType;              /* InfoOrWarning*/
     WOS29370_CommonCcData_Type CommonCcData;                /* CommonCcDataOut*/
     WOS29370_VisaInfo_Type VisaInfo;                        /* VisaInfo*/
     WOS29370_FreeText_Type FreeText;                        /* SecurityIdResponse*/
     char end;
} WOS29370_TYPE;                                              /* structure OUT */
#endif


#endif
