import static org.junit.jupiter.api.Assertions.*;
class MainRefactNumberUtilsTest {
    @Test
        void testIsOdd(){
        assertTrue(MainRefactNumberUtils.isOdd(5)); // 5 é impar
        assertFalse(MainRefactNumberUtils.isOdd(4)); // 4 não é impar
    }
  @Test
    void testIsPositive(){
        assertTrue(MainRefactNumberUtils.isPositive(5)); // 5 é positivo
        assertFalse(MainRefactNumberUtils.isPositive(-3)); // -3 não é positivo
  }
}