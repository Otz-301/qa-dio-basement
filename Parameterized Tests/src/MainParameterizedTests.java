// MainNumberUtilsTest.java
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@ParameterizeTest
@ValueSource(ints ={1, 3, 7}) // Testa vários valores impares
    public void testIsOddWithOddNumbers(int number){
    assertTrue(NumberUtiks.isOdd(number), number + "should be odd");
}

public void main() {
}
