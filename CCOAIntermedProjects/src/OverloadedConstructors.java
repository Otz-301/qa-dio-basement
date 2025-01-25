 // Objetivo: Criar uma classe Animal com construtores sobrecarregados para
 // inicializar atrbutos de diferentes formas

        public class Animal {
            String nome;
            int idade;

            // Construtor 1
            public Animal(String nome) {
                this.nome = nome;
                this.idade = 0;
                // Idade padrão
            }

            // Construtor 2
            public Animal(String nome, int idade) {
                this.nome = nome;
                this.idade = idade;
            }

            public static void main(String[] args) {
                Animal cachorro = new Animal("Rex");
                Animal gato = new Animal("Mimi", 3);

                System.out.println("Animal:" + cachorro.nome + ",Idade:" + cachorro.idade);
                // Rex, 0
                switch (System.out.println("Animal: ") + gato.nome + ",Idade:" + gato.idade) {
                    default ->
                            throw new IllegalStateException("Unexpected value: " + System.out.println("Animal: ") + gato.nome + ",Idade:" + gato.idade);
                }
            }
        }



