// A ClassC.java está em outro pacote (pacote2).
// Por isso, ela nao terá acesso ao atributo ou metdodo padrão de ClasseA.

        //pacote2/ClasseC.java
        package pacote2;
import pacote1.ClassA;
    // Importando ClasseA
            public class ClassC {
                public void testarAcesso(){
                    ClassA classeA = new ClassA();

                    // Tentativa de acessa atriburo e metodo default de ClasseA
                        // Erro: mensagem e exibirMensagem() tem acesso default
                    // System.out.println(classeA.mensagem); // NÃO COMPILA
                    // classeA.exibirMensagem(); //NÃO COMPILA

                    System.out.println("Não é possivel acessar membros default de ClasseA fora do pacote.");
;                }
}