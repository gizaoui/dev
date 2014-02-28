#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string.h>
#include <poll.h>
#include <stdlib.h>

using namespace std;

#include "sort.h"


// ENREGISTREMENT ET DECODAGE DE LA CHAINE

#define INIT(lst) \
    Lst *fp##lst=NULL, *lp##lst=NULL, *p##lst=NULL;


/* Equivalent à (ds la main) :
   Lst *ftlt[]={fpTstLst, lpTstLst}, **ret; // utilisé ds le '#define'
   ret=(new TstLst((char*)comb[i]))->Push_back(ftlt);
   fpTstLst=(TstLst*)ret[0];11 lpTstLst=(TstLst*)ret[1];*/
#define PUSHBACK(chr,lst) \
    Lst *ftlt[]={fp##lst, lp##lst}, **ret; \
ret=(p##lst=new lst(chr))->Push_back(ftlt); \
fp##lst=(lst*)ret[0]; lp##lst=(lst*)ret[1];




// DESTRUCTION DES LISTES
#define ERASE(lst) \
    Lst *wk=fp##lst; \
while(wk!=NULL) { \
    Lst *ftlt[]={fp##lst, lp##lst}, *wkdel=wk; \
    wk=wk->Get_Next(); \
    Lst **ret=wkdel->Extract(ftlt); \
    fp##lst=(lst*)ret[0]; lp##lst=(lst*)ret[1]; \
    delete ((lst*)wkdel); \
}




// Implémentation de la classe TstLst d'une liste doublement chaînée
struct TstLst:Lst {

   char c_str[30];

    TstLst() {cout<<"CONSTR. TstLst"<<endl; }

   // Constructeur : se que j'insert ds la liste
   TstLst(char* c_s) {
        strcpy(c_str, c_s);
    }

   ~TstLst(){
        cout<<"DESTR TstLst"<<endl;
    };

   // Récupération de la chaîne
   char* get_str() { return ((TstLst*)this)->c_str; }

};

struct  Test
{
public:
    Test()
    {
        cout  <<  "Test  :  ctor\r\n";
    }
    ~Test()
    {
        cout  <<  "Test  :  dtor\r\n";
    }
    void Hello()
    {
        cout  <<  "Test  :  Hello  World\r\n";
    }
};
//_______________________________________________________________________________


const char aph[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

#define tab 1


int main () {

    INIT(TstLst); // Initialisation des 3 pointeurs (premier, dernier et courant)


    char comb[tab][4];
    int i=0;
    bool exit=false;

    // Génération de 100 chaînes de 3 caractères (#define tab 100, char comb[tab][4])
    char a, b, c;
    for(a=0;a<26 && !exit;a++)
        for(b=0;b<26 && !exit ;b++)
            for(c=0;c<26 && !exit;c++) {

                if(++i>tab) {
                    exit=true;
                    continue;
                }

                comb[i-1][0]=aph[a];
                comb[i-1][1]=aph[b];
                comb[i-1][2]=aph[c];
                comb[i-1][3]='\0';

                cout<<i<<" - "<<comb[i-1]<<endl;

                //  Insertion de 100 chaînes de caractères dans la liste chaînée
                //Lst *ftlt[]={fpTstLst, lpTstLst}, **ret; // utilisé ds le '#define'
                //TstLst * t = (struct TstLst *) malloc(sizeof(struct TstLst));
                //TstLst * t = new TstLst((char*)comb[i-1]);
                // ret=(new TstLst((char*)comb[i-1]))->Push_back(ftlt);
                // fpTstLst=ret[0];
                //lpTstLst=ret[1];

            }



  cout  <<  "1\r\n";
  Test*  t1  =  new  Test();
  t1->Hello();
  delete  t1;


  cout  <<  "2\r\n";
  // Test*  t2  =  (Test*)  malloc(sizeof (Test));
  Test*  t2  = static_cast<Test*>(malloc(sizeof(Test)));
  t2->Hello();
  free(t2);

/*

    Lst *ftlt[]={fpTstLst, lpTstLst}, *wkdel=fpTstLst;
    Lst **ret=wkdel->Extract(ftlt);
    fpTstLst=ret[0];
    lpTstLst=ret[1];
    delete ((TstLst*)wkdel);
*/

    //ERASE(TstLst); // défini ds le '#define'


    return 0;
}

