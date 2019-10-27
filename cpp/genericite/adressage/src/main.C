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

    // ---------------------------------
	
    char *r = "RRR";
    char **a = &r;
    char **f = &r;
    char *b = "BBBBBBB";

    r = "AAAAAAA";
    *f = "FFFFFF";

    char *c = (char *)malloc(20);
    sprintf(c, "%s\0", "CCCCCCCCCC");
    char **d = &c;
    char *e = c;
    printf("%s %s %s\n", *a, b, e); // FFFFFF BBBBBBB CCCCCCCCCC
    free(c);
	
// ---------------------------------
	
  char c[3];
  c[0] = 'A';
  c[1] = 'A';
  c[2] = 'A';
  printf("%d\n", sizeof(c));

  unsigned char *b = (unsigned char *)&c;
  int i, j;
  for (i = sizeof(c) - 1; i >= 0; --i) {
    for (j = 7; j >= 0; --j) {
      printf("%u", (b[i] >> (j)) & 1);
    }
    printf(" ");
  }
  printf("\n");
	
 // 01000001 01000001 01000001 

  // ---------------------------------
	
  char str[] = "memmove can be very useful......";
  printf("Les %d premiers caractères de la chaîne '%s'\n\
doivent être copiés à partir du premier caractère de la chaîne '%s'\n", 11, str + 15, str + 20);
  printf("\nOn obtient : '%s' -> ", str);
  memmove(str + 20, str + 15, 11);
  printf("'%s'\n", str); // On obtient : 'memmove can be very useful......' -> 'memmove can be very very useful.'

    return EXIT_SUCCESS;
}

