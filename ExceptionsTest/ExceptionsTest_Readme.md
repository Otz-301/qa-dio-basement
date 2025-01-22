# 🌟 Testando Exceções com IntelliJ e Java

Este projeto demonstra como verificar se métodos lançam as exceções corretas em cenários inválidos. 🚀

---

## **📚 O que você vai aprender?**

- Adicionar validação para cenários específicos.
- Lançar exceções personalizadas.
- Testar se a exceção correta é lançada. ✅

---

## **🛠️ Passo 1: Adicionar Validação e Exceção**

Atualizamos a classe `NumberUtils` para incluir validação no método `isOdd`. Veja o código abaixo:

```java
// NumberUtils.java
public class NumberUtils {
    public static boolean isOdd(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        return number % 2 != 0;
    }
}
```

### **🔍 Explicação do Código**

1. **`if (number < 0)`**: Verifique se o número é negativo.
2. **`throw new IllegalArgumentException`**: Lança uma exceção com a mensagem: `"Negative numbers are not allowed"`. 🚨

## **🧪 Passo 2: Testar a Exceção**

Criamos um teste para validar que a exceção exclusiva é lançada. Aqui está o código do teste:

// NumberUtilsTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {
    @Test
    public void testIsOddThrowsExceptionForNegativeNumbers() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtils.isOdd(-5); // Chamamos com um número negativo
        });
        assertEquals("Negative numbers are not allowed", exception.getMessage());
    }
}

## **🖥️ Resultado ao Rodar o Teste**

1. Execute o comando no terminal:gradle test

Saída atenciosa:> Task :test

NumberUtilsTest > testIsOddThrowsExceptionForNegativeNumbers() PASSED

BUILD SUCCESSFUL in 2s



## **📦 Requisitos**

- **Java 8+** ☕
- **Gradle** 🛠️
- IntelliJ IDEA ou qualquer IDE Java de sua preferência. 🖥️

## **🎉 Conclusão**

- Você aprendeu como usar métodos para melhorar a segurança de seus métodos.
- Também verificamos a validade do código com testes automatizados. 🧑‍💻
- Testar abordagens é uma prática essencial para aumentar a robustez do seu código! 🚀