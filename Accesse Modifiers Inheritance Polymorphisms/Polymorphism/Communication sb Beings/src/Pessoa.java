// SubClasse (Classe Filha)
public class Pessoa extends Ser {
    String sobrenome;
    private int idade;

    void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    void mostrarInformacoesCompletas() {
        mostrarInformacoes();
        System.out.println("Sobrenome: " + sobrenome);
    }

    private void mostrarInformacoes() {

    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
