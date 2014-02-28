#include <stdio.h>
#include <stdlib.h>

int main ( void ) {

    void * ptr = NULL;
    int a = 2;

    ptr = &a;
    printf("%p\n------------------------------------------\n",ptr);

    int A = 15;
    int B = 2;

    int &r = A; // Créé une référence sur A
    int &r3 = A; // Créé une référence sur A

    r = 16;
    printf("A (int &r=A; r=16;): %d\n", A); // A (int &r=A; r=16;): 16

	r3 = 18;
    printf("A (int &r3=A; r3=18;): %d\n", A); // A (int &r3=A; r3=18;): 18

	A = 15;
	printf("A=15 => r=%d, r3=%d\n", r, r3); // A=15 => r=15, r3=15

	// ---------------------------------

    int* const r2 = &A; // r2 référence la valeur de A
                        // =>  int* p; r2=p; IMPOSSIBLE + OBLIGATION D'INITIALISER 'r2'
    *r2 = 17;
    printf("A (int *r2=&A; *r2=17;): %d\n", A);


    int *p = &B; // Créé un pointeur sur B
    *p = 12; // Change la valeur de la variable pointé
    printf("B (int *p=&B; *p=12;): %d\n", B);

    *p = r; // Créé un pointeur sur r=17
    printf("A (int &r=A; int* const r2=&A; *r2=17; *p=r;): %d\n", *p); // A (int &r=A; int* const r2=&A; *r2=17; *p=r;) : 17


    const int * cp; // Impossibilité de changer la valeur de la variable pointée
    cp = &A; // Pointe sur A
    // => *cp=45; // ERREUR



    return EXIT_SUCCESS;
}

