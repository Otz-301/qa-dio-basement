

class Ser{
    String nome;
    int idade;
void setNome(String nome){
    this.nome= nome;
}

void mostrarInformacoes(){
    System.out.print("Nome: " + nome);
    System.out.print("Idade: " + idade);
}

}

// SubClasse (Classe Filha)
    public class Pessoa extends Ser{
    String sobrenome;
    private int idade;

    void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    void mostrarInformacoesCompletas(){
        mostrarInformacoes();
        System.out.println("Sobrenome: " + sobrenome);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}

