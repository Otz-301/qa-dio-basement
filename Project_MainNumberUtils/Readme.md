### **Passo 1: Criar a Classe`NumberUtils`**

Esta aula contém o método `isOdd`que verifica se um número é impar.

`// MainNumberUtils.java
public class MainNumberUtils {
// Método estático para verificar se um número é ímpar
public static boolean isOdd(int number) {
return number % 2 != 0; // Se o resto da divisão por 2 for diferente de 0, o número é ímpar
}
}`

**Explicação de sucesso**

1. **`public class NumberUtils**NumberUtils`: Define uma classe pública de chamada.
2. **`public static boolean isOdd(int number)**truefalse`: Este método é estático, o que significa que pode ser chamado sem precisar criar um objeto da classe. Ele aceita um número inteiro como entrada e retorna um valor booleano (ou).
3. **`return number % 2 != 0;**%number`: Use o módulo do operador () para verificar o resto da divisão de por 2. Se o resto for diferente de 0, significa que o número é ímpar.

### **Passo 2: Criar o Teste para`isOdd`**

Agora, criaremos uma aula de teste para verificar o comportamento de `isOdd`.

```java
Java
CopiarEditar

```

`// MainNumberUtilsTest.java
import org.junit.jupiter.api.Test; // Importa a anotação @Test
import static org.junit.jupiter.api.Assertions.*; // Importa métodos para fazer asserções`

`public class NumberUtilsTest`

```java
// Testa se o método retorna verdadeiro para números ímpares
@Test
public void testIsOddTrue() {
    assertTrue(NumberUtils.isOdd(3), "3 should be odd"); // Esperamos que 3 seja ímpar
}

// Testa se o método retorna falso para números pares
@Test
public void testIsOddFalse() {
    assertFalse(NumberUtils.isOdd(4), "4 should not be odd"); // Esperamos que 4 não seja ímpar
}

```

}

### **Resultado de Saída ao Rodar o Teste**

1. Execute o comando:

gradle tes

Saída aproximada no terminal:

> Task :test
>

NumberUtilsTest > testIsOddTrue() PASSED
NumberUtilsTest > testIsOddFalse() PASSED

BUILD SUCCESSFUL in 2s