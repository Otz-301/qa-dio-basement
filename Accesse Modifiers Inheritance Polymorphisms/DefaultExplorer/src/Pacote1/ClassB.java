// Essa ClasseB não é o mesmo pacote que a ClasseA.
// Ela conseguirá acessar os atributos e métodos padrão de ClasseA

    //pacote1/ClasseB.java
package pacote1;

    public class ClassB {
        public void testarAcesso(){
            pacote1.ClassA classA= new pacote1.ClassA();

                // Acessando o atributo e metodo default de ClasseA
                        System.out.println("Atributo default em ClasseA; " + classA.mensagem);
                            classA.exibirMensagem();
        }
}