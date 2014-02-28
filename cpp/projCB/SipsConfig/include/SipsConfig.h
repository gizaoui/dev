
struct Data : Displ{

   private:
	std::string str_sipsCde, 	// Code 'sips' renvoyé à ARIES
		    str_sipsDesc;	// Description du code
   public:
	Data(std::string& str_Cde,std::string& str_Desc):str_sipsCde(str_Cde), str_sipsDesc(str_Desc){}

   	virtual ~Data() {};

    	Data(const Data &d){
            str_sipsCde=d.str_sipsCde;
            str_sipsDesc=d.str_sipsDesc;
        }

	std::string & Get_SipsCde()  { return str_sipsCde; }
	std::string & Get_SipsDesc()  { return str_sipsDesc; }

        void Display(ostream& out){
            out<<"\tsipsCde : "<<str_sipsCde<<endl;
            out<<"\tsipsDesc : "<<str_sipsDesc<<endl;
        };

};


struct Key : Displ {

  public:
     Key(const std::string& str_k, const Data& v):str_key(str_k), /*r(s),*/ s(v) {}
     //const Data& r;
     virtual ~Key(){}
     std::string & Get_Key() { return str_key;}
     Data & Get_Data() { return s; }

     void Display(ostream& out){
        out<<"str_key : "<<str_key<<endl;
        out<<s;
     };


  private:
    Data s; // s = v -> recopie (conservation de l'instance ds le vecteur en sortie de boucle)
    std::string str_key;
};



// Définition du foncteur de tri croissant d'une chaîne de caractère
struct AscByString {
   bool operator ()(Key* n1, Key* n2) {
      return n1->Get_Key() < n2->Get_Key();
   }
};



struct SipsConfig {

   private:
       std::vector<Key*> v_node;
       std::vector<Key*>::iterator itv_node;
       std::map<std::string,Data*> map_sips;

   public:
	SipsConfig(const char*);
   	~SipsConfig();
        SipsConfig(const SipsConfig&) { TRACEMSG("Recopie SipsConfig"); };

        Data * operator[] (const char * c_key) {
           Data * d = map_sips[c_key];
           if(d) return d;
           else { ExceptMess mess("Aucune correspondance pour cette clé") ; throw mess; }
       }

};


