// Objetivo: Criar uma classe funcionario e uma subclasse Gerente,
// aproveitando os atributos e metodos da classe base

    public class Funcionario{
    String nome;
    double salario;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome +", Salario: R$" + salario);
    }
    class Gerente extends Funcionario{
    double bonus;
        public void exibirSalarioTOtal(){
            System.out.println("Salario total: R$" + (salario + bonus));
        }

        public class Main{
            public static void main(String[] args){
                Gerente gerente = new Gerente();
                gerente.nome = "Paula";
                gerente.salario = 5000.0;
                gerente.bonus = 1500.0;

                gerente.exibirInformacoes();
                    // Paula, 5000.00
                gerente.exibirSalarioTOtal();
                // 6500.00
            }
        }
    }

    public void main() {
    }