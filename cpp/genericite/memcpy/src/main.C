#include <stdio.h>
#include <stdlib.h>
#include <string.h>


// Afin d'échanger correctement le contenu des variables, il faut concrètement copier l'espace mémoire qui se situe aux adresses données
// int* const p = &A; // Pointer constant sur variable, ~ int& r = A
//int swap (void *const a, void *const b, size_t size) {
int swap (void *const a, void *const b, size_t size) {


   void *const temp = malloc(size);

   if ( temp == NULL ) return EXIT_FAILURE;

   memcpy(temp, a, size);
   memcpy(a, b, size);
   memcpy(b, temp, size);

   free(temp);

  return EXIT_SUCCESS;
}


int main ( void ) {

   int a = 3;
   int b = 2;

   printf("Echange d'adresse et de valeur\n");
   printf( "Init : a = %d (%p) , b = %d (%p)\n" , a, (void*)a , b, (void*)b );
   swap( &a, &b, sizeof(a) );
   printf( "Init : a = %d (%p) , b = %d (%p)\n" , a, (void*)a , b, (void*)b );

   return EXIT_SUCCESS;
}

