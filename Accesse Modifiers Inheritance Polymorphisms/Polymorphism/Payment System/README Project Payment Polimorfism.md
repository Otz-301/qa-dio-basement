Sistema de Pagamento Polimórfico
Este projeto demonstra o uso do polimorfismo em Java, permitindo que diferentes formas de pagamento, como CartaoCredito, PayPale Dinheiro, compartilhem o método realizarPagamento()com implementações específicas.

🎯 Objetivo
Simule diferentes formas de pagamento em um sistema, utilizando o conceito de polimorfismo para unificar o comportamento de processamento, independentemente do tipo de pagamento.

📝 Passos
Crie uma classe base Pagamentocom um método genérico realizarPagamento().
Implemente subclasses ( CartaoCredito, PayPale Dinheiro) que sobrescrevem o método realizarPagamento()com comportamentos específicos.
No método main(), crie uma lista de diferentes tipos de pagamentos.
Usar polimorfismo para processar todos os pagamentos de forma unificada.


💻 Código com Explicações
// Classe base: Pagamento
class Pagamento {
// Método genérico para realizar o pagamento
void realizarPagamento() {
System.out.println("Pagamento realizado.");
}
}

// Subclasse CartaoCredito
class CartaoCredito extends Pagamento {
@Override
void realizarPagamento() {
System.out.println("Pagamento realizado com Cartão de Crédito.");
}
}

// Subclasse PayPal
class PayPal extends Pagamento {
@Override
void realizarPagamento() {
System.out.println("Pagamento realizado via PayPal.");
}
}

// Subclasse Dinheiro
class Dinheiro extends Pagamento {
@Override
void realizarPagamento() {
System.out.println("Pagamento realizado em Dinheiro.");
}
}

// Classe principal para teste
public class TestePagamento {
public static void main(String[] args) {
// Criando uma lista de diferentes tipos de pagamentos
Pagamento[] pagamentos = {
new CartaoCredito(), // Pagamento com cartão de crédito
new PayPal(),        // Pagamento via PayPal
new Dinheiro()       // Pagamento em dinheiro
};

        // Iterando pelos pagamentos e processando cada um
        for (Pagamento pagamento : pagamentos) {
            pagamento.realizarPagamento();
        }
    }
}

📚 Resultado Esperado
Ao executar o código, o console exibirá:

Pagamento realizado com Cartão de Crédito.
Pagamento realizado via PayPal.
Pagamento realizado em Dinheiro.

🔍 Explicações importantes
Classe Base ( Pagamento) :

Serve como uma interface comum para todas as formas de pagamento.
O método realizarPagamento()é genérico e pode ser sobrescrito pelas subclasses.
Subclasses :

Cada subclasse sobrescreve o método realizarPagamento()para implementar um comportamento específico.
Por exemplo:
CartaoCreditoexibe uma mensagem correspondente a pagamentos por cartão.
PayPalexibe uma mensagem de pagamentos via PayPal.
Dinheiroexibe uma mensagem para pagamentos em dinheiro.
Polimorfismo :

Permite que a matriz pagamentoscontenha objetos de diferentes tipos ( CartaoCredito, PayPal, Dinheiro), mas todos sejam tratados como do tipo base Pagamento.
Iteração :

O loop forchama o método realizarPagamento()para cada objeto no array, invocando a implementação com base no tipo do objeto no tempo de execução.


✨ Expansões Possíveis
Novas Formas de Pagamento :

Adicione outras formas, como Pix, Boleto, ou CartaoDebito, com comportamentos específicos.
Validação de Pagamentos :

Insira métodos adicionais para validar pagamentos, como verificar saldo ou saldo.
Detalhes no Pagamento :

Inclui atributos como valor, dados ou descrição, e personaliza as mensagens exibidas pelo método realizarPagamento().
Uso da interface :

Em vez de usar uma classe base, crie uma interface FormaPagamentocom o método realizarPagamento().
Sistema Dinâmico :

Utilize listas dinâmicas, como ArrayList<Pagamento>, para manipular objetos de forma mais flexível.

💡 Boas Práticas
Uso da Anotação@Override :
Ajuda a identificar claramente métodos sobrescritos e prevenir erros.
Estrutura de Código Clara :
Comente o código para explicar o propósito de cada classe e método.
Extensibilidade :
Projete o sistema para que novas formas de pagamento possam ser adicionadas facilmente, sem alterar o código existente.


