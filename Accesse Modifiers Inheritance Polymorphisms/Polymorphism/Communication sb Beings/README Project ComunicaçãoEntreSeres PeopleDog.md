Sistema de Comunicação entre Seres
Este projeto demonstra o uso do polimorfismo em Java para criar um sistema onde diferentes tipos de seres (como "Cachorro" e "Pessoa") podem se comunicar de maneiras únicas ao chamar o método saudacao().

🎯 Objetivo
Crie uma classificação de classes com um método polimórfico saudacao()que responda de maneiras diferentes para objetos da classe base ( Ser) e suas subclasses ( Cachorroe Pessoa).

📝 Passos
Crie uma classe base chamada Sercom o atributo nomee um método saudacao().
Implemente uma subclasse Cachorroque sobrescreva o método saudacao()para exibir "Au Au!".
Implemente uma subclasse Pessoaque sobrescreva o método saudacao()para exibir "Meu nome é [nome]".
Crie um array de objetos Ser, contendo instâncias de Cachorroe Pessoa.
Utilização polimorfismo para iterar pelo array e chamar o método saudacao()de cada elemento.

💻 Código com Explicações

// Classe base: Ser
class Ser {
// Atributo comum a todos os seres
String nome;

    // Método para definir o nome
    void setNome(String nome) {
        this.nome = nome;
    }

    // Método genérico de saudação
    String saudacao() {
        return "Saudação de um ser!";
    }
}

// Subclasse Cachorro
class Cachorro extends Ser {
// Sobrescrevendo o método saudacao
@Override
String saudacao() {
return "Au Au!";
}
}

// Subclasse Pessoa
class Pessoa extends Ser {
// Sobrescrevendo o método saudacao
@Override
String saudacao() {
return "Meu nome é " + nome + ".";
}
}

// Classe principal para testar o polimorfismo
public class TestePolimorfismo {
public static void main(String[] args) {
// Criando um array de objetos do tipo Ser
Ser[] seres = {
new Cachorro(), // Objeto Cachorro
new Pessoa()    // Objeto Pessoa
};

        // Configurando os atributos específicos
        seres[0].setNome("Buddy"); // Nome do cachorro
        seres[1].setNome("Carlos"); // Nome da pessoa

        // Iterando pelo array e chamando o método saudacao
        for (Ser ser : seres) {
            System.out.println(ser.saudacao());
        }
    }
}

📚 Resultado Esperado
Ao executar o código, o console exibirá:

Au Au!
Meu nome é Carlos.

🔍 Explicações importantes
Classe Base ( Ser) :

É a classe pai que define os atributos e comportamentos básicos, como nomeo método saudacao().
Subclasses ( Cachorroe Pessoa) :

Cada subclasse sobrescreve o método saudacao()para implementar comportamentos específicos.
A anotação @Overrideindica que estamos atualizando o método da classe base.
Polimorfismo :

Mesmo usando referências do tipo Ser, o método correto ( saudacao()) é chamado com base no tipo real do objeto (se é Cachorroou Pessoa).
Iteração :

O array Ser[]permite armazenar objetos de diferentes subclasses e chamá-los de forma genérica.

✨ Expansões Possíveis
Adicionando Mais Seres :

Crie uma nova subclasse, como Gato, e sobrescreva o método saudacao()para exibir "Miau!".
Método falarcom Interface :

Crie uma interface chamada Falantecom o método falar(). Faça Cachorroe Pessoaimplemente essa interface para mostrar outro exemplo de polimorfismo.
Listas Dinâmicas :

Substitua o array por uma lista ( ArrayList<Ser>) para facilitar a adição de novos objetos.
Validação de Dados :

Implemente validações para evitar nomes nulos ou vazios.

💡 Dicas de Melhoria
Boas Práticas : Sempre use @Overridepara evitar erros ao sobreescrever métodos.

Documentação : Adicione comentários para cada classe e método, explicando seu propósito.

Flexibilidade : Utilize abstrações como interfaces para criar sistemas ainda mais versáteis.
