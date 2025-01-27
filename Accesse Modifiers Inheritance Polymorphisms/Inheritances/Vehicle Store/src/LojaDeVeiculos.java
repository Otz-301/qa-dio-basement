

public class LojaDeVeiculos {
    public static void LojaDeVeiculos(String[] args) {
        Veiculo[] veiculos = {
                new Carro(),
                new Moto(),
                new Caminhao()
        };

            for (Veiculo veiculo : veiculos) {
                veiculo.exibirDetalhes();
            }
    }
}