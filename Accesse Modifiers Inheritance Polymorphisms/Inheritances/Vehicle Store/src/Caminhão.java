// Subclass Caminhão

class Caminhao extends Veiculo {
    double capacidadeDeCarga;

    @Override
    void exibirDetalhes() {
        System.out.print("Capacidade de Carga" + capacidadeDeCarga + "toneladas");
    }
}