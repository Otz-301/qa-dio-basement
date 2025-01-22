// ExceptionsTest.java
// NumberUtilsTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class MainExceptionsTest {
        private MainExceptions;

        @Test
            public void testIsOddThrowsExceptionForNegativeNumbers(){
                Exception exception = assertThrows(IllegalArgumentException.class,() ->){
                    Numberutils.isOdd(-5);
                        // Chamamos com um numero negativo
            });
                         assertEdquals("Negative numbers are not allowed"), exception.getMessage());
        }

}
