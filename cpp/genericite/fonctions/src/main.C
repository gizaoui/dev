#include <stdio.h>


typedef short (*callback_t)(int);

short tst_callback_t(int a){ return a + 1;}

typedef int (*pointeur_fonction)(int, int);

int somme(int a, int b) { return a + b;  }

int produit(int a, int b)  { return a * b; }

int (*quelle_fonction(char c))(int, int) {
    if (c == '+') return somme;
    else return produit;
}

int calculer(int (*f)(int, int), int a, int b) {
    return (*f)(a,b);
}


int main(void) {

    int (*ptr_fonc)(int, int); // fonctions prenant 2 'int' en entrées et un 'int' en sortie  (sans typedef)
    ptr_fonc = somme;
    printf("somme : %d\n", ptr_fonc(4,5));


    pointeur_fonction ptr_f; // Idem que ci-dessus via un typedef
    ptr_f = produit;
    printf("produit : %d\n", ptr_f(4,5));

    printf("%d\n", calculer(somme, 6, 7));
    printf("%d\n", calculer(produit, 6, 7));

    pointeur_fonction tab_fonc[2] = {somme, produit}; // Recense les fonctions dans un tableau ( équivalent à : 'int (*pointeur_fonction)(int, int) tab_fonc[2] = {somme, produit}' )
    printf("%d\n", tab_fonc[0](100,45));

    printf("%d\n", (quelle_fonction('*'))(32,6));

    callback_t fn_ptr;
    fn_ptr=tst_callback_t;
    printf("%d\n", fn_ptr(4));

    return 0;
}
