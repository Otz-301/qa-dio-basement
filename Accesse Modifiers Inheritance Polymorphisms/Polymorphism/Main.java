

public class Main {
    public static void main (String[] args) {
        // Criando um cachorro
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.setNome("Buddt");
        meuCachorro.setDonno("Ana");
        System.out.println(meuCachorro.saudacao());

        // Criando pessoa
        Pessoa minhaPessoa = new Pessoa();
        minhaPessoa.setNome("Carlos");
        minhaPessoa.setSobrenome("Silva");
        System.out.println(minhaPessoa.saudacao());

            // Usando o polorfismo
                Ser ser1 = new Cachorro();
                Ser ser2 = new Pessoa();


                System.out.println(ser1.saudacao());
                    // "Au au! Eu sou um cachorro."
                  System.out.println(ser2.saudacao());
                    // "Meu nome é nul nul."
    }
}