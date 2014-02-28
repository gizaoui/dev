

//_________________________ LISTE _________________________
struct Lst {

    private:
        Lst	*prev, *next;

    public:
        Lst(){cout<<"CONSTR. Lst"<<endl; };
        virtual ~Lst(){
            cout<<"DESTR. Lst"<<endl;
        };

        Lst(const Lst & c) { cerr<<"APPEL DU CONST. PAR RECOPIE"<<endl; exit(1); };

        // ACCESSEURS
        void Set_Prev(Lst* pKey){ prev=pKey; }
        void Set_Next(Lst* pKey){ next=pKey; }
        Lst* Get_Prev(){ return prev; }
        Lst* Get_Next(){ return next; }

        // AJOUT EN TETE DE LISTE
        Lst** Push_front(Lst** ftltInst) {
            if(ftltInst[0]==NULL)
                Push_back(ftltInst);
            else {
                Set_Prev(NULL);
                Set_Next(ftltInst[0]);
                ftltInst[0]->Set_Prev(this);
                ftltInst[0]=this;
            }
            return ftltInst;
        }

        // AJOUT EN FIN DE LISTE
        Lst** Push_back(Lst** ftltInst) {

            if(ftltInst[0]==NULL){
                Set_Prev(NULL);
                Set_Next(NULL);
                ftltInst[0]=this;
                ftltInst[1]=this;
            }
            else {
                Lst* wk=ftltInst[1];
                wk->Set_Next(this);
                wk=wk->Get_Next();
                wk->Set_Prev(ftltInst[1]);
                wk->Set_Next(NULL);
                ftltInst[1]=wk ;
            }
            return ftltInst;
        }


        // EXTRACTION D'UNE INSTANCE DE LA LISTE
        Lst** Extract(Lst** FtLt){

            Lst *wk;

            // Liste vide
            if(Get_Prev()==NULL && Get_Next()==NULL) {
                FtLt[0]=NULL; FtLt[1]=NULL;
                return FtLt;
            }

            // Premier élément de la liste
            if(Get_Prev()==NULL && Get_Next()!=NULL ) {
                wk=Get_Next();
                wk->Set_Prev(NULL);
                FtLt[0]=wk;
            }
            // Dernier élément de la liste
            else if(Get_Prev()!=NULL && Get_Next()==NULL ) {
                wk=Get_Prev();
                wk->Set_Next(NULL);
                FtLt[1]=wk;
            }
            // Située entre deux éléments
            else {
                wk=Get_Prev();
                wk->Set_Next(Get_Next());
                wk=Get_Next();
                wk->Set_Prev(Get_Prev());
            }
            return FtLt;
        }


};



