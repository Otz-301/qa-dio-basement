// Subclasse Carro

class Carro extends Veiculo {
    int quatidadeDePortas;

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Portas: " + quatidadeDePortas);
    }
}