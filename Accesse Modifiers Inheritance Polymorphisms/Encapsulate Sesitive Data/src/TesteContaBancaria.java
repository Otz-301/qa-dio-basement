
// TesteContaBancaria.java

import java.lang.module.Configuration;
import java.util.Arrays;

// TesteContaBancaria.java
public class TesteContaBancaria {
    public static void main(String[] args) {
// Instanciando uma conta bancária
        ContaBancaria conta = new ContaBancaria();

        // Depositando valores na conta
        conta.depositar(500);
        conta.depositar(250);

        // Consultando o saldo via método público
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        // Tentativa de acessar o atributo saldo diretamente (causará erro de compilação)
        // conta.saldo = 1000; // ERRO: saldo tem modificador private e não é acessível fora da classe

        // Apenas métodos públicos podem manipular o saldo
        System.out.println("Depósito realizado com sucesso.");
    }
