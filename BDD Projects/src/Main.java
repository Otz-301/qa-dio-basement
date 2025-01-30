// Exemplo com Cucumber Java
// Arquivo.feature

// Feature: Cadastro de cervejas
//Scenario: Criar cerveja com sucesso.
// Given que não exite uma cerveja chamada "Skol"
// When eu envio uma solicitação para cadastrar a cerveja "Skol
// Then a verveja deve ser cadastrada com sucesso

// Código Java:

        public class BeerSteps {
    @Given("que não existe uma cerveja chamada {string}")
            public void verificarCervejaNaoCadastrada(String nome) {
                    // Implementação para verificar que a cerveja não existe
    }
    @When("eu evnio uma solicitação para cadastrar a cerveja {string}")
            public void cadastrarCerveja(String nome) {
                // Implementalçao para cadastrar a cerveja
    }
}
