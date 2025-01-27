// Implementar uma superclasse Animal com
// caractereisticas gerais e subclasses especificas
// como Mamifero, Ave e Reptil



// Subclasses:
// Mamifero: Atributo adicional tipoDePelo.
    // Metodo emitirSom() retorna "Mamifero rugindo".

    // Ave: Atributo adicional tamanhoAsa.
    // Metodo emitirSom() retorna "Ave cantando"

    // Reptil: Atributo adicional tipoDeEscama
    // Metodo emitirSom() retorna "Reptil silabando";

class   Mamifero extends Animal{
    String tipoDePelo;

    @Override
    void emitirSom(){
        System.out.println("Mamifero rugindo...");
    }
}

class Ave extends Animal{
    double tamanhoAsa;
    @Override
    void emitirSom(){
        System.out.println("Ave cantando...");
    }
}

class Reptil extends Animal{
    String tipoDeEscama;

    @Override
    void emitirSom(){
        System.out.println("Reptil silabando...");
    }
}