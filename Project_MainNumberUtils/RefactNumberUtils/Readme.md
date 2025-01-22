# 📊 MainRefactNumberUtils - Utilitários de Números

Este projeto contém métodos importantes em Java para verificar propriedades de números inteiros, como se fossem **ímpares** ou **positivos** . Os métodos estão implementados de forma simples, mas eficiente, para facilitar o uso em diversas aplicações de análise de números.

## 🔧 Funcionalidades

- **isOdd(int number)** : Verifica se um número é **impar** .
- **isPositive(int number)** : Verifica se um número é **positivo** .

## 🧪 Testes

O projeto também inclui testes para garantir que os métodos funcionem corretamente. Os testes são realizados usando o framework **JUnit 5** .

### Testes Implementados:

- **testIsOdd()** : Verifique se o método `isOdd()`retorna o valor correto para números ímpares e pares.
- **testIsPositive()** : Verifica se o método `isPositive()`retorna o valor correto para números positivos e negativos.

## 📝 Código

### MainRefactNumberUtils.java

public class MainRefactNumberUtils {
    // Método estático para verificar se o número é ímpar
    public static boolean isOdd(int number) {
        return number % 2 != 0; // Se o número não for divisível por 2, é ímpar
    }

    // Método estático para verificar se o número é positivo
    public static boolean isPositive(int number) {
        return number > 0; // Um número é positivo se for maior que zero
    }
}



# 📊 MainRefactNumberUtils - Utilitários de Números

Este projeto contém métodos importantes em Java para verificar propriedades de números inteiros, como se fossem **ímpares** ou **positivos** . Os métodos estão implementados de forma simples, mas eficiente, para facilitar o uso em diversas aplicações de análise de números.

## 🔧 Funcionalidades

- **isOdd(int number)** : Verifica se um número é **impar** .
- **isPositive(int number)** : Verifica se um número é **positivo** .

## 🧪 Testes

O projeto também inclui testes para garantir que os métodos funcionem corretamente. Os testes são realizados usando o framework **JUnit 5** .

### Testes Implementados:

- **testIsOdd()** : Verifique se o método `isOdd()`retorna o valor correto para números ímpares e pares.
- **testIsPositive()** : Verifica se o método `isPositive()`retorna o valor correto para números positivos e negativos.

## 📝 Código

### MainRefactNumberUtils.java

```
JavaCopiarEditarpublic class MainRefactNumberUtils {
    // Método estático para verificar se o número é ímpar
    public static boolean isOdd(int number) {
        return number % 2 != 0; // Se o número não for divisível por 2, é ímpar
    }

    // Método estático para verificar se o número é positivo
    public static boolean isPositive(int number) {
        return number > 0; // Um número é positivo se for maior que zero
    }
}
```

### MainRefactNumberUtilsTest.java

import static org.junit.jupiter.api.Assertions.*;

class MainRefactNumberUtilsTest {

    @Test
    void testIsOdd() {
        assertTrue(MainRefactNumberUtils.isOdd(5)); // 5 é ímpar
        assertFalse(MainRefactNumberUtils.isOdd(4)); // 4 não é ímpar
    }
    
    @Test
    void testIsPositive() {
        assertTrue(MainRefactNumberUtils.isPositive(5)); // 5 é positivo
        assertFalse(MainRefactNumberUtils.isPositive(-3)); // -3 não é positivo
    }
}



## 🔍 Como Rodar

1. Clone o repositório para sua máquina local:git clone https://github.com/seu-usuario/main-refact-number-utils.git

2. Compile e execute o projeto usando **Maven** ou **Gradle** , ou rode diretamente a partir do seu IDE favorito.

   Execute os testes utilizando o JUnit 5 para garantir que tudo esteja funcionando corretamente.

## 🎯 Objetivo

Esse projeto foi desenvolvido para ser simples, mas útil em diversas situações de análise numérica. A lógica dos métodos e a estrutura de testes garantem que a aplicação se comporte corretamente, fazendo com que qualquer desenvolvedor possa usar essas funções sem se preocupar com erros.

## 💡 Filosofia Faymann

Como a natureza dos números é universal, nosso objetivo é criar ferramentas que não apenas funcionem, mas também sejam simples de entender e utilizar. Imagine que a cada número que verificamos, estamos decidindo uma parte do universo lógico: "Este número é ímpar? Ou talvez positivo?!" — uma pergunta simples que, quando respondida corretamente, ilumina uma parte do nosso código e nos aproxima da perfeição. 🚀

Ao fazer isso, transformamos a simplicidade em um artifício poderoso e acessível, para que qualquer desenvolvedor ou entusiasta possa usar esses métodos sem a necessidade de reinventar a roda.



