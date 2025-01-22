# Testes Parametrizados em Java com JUnit 🖥️

## Descrição 💡
Este exemplo mostra como usar testes parametrizados com JUnit 5 para verificar se um número é ímpar. Testes parametrizados permitem que você execute o mesmo teste com vários valores sem escrever várias funções de teste.

## Estrutura do Teste 🧪

### **Passo 1: Adicionar Dependência dos Parâmetros JUnit** 📦

No seu arquivo `build.gradle`, adicione a biblioteca necessária para realizar os testes parametrizados.

```gradle
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-params:5.10.0'
}
```

### **Passo 2: Escrever Testes Parametrizados** ✍️

Utilize uma anotação `@ParameterizedTest`para testar vários valores de uma vez.

// NumberUtilsTest.java

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@ParameterizedTest
@ValueSource(ints = {1, 3, 5, 7}) // Testa vários valores ímpares
public void testIsOddWithOddNumbers(int number) {
    assertTrue(NumberUtils.isOdd(number), number + " should be odd");
}

## Como Rodar ou Testar ⚙️

1. **Abrir o IntelliJ** : Abra o projeto no IntelliJ IDEA.
2. **Executar o Teste** : Execute o comando para rodar os testes com o Gradle:

gradle test

### **Resultado Esperado no Terminal** 🔍

Ao executar o comando, o terminal exibirá algo como:

> Task :test

NumberUtilsTest > testIsOddWithOddNumbers(1) PASSED
NumberUtilsTest > testIsOddWithOddNumbers(3) PASSED
NumberUtilsTest > testIsOddWithOddNumbers(5) PASSED
NumberUtilsTest > testIsOddWithOddNumbers(7) PASSED

BUILD SUCCESSFUL in 2s

## Requisitos 🛠️

- 5 de junho

- Gradle

- IntelliJ IDEA (ou qualquer IDE compatível com Java)

  

## Explicação do Teste ✨

- **@ParameterizedTest** : Essa anotação é usada para indicar que o método de teste será parametrizado.
- **@ValueSource** : Aqui você fornece uma lista de valores que serão passados como parâmetro para o método de teste. Neste caso, os números ímpares 1, 3, 5 e 7 são testados.
- **assertTrue** : O método verifica se a condição fornecida é verdadeira. Se a função `isOdd`retornar `true`para esses números, o teste será considerado bem-sucedido.

## Possíveis Melhorias 🚀

- **Adicionar Mais Casos de Teste** : Testar números pares ou negativos.
- **Testar Outras Funções** : Crie mais testes parametrizados para diferentes funcionalidades da classe `NumberUtils`.

Este README agora inclui a dependência do Gradle e a explicação do teste parametrizado atualizado, com os novos valores de entrada para os testes e as instruções para execução.

TKS