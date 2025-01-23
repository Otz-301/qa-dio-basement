# 🛠️ Usando Construtores para Inicializar Objetos com IntelliJ e Java

Este projeto demonstra como usar construtores para inicializar objetos e definir seus atributos de forma eficiente. ✨

---

## **📚 O que você vai aprender?**

- Criar classes com atributos.
- Usar construtores para inicializar objetos.
- Trabalhar com métodos `main` para execução do programa. ✅

---

## **🔨 Passos para Implementação**

### **1️⃣ Criar a Classe `Pessoa`**

A classe `Pessoa` contém os atributos `nome` e `idade`, além de um construtor para inicializá-los. Veja o código:

```java
// Pessoa.java
public class Pessoa {
    String nome;
    int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Alice", 30); // Criando o objeto
        System.out.println("Nome: " + pessoa.nome); // Saída: Alice
        System.out.println("Idade: " + pessoa.idade); // Saída: 30
    }
}
```

## **🖥️ Resultado Esperado**

Ao executar o código acima no IntelliJ ou outro ambiente Java, a saída no console será:

Nome: Alice
Idade: 30

## **🎯 Explicação do Código**

1. **Atributos:**
   - `nome`e `idade`são as propriedades da classe `Pessoa`.
2. **Construtor:**
   - O método `Pessoa(String nome, int idade)`inicializa os atributos com os valores fornecidos ao criar um objeto.
3. **Método `main`:**
   - Crie um objeto `Pessoa`usando o construtor e imprime os valores de `nome`e `idade`.

## **🎉 Conclusão**

- O construtor facilita a inicialização dos atributos de uma classe no momento da criação do objeto.
- Este é um conceito essencial no desenvolvimento orientado a objetos. 🧑‍💻