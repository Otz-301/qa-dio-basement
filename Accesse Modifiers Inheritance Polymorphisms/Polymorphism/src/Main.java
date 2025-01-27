// Objetivo: Entender o conceito de Polimorfismo em java
// Polimorfismo refere-se a capacidade de objetos de diferentes classes responderem a mesma
// mensagem de maneiras diferentes.

// Imagine que voce tem varios seres, como pessoas e cachorros.
// Todos eles podem se "expressar" ( ou responder a um metodo chamado Saudação)
// mas a forma como se expressa varia entre eles

// Classe Base Ser
    // Classe base (superclasse)
        public class Ser {
        String nome;

            // Metodo generico para configurar o nome
                void setNome(String nome) {
                    this.nome = nome;
                }
            // Metodo que sera subescrito pelas subclasses
                String saudacao() {
                    return "Olá, eu sou um ser.";
                }
}

