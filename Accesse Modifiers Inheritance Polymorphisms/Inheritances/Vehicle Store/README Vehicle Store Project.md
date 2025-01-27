🚗 Loja de Veículos
Um sistema para gerenciar uma loja de veículos com diferentes tipos de transporte, utilizando os conceitos de herança e polimorfismo em Java.

🎯 Objetivo
Desenvolver uma estrutura de classes que represente veículos de uma loja, com uma superclasse Veiculoe subclasses especializadas: Carro, Motoe Caminhao.

🛠️ Estrutura do Projeto
1. Superclasse:Veiculo
   A superclasse Veiculocontém os atributos básicos que todos os veículos possuem e um método para exibir detalhes gerais.

Atributos
marca(String): Marca do veículo.
modelo(String): Modelo do veículo.
preco(duplo): Preço do veículo.
Métodos
exibirDetalhes(): Exibe as informações básicas de um veículo.
Exemplo de código:
class Veiculo {
String marca;
String modelo;
double preco;

    void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Preço: R$" + preco);
    }
}
2. Subclasses
   Carro
   Representa um carro, com atributo adicional:

quantidadeDePortas(int): Número de portas do carro.
Sobrescrita do método exibirDetalhes():

class Carro extends Veiculo {
int quantidadeDePortas;

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Portas: " + quantidadeDePortas);
    }
}

Moto
Representa uma moto, com atributo adicional:

tipoDeGuidao(String): Tipo de guia da moto.
Sobrescrita do método exibirDetalhes():

class Moto extends Veiculo {
String tipoDeGuidao;

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de Guidão: " + tipoDeGuidao);
    }
}
Caminhao
Representa um caminhão, com atributo adicional:

capacidadeDeCarga(duplo): Capacidade de carga em toneladas.
Sobrescrita do método exibirDetalhes():

class Caminhao extends Veiculo {
double capacidadeDeCarga;

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + capacidadeDeCarga + " toneladas");
    }
}

🏁 Teste no Main
No método principal ( main), criamos uma lista de veículos e exibimos os detalhes de cada um, demonstrando o uso do polimorfismo .

Exemplo de código:

public class LojaDeVeiculos {
public static void main(String[] args) {
// Instanciando os veículos
Carro carro = new Carro();
carro.marca = "Toyota";
carro.modelo = "Corolla";
carro.preco = 120000.00;
carro.quantidadeDePortas = 4;

        Moto moto = new Moto();
        moto.marca = "Honda";
        moto.modelo = "CB 500X";
        moto.preco = 35000.00;
        moto.tipoDeGuidao = "Esportivo";

        Caminhao caminhao = new Caminhao();
        caminhao.marca = "Volvo";
        caminhao.modelo = "FH 540";
        caminhao.preco = 450000.00;
        caminhao.capacidadeDeCarga = 25.0;

        // Armazenando em um array
        Veiculo[] veiculos = { carro, moto, caminhao };

        // Exibindo os detalhes
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
            System.out.println();
        }
    }
}
📋 Saída Esperada

Marca: Toyota, Modelo: Corolla, Preço: R$120000.0
Portas: 4

Marca: Honda, Modelo: CB 500X, Preço: R$35000.0
Tipo de Guidão: Esportivo

Marca: Volvo, Modelo: FH 540, Preço: R$450000.0
Capacidade de Carga: 25.0 toneladas

💡 Conceitos Importantes
Herança : As subclasses herdam atributos e métodos da superclasse.
Polimorfismo : permite que métodos sejam escritos em subclasses para comportamentos específicos.
Encapsulamento : Facilita a manutenção e organização do código.
Sinta-se à vontade para expandir o sistema adicionando novos tipos de veículos ou funcionalidades! 🚀