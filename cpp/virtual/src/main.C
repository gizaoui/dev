#include <stdio.h>
#include <iostream>


class A {
    public:
        virtual void action() = 0;
        virtual ~A(){  printf("Destr. A\n"); };

};

class B : public A { // Implémentation de la classe A
    public:
        B() {}
        void action() {   printf("Hello World\n");   }
        virtual ~B() {   printf("Destr. B\n");   }

};

class C : public A { // Implémentation de la classe A

    public:
        C(){}
        void action() {  printf("Goodbye World\n");  }
        virtual ~C() {  printf("Destr. C\n");  }
};


class AHandleClass {

    private:
        A *APointer; // classe virtuelle

    public:
        void setInstance(A *A_Instance) {
            APointer = A_Instance;   // Aiguillage de l'instance de A sur B ou C
        }

        A * getInstance() {
            APointer;   // Aiguillage de l'instance de A sur B ou C
        }

        void doSomething() {  APointer->action();   }
};


////////////////////////////////////////////////////////////

// classe de base A destinée à être dérivée
class D
{
    public:
        D() { std::cout << "Constructeur de D.\n"; }
        /* virtual */ ~D() { std::cout << "DESTRUCTEUR de D -> destructeur de E (absent) non déclanclée si destructeur de D non déclarée 'virtual'\n"; }

        virtual void PrintName() { std::cout << "Classe D.\n"; }
};

// B hérite de A
class E : public D
{
    public:
        E() { std::cout << "Constructeur de E.\n"; }
        ~E() { std::cout << "DESTRUCTEUR de E.\n"; }

        virtual void PrintName() { std::cout << "Classe E.\n"; }
};


////////////////////////////////////////////////////////////


int main(int argc, char** argv) {

    // utilisation polymorphe de B
	std::cout << "\nConstructeur de E (hérite de D).\n";
    D * d = new E; // construction de D et E
    d->PrintName(); // affiche "Classe E"
    delete d; // destruction de D mais pas de E (desctructeur de D non virtual) !!!

    ////////////////////////////////////////////////////////////

	std::cout << "\nAHandleClass\n";

    AHandleClass AHandle;

    B BInstance;
    AHandle.setInstance(&BInstance); // La classe A pointera sur B
    AHandle.doSomething(); // Appel de la methode 'action' de la classe B via A

    C CInstance;
    AHandle.setInstance(&CInstance); // La classe A pointera sur C
    AHandle.doSomething(); // Appel de la methode 'action' de la classe C via A

    return 0;
}



