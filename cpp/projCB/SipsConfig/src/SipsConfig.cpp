#include <iostream>
#include <string.h>
#include <fstream>
#include <map>
#include <vector>
#include <algorithm>

using namespace std;

#include "Tools.h"
#include "SipsConfig.h"


// CONSTRUCTEUR
SipsConfig::SipsConfig(const char* c_path)  {

    // RECUPERATION DU CONTENU DU FICHIER DE CONFIG DANS UN BUFFER DIMENSIONNABLE
    // -> non utlisation d'un 'fin.getline( buffer, sizeof( buffer ), '\n' );'
    char *c_file;
    int i_size=0;
    std::ifstream fin(c_path,ios::binary);
    if(fin) {
    	fin.seekg(0,std::ios_base::end);
    	i_size= fin.tellg();
    	fin.seekg(0,std::ios_base::beg);
    	c_file= new char[i_size+1];
    	fin.read(c_file,i_size);
        c_file[i_size]='\0';
    	fin.close();
    }
    else {
       TRACEMSG("Impossible d'ouvrir le fichier "<<c_path<<" en lecture");
       return;
    }

    if(i_size<=0) {
  	TRACEMSG("Le fichier est vide");
        return;
    }


    // EXTRACTION DES DONNEES DU BUFFER
    Split spLine(c_file, '\n', 0);
    for(unsigned short us_line=0; us_line<spLine.Get_Count();++us_line)
        try {
           char *c_line = Trim::trim(spLine[us_line]); std::string str_line(c_line);

           if(c_line[0]!='#' && strlen(c_line)>0) {

	        Split spCol(c_line,';',0);

	        if(spCol.Get_Count()!=3) { // Nbre de champs incorrecte
	           TRACEMSG("champs invalide ligne : "<<us_line+1<<" ("<<str_line<<")");
	           spCol.free();

	        } else {

                  try {

                     char *c_allKey = Trim::trim(spCol[1]);std::string str_allKey(c_allKey);
                     char *c_sipsCde = Trim::trim(spCol[0]);std::string str_sipsCde(c_sipsCde);  // Code 'sips' renvoyé à ARIES
                     char *c_sipsDesc = Trim::trim(spCol[2]);std::string str_sipsDesc(c_sipsDesc); // Description du code
	             spCol.free();

                     // Capture de données 'sips'
                     Data dat(str_sipsCde, str_sipsDesc);

                     if(strlen(c_allKey)>0) {
                       Split spKey(c_allKey,',',0);
                       for(unsigned short us_key=0; us_key<spKey.Get_Count();++us_key)
                         try {
                             char *c_key=Trim::trim(spKey[us_key]); std::string str_key(c_key);

                             // Consigne de l'instance (Key - Values) dans un vecteur
                             if(strlen(c_key)>0) v_node.push_back(new Key(str_key, dat));
                             else TRACEMSG("Clé absente : "<<us_line+1<<" ("<<str_line<<")");
                          } // for ...
                          catch (OutOfIndex o) { ERRMSG(".Dépassement d'index (max. = : "<<o.ui_out<<")"); }
                        } // if(strlen(c_allKey)>0) ...
                        else
                            TRACEMSG("Clé absente : "<<us_line+1<<" ("<<str_line<<")");
                  }
                  catch (OutOfIndex o) { ERRMSG("Dépassement d'index (max. = : "<<o.ui_out<<")"); }

              }

          } // if(c_line[0]!='#' && strlen(c_line)>0) ...

        }
        catch (OutOfIndex o) { ERRMSG("Dépassement d'index (max. = : "<<o.ui_out<<")"); }

    delete [] c_file;

    Key *wkPrev=NULL;
    std::sort(v_node.begin(), v_node.end(), AscByString());
    for(itv_node=v_node.begin();itv_node!=v_node.end();++itv_node){

        if(wkPrev==NULL){
            map_sips[(*itv_node)->Get_Key()]=&((*itv_node)->Get_Data());
	    wkPrev=(*itv_node);
	    continue;
        }

        if((*itv_node)->Get_Key()==wkPrev->Get_Key()) {
            TRACEMSG("WARNING doublon sur v_node : "<<(*itv_node)->Get_Key().c_str());
            delete (*itv_node); // delete de l'instance 'data'
        }
        else {
            map_sips[(*itv_node)->Get_Key()]=&((*itv_node)->Get_Data());
            wkPrev=(*itv_node);
        }

    } // for


}



SipsConfig::~SipsConfig() {

    // Destruction du container sequentiel 'vector'
    while(v_node.size()>0){
       TRACEMSG(*(*v_node.begin()));
       delete (*v_node.begin()); // Only for the 'Memory leak' test with cmd 'valgrind --leak-check=yes exe/main' (REMOVE LINE)
       v_node.erase(v_node.begin());
    }

/* Data * d = map_sips["22377toto"];
   if(d) cout<<"d->Get_SipsDesc() : "<< d->Get_SipsDesc()<<endl;
   else cout<<"Aucune correspondance pour cette clé"<<endl;  */

   // Only for the 'Memory leak' test with cmd 'valgrind --leak-check=yes exe/main'
   while(map_sips.size()>0) { map_sips.erase(map_sips.begin()); }
}





//-------------------------------------------[ main ]-------------------------------------------


/*
int main(int argc,char **argv) {

   SipsConfig c("./ConvAmadeusSipsCde.txt");

   return 0;
}
*/
