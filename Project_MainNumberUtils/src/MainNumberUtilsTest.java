// Testa se o método retorna verdadeiro para números ímpares

import org.junit.jupiter.api.Test; // Importa a anotação @Test
import static org.junit.jupiter.api.Assertions.*; // Importa métodos para fazer asserções`

`public class MainNumberUtilsTest

@Test
public void testIsOddTrue() {
    assertTrue(NumberUtils.isOdd(3), "3 should be odd"); // Esperamos que 3 seja ímpar
}

// Testa se o método retorna falso para números pares
@Test
public void testIsOddFalse() {
    assertFalse(NumberUtils.isOdd(4), "4 should not be odd"); // Esperamos que 4 não seja ímpar
}
