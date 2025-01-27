// Objetivo: Criar uma superclasse Veiculo e subclasses Carro, Moto e Caminhao.

class Veiculo {
    String marca;
    String modelo;
    double preco;

        void exibirDetalhes() {
            System.out.println("Marca: " + marca + ", Modelo:" + modelo + ", Preço; R$" + preco );
        }
}

