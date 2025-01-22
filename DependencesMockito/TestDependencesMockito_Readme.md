# **📂 Testando Dependências com Mockito**

## **🎯O que você vai aprender?**

📚 Como usar mocks para testar interações entre classes.



## **🚀 Passo 1: Criar uma interface para enviar e-mails**

✍️ Crie uma interface para representar o envio de e-mails.

		// EmailService.java
public interface EmailService {
    void sendEmail(String recipient, String message);
}



## **🔧 Passo 2: Criar uma Classe que Depende do Serviço de E-mail**

🛠️ Crie uma classe que depende do serviço de e-mail.



// UserNotifier.java
public class UserNotifier {
    private EmailService emailService;

    public UserNotifier(EmailService emailService) {
        this.emailService = emailService;
    }
    
    public void notifyUser(String recipient, String message) {
        emailService.sendEmail(recipient, message);
    }
}

## **🧪 Passo 3: Escrever Testes com Mockito**

🧰 Use o Mockito para criar um mock do serviço de e-mail e verificar as interações.



// UserNotifierTest.java
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class UserNotifierTest {

    @Test
    public void testNotifyUser() {
        // Cria um mock do EmailService
        EmailService emailServiceMock = mock(EmailService.class);
    
        // Cria o objeto UserNotifier com o mock
        UserNotifier userNotifier = new UserNotifier(emailServiceMock);
    
        // Chama o método notifyUser
        userNotifier.notifyUser("user@example.com", "Welcome!");
    
        // Verifica se o método sendEmail foi chamado corretamente
        verify(emailServiceMock).sendEmail("user@example.com", "Welcome!");
    }
}



## **💻 Resultado de Saída ao Rodar o Teste**

1. **⚙️ Execute o comando:**

   gradle test

   2. **🖥️ Saída aproximada no terminal:**

      

      > ​			Task :test

      ​				UserNotifierTest > testNotifyUser() PASSED

      ​				BUILD SUCCESSFUL in 2s

      

      





