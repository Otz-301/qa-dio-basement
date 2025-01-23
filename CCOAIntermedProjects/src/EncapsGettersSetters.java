// Objetivo: Criar uma classe ContaBancaria que
// encapsula seus atributos e seus metodos getters e setters para acesso

        public class ContaBancaria{
            public String getTitular(){
                    return titular;
            }
            // Setter para titular
            public void setTitular(String titular){
                this.titular = titular;
            }

            // Getter para saldo
            public double getSALDO(){
                return saldo;
            }
            // Setter para saldo
            public void setSaldo(double saldo){
                this.saldo = saldo;
            }
            public static void main(String[] args){
                ContaBancaria conta = new ContaBancaria();
                conta.setTitular("Carlos");
                conta.setSaldo(1500.50);

                System.out.println("Titular: " + conta.getTitular());
                        // Carlos
                System.out.println("Saldo: R$" + conta.getSALDO());
                        // 1500.5
            }

        }