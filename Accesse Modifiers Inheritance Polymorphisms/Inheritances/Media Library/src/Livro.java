import Midia.Midia;

class Livro extends Midia {
    int numeroDePaginas;

    @Override
    public void exibirInformacoes(){
        System.out.println("Livro -" + titulo + "por" + autor + ",Paginas: " + numeroDePaginas);
    }
}
