Polimorfismo em Java
🎯 Objetivo
Explorar o conceito de polimorfismo em Java, demonstrando como diferentes classes podem sobrescrever métodos para responder de maneiras únicas a uma mesma mensagem.

Conceito de Polimorfismo
Polimorfismo é uma capacidade de objetos de diferentes classes responderem ao mesmo método, mas com implementações distintas. Ele promove flexibilidade no código, tornando-o mais reutilizável e fácil de manter.

Estrutura do Exemplo
Aulas
Ser: Classe base (superclasse) com métodos e atributos comuns.
Cachorro: Subclasse de Ser, com saudação específica e atributo adicional ( dono).
Pessoa: Subclasse de Ser, com saudação específica e atributo adicional ( sobrenome).

Código Passo a Passo
1. Base de classeSer
   // Classe base (superclasse)
   public class Ser {
   String nome;

   // Método para configurar o nome
   void setNome(String nome) {
   this.nome = nome;
   }

   // Método genérico que será sobrescrito
   String saudacao() {
   return "Olá, eu sou um ser.";
   }
   }
2. SubclasseCachorro
   // Subclasse Cachorro
   public class Cachorro extends Ser {
   String dono;

   // Método para configurar o dono
   void setDono(String dono) {
   this.dono = dono;
   }

   // Sobrescrevendo o método saudacao
   @Override
   String saudacao() {
   return "Au au! Eu sou um cachorro.";
   }
   }
3. SubclassePessoa
   // Subclasse Pessoa
   public class Pessoa extends Ser {
   String sobrenome;

   // Método para configurar o sobrenome
   void setSobrenome(String sobrenome) {
   this.sobrenome = sobrenome;
   }

   // Sobrescrevendo o método saudacao
   @Override
   String saudacao() {
   return "Meu nome é " + nome + " " + sobrenome + ".";
   }
   }
4. Testando o Polimorfismo no Main
   // Classe principal para testar o polimorfismo
   public class Main {
   public static void main(String[] args) {
   // Criando e configurando um cachorro
   Cachorro meuCachorro = new Cachorro();
   meuCachorro.setNome("Buddy");
   meuCachorro.setDono("Ana");
   System.out.println(meuCachorro.saudacao());

        // Criando e configurando uma pessoa
        Pessoa minhaPessoa = new Pessoa();
        minhaPessoa.setNome("Carlos");
        minhaPessoa.setSobrenome("Silva");
        System.out.println(minhaPessoa.saudacao());

        // Usando o polimorfismo
        Ser ser1 = new Cachorro();
        Ser ser2 = new Pessoa();

        ser1.setNome("Rex");
        ser2.setNome("João");

        System.out.println(ser1.saudacao()); // "Au au! Eu sou um cachorro."
        System.out.println(ser2.saudacao()); // "Meu nome é João null."
   }
   }
   Explicação do Código
   Classe BaseSer : Contém o método genérico saudacao, que é sobrescrito nas subclasses.
   Subclasses : Cada subclasse implementa sua própria versão de saudacao, adaptando a mensagem.
   Polimorfismo :
   Um objeto da superclasse ( Ser) pode referenciar instâncias de suas subclasses ( Cachorro, Pessoa).
   O método chamado depende do tipo real do objeto, e não do tipo da referência.

Expansões e Sugestões
Adicionar Novas Subclasses : Crie subclasses como Gatoou Pássaroe implemente suas saudações.

Lista de Objetos :

Crie um array ou lista de Sere preenchimento com objetos de diferentes subclasses.
Percorra a lista chamando o método saudacaopara demonstrar o polimorfismo em ação.

Ser[] seres = {new Cachorro(), new Pessoa()};
for (Ser ser : seres) {
System.out.println(ser.saudacao());
}

3. Implementar Interfaces : Adicione uma interface Falantecom um método falar()e implemente-a nas subclasses.


Dicas
Use uma anotação @Overridesempre que sobrescrever um método, para evitar erros de sintaxe ou lógica.
Experimente modificar os atributos ou adicionar mais métodos para aprofundar seu entendimento.
