// Criar uma classe ContaBancariaSaldo com atributo sensivel, encapsulado
// com modificadores de acesso.

// Demonstrar como acessar e modificar saldo
// apenas através de métodos publicos
// Testar o acesso direto ao atributo saldo de fora da Class e explicar porque isso gera um erro


// TesteContaBancari.java
// ContaBancaria.java
public class MainContaBancaria {
    // Atributo privado
        private double saldo;
    // Método público para depósito
    public void depositar(double valor) {
        if (valor > 0) { // Verificação para depósitos válidos
            saldo += valor;
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    // Método público para consultar o saldo
    public double getSaldo() {
        return saldo;
    }


