#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>


typedef struct ST_TST {
        int i;
	char *str;
} St_Tst;



/*
 *
 fonction membre/amis
   Le calcul d'adresse ne peut être effectué sur un pointeur générique. Il faut donc un pointeur sur une variable dont l'espace de stockage soit le byte (-> type char), la plus petite unité adressable par un programme en langage C.
Ainsi on pourra se déplacer de i*size bytes pour pouvoir pointer vers la i-ème case du tableau que l'on veut parcourir.
*/


// --------------------------------

// Les types n'étant pas définies on ne peut afficher que les adresse
void parcoursAddr(void * data , size_t nb_elt , size_t size ) {
  size_t i;
  for( i = 0 ; i < nb_elt ; ++i )
      printf("%p\n", ((char *)data) + (i * size) );
}

// --------------------------------

// Il faut utiliser un pointeur de fonction pour afficher les éléments d'un tableau.

// Utilisé pour l'affichage d'un tableau de 'double'
void affStruct(const void *pva) {
   St_Tst *pa = (St_Tst*) pva; // conversion de type
   printf("=> %p -> %i\n",*pa, (*pa).i);
}

int compStruct(const void * pva, const void *pvb) {
   St_Tst *pa = (St_Tst*) pva; // conversion de type
   St_Tst *pb = (St_Tst*) pvb; // conversion de type
   if((*pa).i>(*pb).i) return 0;
   else return 1;
}


// Utilisé pour l'affichage d'un tableau de 'double'
void affd(const void *pva) {
   double *pa = (double*) pva; // conversion de type
   printf("%f\n",*pa);
}

// Utilisé pour l'affichage d'un tableau de 'int'
void affi(const void *pva) {
   int *pa = (int*)pva; // conversion de type
   printf("%d\n",*pa);
}

// Parcours d'un tableau
void parcoursGene( void * data , size_t nb_elt , size_t size , void (*fct)(const void*)) {
  size_t i;
  for( i = 0 ; i < nb_elt ; ++i )
    fct( ((char *)data) + (i * size) );
}

// Critère l'ordonnancement
int compard(const void * pva, const void *pvb) {
   double *pa = (double*) pva; // conversion de type
   double *pb = (double*) pvb; // conversion de type
   if(*pa>*pb) return 0;
   else return 1;
}

void TstStStr(void) {
	int i = 0;

	St_Tst *stTst = (St_Tst*) malloc(5 * sizeof(St_Tst));

	stTst[0].str = (char*) malloc(10);
	strcpy(stTst[0].str, "AAAAAA");

	stTst[1].str = (char*) malloc(10);
	strcpy(stTst[1].str, "CCCCCC");

	stTst[2].str = (char*) malloc(10);
	strcpy(stTst[2].str, "AAAAAA");

	stTst[3].str = (char*) malloc(10);
	strcpy(stTst[3].str, "CCCCCC");

	stTst[4].str = (char*) malloc(10);
	strcpy(stTst[4].str, "AAAAAA");

	qsort(stTst, 5, sizeof(*stTst), compStChar);

	printf(">%s\n", stTst[0].str);
	for (i = 1; i < 5; ++i) {
		if (strcmp(stTst[i].str, stTst[i-1].str) != 0) {
			printf(">%s\n", stTst[i].str);
		};
	}

	for (i = 0; i < 5; ++i) {
		free(stTst[i].str);
	}

	free(stTst);
}

// --------------------------------

int main ( void ) {

    int tabi[5] = {1,2,3,4,5};
    double tabvd[5] = {1.23,2.34,3.45,4.56,5.67};
    double *tabd = new double[5]; // test sur un tableau de qsort sur variable
    for(char c=0; c<5; ++c) tabd[c] = tabvd[c];


	St_Tst *stTst = new St_Tst[5]; // test sur un tableau de qsort sur variable
	stTst[0].i=35; stTst[1].i=5; stTst[2].i=12; stTst[3].i=45; stTst[4].i=52;

    for(short i=0; i<5; ++i) {  printf(">%i\n", stTst[i].i);  }
	qsort(stTst, 5, sizeof(*stTst), compStruct);
	parcoursGene(stTst, 5, sizeof(*stTst), affStruct);

	delete [] stTst;




    printf("\nParcour du tableau de 'int' (affichage des adresses)\n");
    parcoursAddr(tabi, sizeof(tabi)/sizeof(*tabi), sizeof(*tabi));

    printf("\nParcour du tableau de 'int'\n");
    parcoursGene(tabi, sizeof(tabi)/sizeof(*tabi), sizeof(*tabi), affi);




    printf("\nParcour du tableau de 'double'\n");
    parcoursGene(tabd, sizeof(tabi)/sizeof(*tabi), sizeof(*tabd), affd);

    printf("\nParcour du tableau variable de 'double' dans l'ordre inverse %d elements\n", sizeof(tabi)/sizeof(*tabi));
    qsort(tabd, sizeof(tabi)/sizeof(*tabi), sizeof(*tabd), compard);
    parcoursGene(tabd, sizeof(tabi)/sizeof(*tabi), sizeof(*tabd), affd);

    delete [] tabd;

//	 free(stTst);


   return EXIT_SUCCESS;
}

