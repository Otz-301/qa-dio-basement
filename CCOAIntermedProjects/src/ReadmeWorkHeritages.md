# 🧑‍💼 Trabalhando com Herança em Java

Este projeto ensina como utilizar a herança em Java para criar classes relacionadas entre si, permitindo o reaproveitamento de código e a especialização de funcionalidades. Vamos criar uma classe base `Funcionario` e uma subclasse `Gerente`, que herda os atributos e métodos da classe base e adiciona funcionalidades específicas.

---

## **📚 O que você vai aprender?**

- **Herança**: Como uma subclasse pode herdar atributos e métodos de uma classe base.
- **Sobrescrita e Extensão**: Como adicionar ou modificar funcionalidades de uma classe base.
- **Organização de código**: Criando classes e subclasses que se comunicam de forma eficiente.

---

## **🔨 Passos para Implementação**

### **1️⃣ Criar a Classe `Funcionario`**

A classe `Funcionario` será a classe base e conterá os atributos e métodos comuns a todos os funcionários.

```java
// Funcionario.java
public class Funcionario {
    String nome;
    double salario;

    // Método para exibir as informações do funcionário
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Salário: R$" + salario);
    }
}
```



### **2️⃣ Criar uma Subclasse`Gerente`**

A aula `Gerente`vai herdar a aula `Funcionario`e adicionar o atributo `bonus`. Ela também terá um novo método para exibir o salário total, que inclui o bônus.

// Gerente.java
class Gerente extends Funcionario {
    double bonus;

    // Método para exibir o salário total do gerente (salário + bônus)
    public void exibirSalarioTotal() {
        System.out.println("Salário total: R$" + (salario + bonus));
    }
}

### **3️⃣ Criar uma aula `Main`para testar**

No método `main`, vamos criar um objeto da classe `Gerente`, especificar valores aos atributos e testar os métodos da classe base e da classe derivada.



// Main.java
public class Main {
    public static void main(String[] args) {
        // Criando um objeto Gerente
        Gerente gerente = new Gerente();
        gerente.nome = "Paula";
        gerente.salario = 5000.0;
        gerente.bonus = 1500.0;

        // Exibindo informações do gerente
        gerente.exibirInformacoes();  // Paula, 5000.0
        gerente.exibirSalarioTotal(); // 6500.0
    }
}



## **🖥️ Resultado Esperado**

Quando você rodar o código, a saída no console será:

Nome: Paula, Salário: R$5000.0
Salário total: R$6500.0



## **🚀 Tutorial para Rodar e Testar o Código**

### **1️⃣ Configurar o Ambiente de Desenvolvimento**

1. **Verifique se o Java está instalado no seu computador** . Execute o comando:

   java -version

   Se necessário, instale o **Java JDK** em seu computador.

   Utilize um IDE (IntelliJ IDEA, Eclipse) ou um editor de texto simples (Notepad++, Visual Studio Code) para escrever o código.

### **Criar Arquivos de Código**

1. **Crie três arquivos de código** : `Funcionario.java`, `Gerente.java`, `Main.java`.
2. **Copie e cole o código acima** nos arquivos relacionados.

### **Compilar e executar o código**

1. Abra o terminal ou console do seu IDE.
2. Navegue até o diretório onde os arquivos estão localizados.
3. Compile os arquivos com o comando:

javac Funcionario.java Gerente.java Main.java



Após a compilação, execute o programa com o comando

java Main

### **Teste as Funcionalidades**

- **Verifique os atributos herdados:** Quando você chama o método `exibirInformacoes()`no objeto `gerente`, ele deve exibir corretamente o nome e o salário.
- **Testar a adição do bônus:** O método `exibirSalarioTotal()`deve calcular corretamente o salário total (salário + bônus).

## **🎯 Conclusão**

Esse projeto mostrou como usar a **herança** em Java para reaproveitar código e criar instruções de classes. A classe `Gerente`herda funcionalidades da classe `Funcionario`e pode adicionar ou modificar funcionalidades conforme necessário. 🚀

💡 **Dica:** Tente criar outras subclasses de `Funcionario`(por exemplo, `Assistente`, `Diretor`) e implemente funcionalidades exclusivas para cada uma! 👨‍💻👩‍💼







