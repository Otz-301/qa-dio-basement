// TesteCarroExterno.java (no pacote externo)
    import carro.Carro;
public class MainTesteCarroExterno {
    public static void main(String[] args){
        // Instanciando um objeto da classe Carro
        Carro carro = new Carro();

        // Acessando o atributo public diretamente
            carro.marca = "Honda";
                // Acesso permitido
        System.out.println("Marca "+ carro.marca);

        // Não podemos acessas o atributo default diretamente,
        // pois está em pacote diferente
        // carro.modelo = "Civic;
        // Erro: modelo tem modificador default (não acessivel fora do pacote)

        // Não podemos acessar o atributo private diretament, pois é privado
        // carro.preco = 4000.0;
        // ERRO: preco tem modificador private

        // Acessando o atributo private via método publico
            carro.setPreco(40000.0);
                // Acesso permitido (usando setter)
            System.out.println("Preço: R$ " + carro.getPreco());
                // Acesso permitido (usando o getter)
    }
}