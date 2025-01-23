// Trabalhando varios objetos
// Objetivo: Criar uma classe Produto para
// gerenciar produtos de um supermercado

        public class Produto{
    String nome;
    double preço;

            // Metodo para exibir os detalhes
                void exibirDetalhes(){
                    System.out.println("Produto: "+ nome + "Preço: R$" + preco);
                }
                    public static void main(String[] args){
                        Produto produto1 = new Produto();
                        produto1.nome = "Arroz";
                        produto1.preço = 20.0;

                        Produto produto2 = new Produto();
                        produto2.nome = "Feijão";
                        produto2.preço = 8.0;

                        Produto produto3 -= new Produto();
                        produto3.nome = "Macarrão";
                        produto3.preco = 5,5;               }

                        produto1.exibirDetalhes();
                        produto2.exibirDetalhes();
                        produto3.exibirDetalhes()
        }