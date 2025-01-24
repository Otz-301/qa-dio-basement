// Classe para testar no Mesmo pacote
// TesteCarro.java(no pacote carro)

public class MainTesteCarro{
    public static <Carro> void main(String [] args){
        // Instanciando um objeto da classe Carro
        Carro carro = new Carro();

// Acessando o atributo public diretamente

        carro.Carro = "Fiat";
            // Acesso permitido
        System.out.println("Marca; " + carro.carro);

// Acessando o atributo private via método publico
    carro.setPreco(35000.0);
        // Acesso permitido ( usando o setter)
        System.out.println("Preco: R$ " + carro.getPreco());
            // Acesso permitido (usando getter)
    }
}