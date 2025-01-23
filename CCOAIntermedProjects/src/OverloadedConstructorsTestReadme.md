# 🐾 Criando Construtores Sobrecarregados em Java

Este projeto explora a criação e o uso de construtores sobrecarregados na classe `Animal`. Os construtores permitem inicializar os atributos do objeto de maneiras diferentes, dependendo das necessidades do desenvolvedor.

---

## **📚 O que você vai aprender?**

- Como criar e utilizar construtores em Java.
- Aplicar sobrecarga de métodos para construtores.
- Praticar a inicialização de atributos de objetos de forma flexível.

---

## **🔨 Passos para Implementação**

### **1️⃣ Criar a Classe `Animal`**

A classe terá dois atributos: `nome` e `idade`. Para inicializá-los, criaremos dois construtores com assinaturas diferentes (sobrecarga). 

```java
// Animal.java
public class Animal {
    String nome;
    int idade;

    // Construtor 1: Inicializa apenas o nome
    public Animal(String nome) {
        this.nome = nome;
        this.idade = 0; // Idade padrão
    }

    // Construtor 2: Inicializa nome e idade
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        // Criando objetos com diferentes construtores
        Animal cachorro = new Animal("Rex"); // Usando o primeiro construtor
        Animal gato = new Animal("Mimi", 3); // Usando o segundo construtor

        // Exibindo os atributos dos objetos criados
        System.out.println("Animal: " + cachorro.nome + ", Idade: " + cachorro.idade); // Rex, 0
        System.out.println("Animal: " + gato.nome + ", Idade: " + gato.idade); // Mimi, 3
    }
}
```

## **🖥️ Resultado Esperado**

Ao executar o código acima, a saída no console será:

Animal: Rex, Idade: 0
Animal: Mimi, Idade: 3



## **🚀 Tutorial para Rodar e Testar o Código**

### **1️⃣ Configurar o Ambiente de Desenvolvimento**

1. Certifique-se de ter o **Java JDK** instalado em seu computador. Para verificar, execute o comando:java -version



Ecolha um IDE como IntelliJ IDEA ou Eclipse, ou use um editor de texto simples e compile o código usando o terminal.

###  **Criar o Arquivo de Código**

1. Crie um novo arquivo chamado `Animal.java`.
2. Copie e cole o código acima no arquivo.

### **Compilar e executar o código**

1. Abra o terminal ou o console integrado do seu IDE.
2. Navegue até o diretório onde o arquivo `Animal.java`foi salvo.
3. Compile o código com o comando: javac Animal.java

Execute o programa com o comando: java Animal



### **Teste as Funcionalidades**

- **Construtor 1:** Verifique se o objeto inicializado com apenas o nome define a idade como `0`.
- **Construtor 2:** Certifique-se de que o objeto inicializado com nome e idade defina ambos os atributos corretamente.

## **Conclusão**

Este projeto mostrou como a sobrecarga de construtores facilita a criação de objetos flexíveis e adaptáveis. 🚀

💡 **Dica:** Experimente adicionar novos atributos (como tipo de animal ou peso) e crie mais construtores para inicializá-los de diferentes formas! 🐕🐈