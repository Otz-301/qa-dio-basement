## **Encapsulamento com Getters e Setters**

### **Objetivo:**

Crie uma classe `ContaBancaria`que encapsula seus atributos e usa métodos getters e setters para acessar e modificar seus valores.

### **Tópicos Abordados:**

Encapsulamento, métodos de acesso (getters e setters).



### **Passo 1: Criando a Classe`ContaBancaria`**

Primeiro, dê uma aula `ContaBancaria`. Dentro dessa aula, vamos definir os atributos `titular`e `saldo`como **privados** , de forma que eles não possam ser acessados diretamente de fora da aula. Vamos então criar os métodos **getters** e **setters** para permitir o acesso a esses atributos de forma controlada.

public class ContaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;

    // Getter para titular
    public String getTitular() {
        return titular;
    }
    
    // Setter para titular
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    // Getter para saldo
    public double getSaldo() {
        return saldo;
    }
    
    // Setter para saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

### **Passo 2: Criando o Método`main`**

Agora, vamos criar o método `main`para testar a classe `ContaBancaria`. Dentro do `main`, criaremos um objeto `ContaBancaria`, definiremos o titular e o saldo usando os métodos setters, e depois recuperaremos essas informações utilizando os métodos getters.



public class Main {
    public static void main(String[] args) {
        // Criando uma instância da ContaBancaria
        ContaBancaria conta = new ContaBancaria();

        // Usando setters para definir valores
        conta.setTitular("Carlos");
        conta.setSaldo(1500.50);
    
        // Usando getters para acessar valores
        System.out.println("Titular: " + conta.getTitular());  // Exibe: Carlos
        System.out.println("Saldo: R$" + conta.getSaldo());    // Exibe: 1500.5
    }
}

### **Passo 3: Rodando o Código**

- **Execute o código** acima em um ambiente de desenvolvimento Java (como IntelliJ IDEA, Eclipse, ou até mesmo no terminal se você já tiver configurado o Java).

- **Saída atenciosa:**

  Titular: Carlos
  Saldo: R$1500.5

  

### **Passo 4: Explicação do Código**

- **Atributos privados:** `titular` e `saldo`são definidos como **privados** ( `private`), o que significa que não podem ser acessados diretamente de fora da aula.
- **Getters e Setters:** São métodos que permitem o acesso controlado aos atributos privados:
  - O **getter** ( `getTitular`e `getSaldo`) é usado para retornar o valor do atributo.
  - O **setter** ( `setTitular`e `setSaldo`) é usado para modificar o valor do atributo.
- **Não `main`:** Criamos um objeto `conta`da classe `ContaBancaria`, configuramos o titular e o saldo usando os setters, e depois acessamos esses valores com os getters.



### **Passo 5: Testando o Código**

Se quiser testar mais, pode alterar os valores diretamente dentro do método `main`e rodar o código novamente.

Por exemplo, para mudar o título e o saldo:conta.setTitular("Maria");
conta.setSaldo(2000.00);
System.out.println("Novo Titular: " + conta.getTitular());
System.out.println("Novo Saldo: R$" + conta.getSaldo());

A saída será:

Novo Titular: Maria
Novo Saldo: R$2000.0

### **Resultado Final**

O código final cria uma classe `ContaBancaria`com os atributos encapsulados e usa os métodos getters e setters para acessar e modificar esses atributos. Essa abordagem segue os princípios de **encapsulamento** da programação orientada a objetos, garantindo que o acesso aos dados seja controlado e seguro.

