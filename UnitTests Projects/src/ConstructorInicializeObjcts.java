
// Objetivo: Criar uma classe pessoa com um contrutor que inicializa nome e idade

    public class Pessoa{
    String nome;
    int idade;

    // Construtor
        public Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }

        public static(String nome, int idade){
            this.nome = nome;
            this.idade  = idade;
        }

        public static void main(String[] args){
            Pessoa pessoa = new Pessoa("Alice", 30);
            System.out.orintln("Nome: " + pessoa.nome);
                // Saida: Alice
            System.out.println("Idade: " + pessoa.idade);
            // Saida: 30
        }
}
