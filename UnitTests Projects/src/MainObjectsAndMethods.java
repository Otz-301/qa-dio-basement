
public class Saudação{
    String nome; // Atributo dinamico
    static String saudacao = "Bem vindo!";
        // Atributo estático

    // Método Dinamico
    void setNome(String novoNome){
        nome = novoNome;
    }

    // Metodo estatico
    static void imprimirSaudacao(){
        System.out.println(Saudacao);
    }

    public static void main(String[] args){
        // Chamando metodo estatico
        Main.imprimirSaudacao();
            // Saida: Bem-vindo"
        // Criando um objeto e usando metodos dinamicos
        Main meuObjeto = new Main();
            meuObjeto.setNome("Fernanda");
        System.out.println("Fernanda");
        System.out.println(meuObjeto,getNome());
            // Saida: Fernanda
    }
}
