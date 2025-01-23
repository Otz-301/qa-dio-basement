# 🛒 Criando uma Loja Virtual Simples

Este projeto é um sistema básico para gerenciar itens de uma loja virtual. Ele usa classes, métodos dinâmicos e estáticos para manipular o estoque e exibir informações do produto.

---

## **📚 O que você vai aprender?**

- Criar métodos estáticos e dinâmicos para gerenciar objetos.
- Simular operações básicas de uma loja virtual, como adicionar e remover estoque.
- Trabalhar com atributos e métodos em Java.

---

## **🔨 Passos para Implementação**

### **1️⃣ Criar a Classe `Loja`**

A classe `Loja` terá atributos para armazenar o nome do produto, quantidade em estoque e preço, além de métodos para gerenciar o estoque e exibir informações.

```java
// Loja.java
public class Loja {
    String nome;
    int estoque;
    double preco;

    // Método estático para mensagem de boas-vindas
    static void boasVindas() {
        System.out.println("Bem-vindo à Loja Virtual!");
    }

    // Método dinâmico para adicionar estoque
    void adicionarEstoque(int quantidade) {
        estoque += quantidade;
    }

    // Método dinâmico para remover estoque
    void removerEstoque(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
        } else {
            System.out.println("Erro: Estoque insuficiente!");
        }
    }

    // Método dinâmico para exibir detalhes do produto
    void exibirDetalhes() {
        System.out.println("Produto: " + nome + ", Estoque: " + estoque + ", Preço: R$" + preco);
    }

    public static void main(String[] args) {
        // Exibindo mensagem de boas-vindas
        Loja.boasVindas();

        // Criando um produto e definindo seus atributos
        Loja produto = new Loja();
        produto.nome = "Celular";
        produto.estoque = 50;
        produto.preco = 1500.0;

        // Adicionando e removendo estoque
        produto.adicionarEstoque(10); // Adiciona 10 unidades
        produto.removerEstoque(5);   // Remove 5 unidades

        // Exibindo os detalhes do produto
        produto.exibirDetalhes(); // Produto: Celular, Estoque: 55, Preço: R$1500.0
    }
}
```

## **🖥️ Resultado Esperado**

Ao executar o código, a saída no console será:

Bem-vindo à Loja Virtual!
Produto: Celular, Estoque: 55, Preço: R$1500.0

Se você tentar remover mais estoque do que está disponível, a saída será:

Erro: Estoque insuficiente!

## **🎯 Explicação do Código**

1. **Método Estático `boasVindas`:**
   - É chamado sem necessidade de instanciar um objeto.
   - Mostra uma mensagem de boas-vindas.
2. **Método Dinâmico `adicionarEstoque`:**
   - Aumente o atributo `estoque`em uma quantidade definida.
3. **Método Dinâmico `removerEstoque`:**
   - Reduza o atributo `estoque`em uma quantidade, mas verifique se há estoque suficiente.
4. **Método Dinâmico `exibirDetalhes`:**
   - Mostra as informações do produto no formato definido.
5. **Método `main`:**
   - Teste todas as funcionalidades, como adicionar e remover estoque, e exibir os detalhes do produto.

------

## **🎉 Conclusão**

Este projeto demonstra como criar e manipular objetos em Java, usar métodos dinâmicos para realizar operações e métodos estáticos para exibir informações gerais. 🚀

💡 **Dica:** Experimente adicionar novas funcionalidades, como descontos, categorias de produtos ou design de valor total em estoque! 🛍️



