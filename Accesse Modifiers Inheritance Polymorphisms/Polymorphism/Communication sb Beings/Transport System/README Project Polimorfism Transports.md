Sistema de Transporte Polimórfico
Este projeto demonstra o uso do polimorfismo em Java, permitindo que diferentes tipos de veículos compartilhem o mesmo método transportar()com implementações distintas.

🎯 Objetivo
Criar um sistema onde diferentes tipos de veículos, como Carro, Aviãoe Navio, possam realizar o transporte utilizando o mesmo método transportar()de formas específicas e contextuais.


📝 Passos
Crie uma classe base Veiculocom o método genérico transportar().
Implemente subclasses ( Carro, Aviaoe Navio) que sobrescrevem o método transportar().
No método main(), crie um array de objetos do tipo Veiculocontendo diferentes tipos de veículos.
Utilização do polimorfismo para chamar o método transportar()de cada veículo no array.

💻 Código com Explicações
// Classe base: Veiculo
class Veiculo {
// Método genérico de transporte
void transportar() {
System.out.println("Transporte genérico.");
}
}

// Subclasse Carro
class Carro extends Veiculo {
// Sobrescrevendo o método transportar
@Override
void transportar() {
System.out.println("Transportando por estrada.");
}
}

// Subclasse Aviao
class Aviao extends Veiculo {
// Sobrescrevendo o método transportar
@Override
void transportar() {
System.out.println("Transportando por ar.");
}
}

// Subclasse Navio
class Navio extends Veiculo {
// Sobrescrevendo o método transportar
@Override
void transportar() {
System.out.println("Transportando por mar.");
}
}

// Classe principal para teste
public class TesteTransporte {
public static void main(String[] args) {
// Criando um array de veículos com diferentes tipos
Veiculo[] veiculos = {
new Carro(),  // Objeto do tipo Carro
new Aviao(),  // Objeto do tipo Aviao
new Navio()   // Objeto do tipo Navio
};

        // Iterando pelos veículos e chamando o método transportar
        for (Veiculo veiculo : veiculos) {
            veiculo.transportar();
        }
    }
}

📚 Resultado Esperado
Ao executar o código, o console exibirá:

Transportando por estrada.
Transportando por ar.
Transportando por mar.

🔍 Explicações importantes
Classe Base ( Veiculo) :

A classe base fornece uma implementação genérica do método transportar(), que pode ser sobrescrita pelas subclasses.
Subclasses ( Carro, Aviao, Navio) :

Cada subclasse sobrescreve o método transportar()para implementar comportamentos específicos ao seu modo de transporte.
Polimorfismo :

O polimorfismo permite que as instâncias das subclasses ( Carro, Aviao, Navio) sejam tratadas como objetos da classe base ( Veiculo), mas executem o método sobrescrito com o comportamento adequado.
Iteração :

A matriz de objetos Veiculo[]permite iterar sobre diferentes tipos de veículos, chamando o método transportar()de forma genérica.

✨ Expansões Possíveis
Adicionando Mais Veículos :

Crie novas subclasses, como Bicicletaou Trem, e implemente o método transportar()com mensagens específicas.
Informações de Transporte :

Adicione atributos nas subclasses, como velocidadeou capacidade, incluindo essas informações na mensagem exibida pelo método transportar().
Uso da interface :

Em vez de uma classe base, crie uma interface chamada Transportavelcom o método transportar(), permitindo maior flexibilidade para implementação em classes não relacionadas hierarquicamente.
Listas Dinâmicas :

Utilize uma ArrayList<Veiculo>para armazenar os veículos, facilitando a adição ou remoção dinâmica de objetos.
Validação de Tipos :

Implemente verificações ou mensagens adicionais para determinar o tipo específico do veículo em tempo de execução (usando instanceof).

💡 Boas Práticas
Sempre use uma anotação @Overrideao sobreescrever métodos, pois ajuda a evitar erros.
Comente o código para explicar o propósito de cada classe e método.
Garanta que o código seja extensível, permitindo a adição de novos tipos de veículos sem alterar o código existente.