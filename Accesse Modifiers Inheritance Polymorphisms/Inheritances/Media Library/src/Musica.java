import Midia.Midia;

class Musica extends Midia {
    String genero;

    @Override
    public void exibirInformacoes(){
        System.out.println("Musica -" + titulo + "por" + autor + ", Genero:" + genero);
    }
}