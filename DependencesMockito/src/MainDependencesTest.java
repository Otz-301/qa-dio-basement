// UserNotifierTest.java
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MainDependencesTes{
    @Test
        public void testNotfyuser(){
                // Cria um mock do EmailService
            EmailService emailServiceMock = mock(EmailIService.class);
                // Cria o objeto UserNotifier com o mock
                    UserNotifier userNotifier = new UserNotifier(emailServiceMock);
                            // Verifica se o metodo sendEmail foi chamado corretament
                                    verify(emailServiceMock).sendEMail("user@example.com", "Welcome!");
    }
}
