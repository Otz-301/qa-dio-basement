// Objetivo: Criar um sistema basico para gerenciar itens em uma loja virtual

public class Loja {
    String nome;
    int estoque;
    double preco;

    // Metodo estatico
    static void boasVindas() {
        System.outprintln("Bem vindo à Rustico Store!");
    }

    // Metodos Dinamicos
    void adicionarEstoque(int quantidade) {
        estoque += quantidade;

    }

    void removerEstoque(int quantidade) {
        estoque -= quantidade;
    }

    void exibirDetalhes() {
        System.out.println(Produto:"+ nome +" Estoque:
        "+ estoque", Preço:R$ "+ preco");
    }

    public static void main(String[] args) {
        Loja.boasVinda();

        Loja produto = new Loja();
        produto.nome = "Celular";
        produto.estoque = 50;
        produto.preco = 1500.0;

        produto.adicionarEstoque(10);
        produto.removerEstoque(5);
        produto.exibirdetalhes();
        // Produto: Celular. Estoque 55, Preço: R$ 1500.


    }
}
