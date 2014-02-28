// Le bon vieux malloc des familles

#include <malloc.h>
#include <string.h>
#include <stdio.h>
#include <stdlib.h>


void Solution1() {

  int n=3, p=20;
  char (*tab) [p];
  tab=(char(*)[p])malloc(n*p*sizeof(char));

  printf("\n");
  for(int i=0;i<n;++i) sprintf(tab[i],"Solution1_%d\0",i);
  for(int i=0;i<n;++i) printf("%s\n",tab[i]);

  free(tab);
}


void Solution2() {

  int n=3, p=20;
  char **tab, *tab_;
  tab_=(char*)malloc(n*p*sizeof(char));
  tab=(char**)malloc(n*sizeof(char*));
  for(int i=0; i<n; ++i) tab[i]=&tab_[i*p];

  printf("\n");
  for(int i=0;i<n;++i) sprintf(tab[i],"Solution2_%d\0",i);
  for(int i=0;i<n;++i) printf("%s\n",tab[i]);

  free(tab);
  free(tab_);
}



void Solution3() {

    typedef struct ST_TST {
        char str[21];
    } St_Tst;

    St_Tst *stTst;

    for(short i=0; i<10; ++i) {
        if(i==0) stTst = (St_Tst*) calloc (1, sizeof(St_Tst) );
        else stTst = (St_Tst*) realloc (stTst, (i+1) * sizeof(St_Tst) );
        if (stTst!=NULL) { sprintf(stTst[i].str, "Enrg %d\0", i); }
    }

    for(short i=0; i<10; ++i) {  printf(">%s\n", stTst[i].str);  }

    free(stTst);
}


int compard(const void * pva, const void *pvb) {
   double *pa = (double*) pva; // conversion de type
   double *pb = (double*) pvb; // conversion de type
   if(*pa>*pb) return 0;
   else return 1;
}


void Solution4() {

    double tabvd[5] = {1.23,2.34,3.45,4.56,5.67};
   //  double *tabd = new double[5]; // test sur un tableau de qsort sur variable
    double *tabd = (double *) malloc(5 * sizeof(double));

    for(char c=0; c<5; ++c) tabd[c] = tabvd[c];

    qsort(tabd, sizeof(tabvd)/sizeof(*tabvd), sizeof(*tabd), compard);

    for(char c=0; c<5; ++c) {
        printf(">%f\n", tabd[c]);
    }

    free(tabd);

}


int main(int argc, char ** argv) {
  // Solution1();
  // Solution2();
  // Solution3();
   Solution4();

  return 0;
}

