
#define TRACEMSG(trace) std::cout<<trace<<std::endl;
#define ERRMSG(trace) std::cout<<trace<<" (file: "<<__FILE__<<"  -  line: "<<__LINE__<<")"<<std::endl;


struct Displ {
    Displ(){};
    virtual ~Displ(){};

    virtual void Display(ostream&){};
    friend ostream & operator << (ostream &os ,Displ &d) {
      d.Display(os);
      return os;
    }
};


struct OutOfIndex {
  unsigned int ui_out;
  OutOfIndex(unsigned int ui_o){ ui_out=ui_o;  }
};


struct ExceptMess {
  const char *c_message;
  unsigned int ui_out;
  ExceptMess(const char* c_mess) { c_message=c_mess;  }
  const char* get_mess() { return c_message; }
};


/*
     TEST
     char c_tst[100];
     strcpy(c_tst, "xxxxtestxxxx");
     char *r =Trim::trim(c_tst, 'x');
     cout<<">"<<r<<"<"<<endl; */
struct Trim {

    static char* Rtrim(char* c_str, const char c_c=' ') {
        char*c_end=c_str+strlen(c_str);
        // Déplacement sur les adresses (pas sur les valeur)
        for(char *c=(c_end-1); c!=(c_str-1) && *c==c_c;--c) *c='\0';
        return c_str;
    }

    // Nécessité d'utiliser une pointeur lors de l'appel sur la valeur de retour
    // (on ne fait qu'un déplacement d'adresse)
    // -> char *c_line = Trim::Ltrim(spLine[us_line]);
    static char* Ltrim(char* c_str, const char c_c=' ') {
       char *c_end=c_str+strlen(c_str);
       // Déplacement sur les adresses
       for(char *c=c_str; c!=c_end && *c==c_c;++c) ++c_str;
       return c_str;
    }

    // Idem que ci-dessus
    static char* trim(char* c_str, const char c_c=' ') {
       return Trim::Ltrim(Trim::Rtrim(c_str,c_c),c_c);
    }
};


struct Split {

  private:
    char *c__split,
	 **c_split;
    unsigned short us_nbSplit;
    unsigned long ul_szLine;

  public:
   /* SPLIT DE LA CHAINE DE CARATERE SELON LE SEPARATEUR 'c_sep'
      /!\ Peut être remplacé par un simple 'strtok'

      char str[]="now#is the time for all#good men to come to the#aid of their country";
      char delims[] = "#";
      char *result = NULL;
      result=strtok(str,delims); // /!\ remplace les caract. '#' par de `0` -> modif. de la chaîne initiale
      while(result!=NULL) {
         printf( "result is \"%s\"\n", result );
         result = strtok(NULL, delims);
      } */
    Split(char* c_str, const char c_sep, const unsigned short us_max=0):c__split(c_str) {

       c_split=NULL;
       ul_szLine=strlen(c__split);

       // Split
       us_nbSplit=0;
       unsigned short us_nbc=0, us_pos=0, us_incElem=0;
       char *c_end=c__split+strlen(c__split);
       for(char *chr=c__split; chr!=c_end; ++chr) {
         if(*chr=='\r') *chr=' '; // normalement suivie un '\n' -> RTrim (NEVER WINDOWS)
         if(*chr==c_sep)++us_nbSplit;
       }

       us_nbSplit=(us_max==0 || us_max>us_nbSplit?us_nbSplit:us_max);

       // On re-créé la poudre histoire de se faire plaisir !!!
       c_split=new char*[us_nbSplit+1];
       c_split[0]=&c__split[0]; // point sur chaque départ de chaîne de caractères
       for(char *chr=c__split; chr!=c_end; ++chr) {
          if(*chr!=c_sep)++us_nbc;
          else {
            us_pos=us_pos+us_nbc+1;
            if(us_incElem<us_nbSplit){
		c_split[us_incElem+1]=&c__split[us_pos]; // point sur chaque départ de chaîne de caractères
		c__split[us_pos-1]='\0';
		us_incElem++;
            }
            us_nbc=0;
          }
       }
       us_nbSplit++;
    }

    Split():us_nbSplit(0),ul_szLine(0), c_split(NULL) {}
    ~Split()  { free(); }
    Split(const Split &s) {}


    // RENVOI LE NBRE D'ELEMENTS OBTENU
    unsigned short Get_Count() const { return us_nbSplit; }

    // LIBERE LE TABLEAU DE POINTEURS
    void free() {
       us_nbSplit=0;
       ul_szLine=0;
       if(c_split!=NULL) {
         delete [] c_split;
         c_split=NULL;
       }
    }

    // RECUPERATION DES ELEMENTS SELON UN INDEXE
    char* operator[] (const unsigned short us_id) const {
       if(us_id>=us_nbSplit){ OutOfIndex out(us_nbSplit-1); throw out; }
       return c_split[us_id];
    }

};


