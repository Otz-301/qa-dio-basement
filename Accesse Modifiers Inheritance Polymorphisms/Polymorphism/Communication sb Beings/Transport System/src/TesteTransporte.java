public class TesteTransporte {
    public static void main(String[] args) {
        Veiculo[] veiculos = { new Carro(), new Aviao(), new Navio() };
        for (Veiculo veiculo : veiculos) {
            veiculo.transportar();
        }
    }
}
