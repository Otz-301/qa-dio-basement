// SubClass Moto

class Moto extends Veiculo {
    String tipoDeGuidao;

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de Gudao: " + tipoDeGuidao);
    }
}