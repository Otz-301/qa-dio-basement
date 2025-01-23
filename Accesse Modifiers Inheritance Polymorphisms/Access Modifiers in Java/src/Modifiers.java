// Objetivo: Entender como os modificadores de acesso (publi, private e default)
// controlam a visibilidade e o comportamento dos atributos
// e metodos em uma aplicação java


// Código de Exemplo
    public class MainModifier{
    public String nome;
        // Modificador public: visivel em todo o projeto
    private int salary;
    // Modificador private: acessivel apenas dentro da classe Main

        public static void main(String[] args){
            Main meuMain = new Main();
            meuMain.nome = "João";
            meuMain.atualizaSalario(4000);
                // Atualiza o salario usando um metodo publico

            System.out.println("Nome:" + meuMain.nome);
            System.out.println("Salario: " + meuMain.getSalary());
        }

        // Metodo publico para atualizar o salario
            public void atualizaSalario(int novoSalario){
                this.salary = novoSalario;
            }

            // Metodo publico para obter o valor do salario
                    public int getSalary(){
                        return this.salary;
                    }

}
