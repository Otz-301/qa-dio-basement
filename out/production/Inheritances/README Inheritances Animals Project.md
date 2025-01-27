# 🐾 Herança em Java: Sistema de Animais

Este projeto explora o conceito de **herança em Java**, utilizando superclasses, subclasses e polimorfismo. Através de um sistema simples de gestão de animais de zoológico, você aprenderá a criar hierarquias de classes e entender como a herança facilita a reutilização de código.

---

## 🎯 **Objetivo**

Criar uma hierarquia de classes que simula um sistema para gerenciar diferentes tipos de animais em um zoológico. O projeto inclui o uso de herança e polimorfismo para demonstrar as características dos animais e seus comportamentos.

---

## 📝 **Estrutura do Projeto**

### **Superclasse `Animal`**
A classe base que contém atributos e métodos genéricos para todos os animais.

- **Atributos**:
  - `nome`: Nome do animal.
  - `idade`: Idade do animal.

- **Métodos**:
  - `emitirSom()`: Exibe um som genérico: `"Animal fazendo som..."`.

```java
class Animal {
    String nome;
    int idade;

    void emitirSom() {
        System.out.println("Animal fazendo som...");
    }
}

Subclasses Específicas
Cada subclasse representa um grupo específico de animais e sobrescreve o método emitirSom()para refletir comportamentos únicos.

Mamífero :
Atributo adicional : tipoDePelo.
Método sobrescrito : "Mamífero rugindo...".
class Mamifero extends Animal {
    String tipoDePelo;

    @Override
    void emitirSom() {
        System.out.println("Mamífero rugindo...");
    }
}

2. Ave:
Atributo adicional: tamanhoAsa.
Método sobrescrito: "Ave cantando...".

class Ave extends Animal {
    double tamanhoAsa;

    @Override
    void emitirSom() {
        System.out.println("Ave cantando...");
    }
}

3. Réptil:
Atributo adicional: tipoDeEscama.
Método sobrescrito: "Réptil sibilando...".

class Reptil extends Animal {
    String tipoDeEscama;

    @Override
    void emitirSom() {
        System.out.println("Réptil sibilando...");
    }
}

Polimorfismo
Demonstra o uso de polimorfismo ao criar um array de Animal que contém instâncias de diferentes subclasses. O método emitirSom() é chamado para cada objeto, exibindo o comportamento específico de cada subclasse.

public class Zoologico {
    public static void main(String[] args) {
        Animal[] animais = {
            new Mamifero(),
            new Ave(),
            new Reptil()
        };

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}

Saída Esperada:
Mamífero rugindo...
Ave cantando...
Réptil sibilando...

🧱 Conceitos Fundamentais
Herança: As subclasses herdam atributos e métodos da superclasse Animal.
Sobrescrita de Métodos: Cada subclasse redefine o método emitirSom() para fornecer um comportamento específico.
Polimorfismo: Um array de Animal permite que objetos de diferentes subclasses sejam tratados de maneira uniforme.


📚 Como Executar
Copie o código das classes Animal, Mamifero, Ave, e Reptil para um editor ou IDE de sua preferência.
Crie a classe principal Zoologico e insira o código do método main.
Compile e execute o programa para observar a saída.

🌟 Aprendizado
Este projeto demonstra como a herança pode simplificar o design de software, incentivando a reutilização de código e facilitando a manutenção. Além disso, o uso de polimorfismo mostra como objetos podem ser manipulados de forma flexível em Java.

🎉 Agora é sua vez! Experimente adicionar mais subclasses ou atributos e veja como o sistema se adapta!
