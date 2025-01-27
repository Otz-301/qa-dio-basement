import Midia.Midia;

class Filme extends Midia {
    double duracao;

    @Override
    public void exibirInformacoes(){
        System.out.println("Filme - " + titulo + "por" + autor + ", Duracao: " + duracao + "horas");
    }
}
