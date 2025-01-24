
// Essa classe tem um atrivuto e um metodo modificador default.
// Esses elementos serão acessiveis apenas dentro do mesmo pacote.

    // pacote1/ClasseA.java
        package pacote1;

    public class ClassA{
        // Atributo com acesso default
            String mensagem = "Olá do pacote 1";

            // Método com acesso default
        void exibirMensagem(){
                System.out.println("Mensagem da ClasseA: " + mensagem);
        }
    }