import Midia.Midia;

public class Biblioteca {
    public static void main(String[] args) {
        Midia[] midias = {
                new Livro(),
                new Filme(),
                new Musica(),
        };

            for (Midia midia : midias){
                midia.exibirInformacoes();
            }
    }
}