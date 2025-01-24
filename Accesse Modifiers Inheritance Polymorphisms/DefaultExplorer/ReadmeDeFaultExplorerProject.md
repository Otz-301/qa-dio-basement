# Explorando Modificar Default em Testes na Linguagem Java

Este projeto demonstra o funcionamento do modificador de acesso *default* em Java, utilizando classes em pacotes diferentes para explorar suas restrições e possibilidades.

---

## **🎯 Objetivo**

- Demonstrar como o modificador *default* funciona em Java.
- Testar o acesso a métodos e atributos *default* entre classes do mesmo pacote e de pacotes diferentes.

---

## **🔧 Implementação**

### **1️⃣ Estrutura do Projeto**

O projeto segue a seguinte estrutura de pacotes e classes:

src/ │ ├── pacote1/ │ ├── ClasseA.java │ ├── ClasseB.java │ └── pacote2/ └── ClasseC.java



---

### **2️⃣ Criando a Classe `ClasseA`**

A classe `ClasseA` possui um atributo e um método com o modificador *default*. Esses elementos são acessíveis apenas dentro do mesmo pacote.

```java
// pacote1/ClasseA.java
package pacote1;

public class ClasseA {
    // Atributo com acesso default
    String mensagem = "Olá do pacote1!";

    // Método com acesso default
    void exibirMensagem() {
        System.out.println("Mensagem de ClasseA: " + mensagem);
    }
}
```



### **3️⃣ Criando a Classe `ClasseB`**

A classe `ClasseB` está no mesmo pacote que `ClasseA`. Portanto, ela consegue acessar seus atributos e métodos *default*.

// pacote1/ClasseB.java
package pacote1;

public class ClasseB {
    public void testarAcesso() {
        ClasseA classeA = new ClasseA();

        // Acessando o atributo e método default de ClasseA
        System.out.println("Atributo default em ClasseA: " + classeA.mensagem);
        classeA.exibirMensagem();
    }
}



### **4️⃣ Criando a Classe `ClasseC`**

A classe `ClasseC` está em outro pacote (`pacote2`). Por isso, ela **não consegue acessar** os atributos ou métodos *default* de `ClasseA`.

// pacote2/ClasseC.java
package pacote2;

import pacote1.ClasseA; // Importando ClasseA

public class ClasseC {
    public void testarAcesso() {
        ClasseA classeA = new ClasseA();

        // Tentativa de acessar atributo e método default de ClasseA
        // Erro: mensagem e exibirMensagem() têm acesso default
        // System.out.println(classeA.mensagem); // NÃO COMPILA
        // classeA.exibirMensagem();            // NÃO COMPILA
    
        System.out.println("Não é possível acessar membros default de ClasseA fora do pacote.");
    }
}



### **5️⃣ Criando a Classe `TesteDefault`**

Para testar o comportamento descrito, utilizamos a seguinte classe:



// TesteDefault.java
import pacote1.ClasseB;
import pacote2.ClasseC;

public class TesteDefault {
    public static void main(String[] args) {
        System.out.println("=== Testando ClasseB ===");
        ClasseB classeB = new ClasseB();
        classeB.testarAcesso();

        System.out.println("\n=== Testando ClasseC ===");
        ClasseC classeC = new ClasseC();
        classeC.testarAcesso();
    }
}

## **🖥️ Resultado Esperado**

Ao executar o programa, você deverá obter a seguinte saída:

=== Testando ClasseB ===
Atributo default em ClasseA: Olá do pacote1!
Mensagem de ClasseA: Olá do pacote1!

=== Testando ClasseC ===
Não é possível acessar membros default de ClasseA fora do pacote.



## **📦 Explicação**

### **O Modificador \*Default\***

- **Definição:** Quando não especificamos um modificador de acesso (como `public`, `private` ou `protected`), o membro da classe recebe o modificador *default*.
- **Restrição:** Membros *default* são acessíveis **apenas dentro do mesmo pacote**.
- **Uso Comum:** É utilizado para encapsular atributos ou lógica que não devem ser acessíveis fora de um módulo (pacote).

## **📚 Reflexão**

- Como os modificadores de acesso ajudam no design de software?
- Qual seria o impacto de deixar todos os atributos como `public`?
- Quando é mais adequado usar `private` em vez de *default*?

Com este projeto, você explorou o modificador *default* em Java e compreendeu como ele é útil para modularizar e encapsular o código de forma eficiente.





