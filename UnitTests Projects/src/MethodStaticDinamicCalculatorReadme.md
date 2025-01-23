# ➗ Métodos Estáticos e Dinâmicos em Java

Este projeto demonstra a criação e uso de métodos estáticos e dinâmicos na classe `Calculadora`, utilizando o IntelliJ IDEA ou qualquer outra IDE para Java. 📐✨

---

## **📚 O que você vai aprender?**

- Diferença entre métodos estáticos e dinâmicos. 
- Como criar e usar métodos em Java. ✅

---

## **🔨 Passos para Implementação**

### **1️⃣ Criar a Classe `Calculadora`**

A classe `Calculadora` inclui métodos para realizar operações matemáticas básicas, como soma e multiplicação.

```java
// Calculadora.java
public class Calculadora {
    // Método estático
    static int somar(int a, int b) {
        return a + b;
    }

    // Método dinâmico
    int multiplicar(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Chamando método estático
        System.out.println("Soma: " + Calculadora.somar(5, 3)); // Saída: 8

        // Chamando método dinâmico
        Calculadora calc = new Calculadora();
        System.out.println("Multiplicação: " + calc.multiplicar(5, 3)); // Saída: 15
    }
}
```

## **🖥️ Resultado Esperado**

Ao executar o código, a saída no console será:Soma: 8
Multiplicação: 15



## **🎯 Explicação do Código**

1. **Método Estático `somar`:**
   - Recebe dois números como parâmetros e retorna a soma.
   - Pode ser chamado diretamente pela aula, sem necessidade de criar um objeto.
2. **Método Dinâmico `multiplicar`:**
   - Recebe dois números como parâmetros e retornos do produto.
   - Solicite a criação de um objeto para ser utilizado.
3. **Método `main`:**
   - Testa o método estático chamando diretamente pela aula.
   - Teste o método dinâmico criando uma instância da classe `Calculadora`.

## **🎉 Conclusão**

- Este projeto ilustra como métodos estáticos e dinâmicos podem ser usados para diferentes cenários em Java.
- Experimente adicionar mais métodos, como `subtrair`ou `dividir`, para expandir as funcionalidades da calculadora. 🚀