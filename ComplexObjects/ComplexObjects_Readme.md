# 👨‍💻 Testando Objetos Complexos com IntelliJ e Java

Este projeto explora como testar métodos de classes que manipulam objetos mais complexos. 🎯

---

## **📚 O que você vai aprender?**

- Criar e trabalhar com objetos complexos em Java.
- Testar métodos que dependem de atributos de um objeto. ✅

---

## **🛠️ Passo 1: Criar a Classe `Person`**

A classe `Person` representa uma pessoa com os atributos nome e idade. Aqui está o código:

```java
// Person.java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 18; // Considera adulto se tiver 18 anos ou mais
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```

### **🔍 Explicação do Código**

1. **`isAdult`**: Retorna `true`se a idade for 18 ou mais, indicando que a pessoa é adulta.
2. **Getters ( `getName`, `getAge`)** : Métodos de acesso aos atributos `name`e `age`. 🧑‍🏫



## **🧪 Passo 2: Escrever Testes para a Classe`Person`**

Agora, escrevemos testes para verificar o comportamento do método `isAdult`.



// PersonTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testIsAdultTrue() {
        Person person = new Person("John", 20); // Cria uma pessoa com 20 anos
        assertTrue(person.isAdult(), "John should be an adult");
    }
    
    @Test
    public void testIsAdultFalse() {
        Person person = new Person("Jane", 17); // Cria uma pessoa com 17 anos
        assertFalse(person.isAdult(), "Jane should not be an adult");
    }
}

## **🖥️ Resultado ao Rodar o Teste**

1. Execute o comando no terminal:gradle test

Saída atenciosa:

> Task :test

PersonTest > testIsAdultTrue() PASSED
PersonTest > testIsAdultFalse() PASSED

BUILD SUCCESSFUL in 2s



## **📦 Requisitos**

- **Java 8+** ☕
- **Gradle** 🛠️
- IntelliJ IDEA ou outro IDE Java de sua preferência. 🖥️

------

## **🎉 Conclusão**

- Criamos e testamos uma classe com atributos e métodos.
- Os testes garantiram que o comportamento esperado foi cumprido. 🧑‍💻
- Este projeto reforça como manipular e validar objetos complexos em Java. 🚀



