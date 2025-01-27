// Objetivo:
//Criar uma hierarquia de classes com um método de saudação
// polimórfico que responda de maneiras diferentes para
// "Ser", "Cachorro" e "Pessoa".


    class Ser {
    String nome;

    void setNome(String nome) {
        this.nome = nome;
    }
    String saudacao() {
        return "Saudação de um ser!";
    }
    }

