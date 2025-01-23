# 🚗 Criando uma Classe e Instanciando um Objeto com IntelliJ e Java

Este projeto demonstra como criar uma classe `Carro`, definir atributos e métodos, e instanciar um objeto para simular o comportamento de um carro. 🛠️

---

## **📚 O que você vai aprender?**

- Criar classes e atributos.
- Implementar métodos para manipular os atributos.
- Instanciar objetos e testar funcionalidades em Java. ✅

---

## **🔨 Passos para Implementação**

### **1️⃣ Criar a Classe `Carro`**

A classe `Carro` representa um carro simples com atributos para marca, modelo e velocidade, além de métodos para acelerar e frear.

```java
// Carro.java
public class Carro {
    String marca;
    String modelo;
    int velocidadeAtual;

    // Método para acelerar
    void acelerar() {
        velocidadeAtual += 10;
    }

    // Método para frear
    void frear() {
        velocidadeAtual /= 2;
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro(); // Instanciando um objeto Carro
        meuCarro.marca = "Toyota";   // Atribuindo valores
        meuCarro.modelo = "Corolla";
        meuCarro.velocidadeAtual = 50;

        meuCarro.acelerar();
        System.out.println("Velocidade atual: " + meuCarro.velocidadeAtual); // Saída: 60

        meuCarro.frear();
        System.out.println("Velocidade atual: " + meuCarro.velocidadeAtual); // Saída: 30
    }
}
```

## **🖥️ Resultado Esperado**

Ao executar o código no IntelliJ ou em outro ambiente Java, a saída no console será:

Velocidade atual: 60
Velocidade atual: 30

## **🎯 Explicação do Código**

1. **Atributos:**
   - `marca`e `modelo`armazenam informações do carro.
   - `velocidadeAtual`armazena a velocidade do carro.
2. **Método `acelerar`:**
   - Aumenta a velocidade do carro em 10 unidades.
3. **Método `frear`:**
   - Reduza a velocidade atual pela metade.
4. **Método `main`:**
   - Cria um objeto `Carro`, define os valores dos atributos e testa os métodos `acelerar`e `frear`.



## **🎉 Conclusão**

- Este projeto é uma introdução prática aos conceitos básicos de POO (Programação Orientada a Objetos).
- Pratique criar novos métodos, como `parar`ou `ligarMotor`, para ampliar as funcionalidades do carro. 🚀