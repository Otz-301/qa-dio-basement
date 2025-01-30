import static java.rmi.server.LogStream.log;

public interface E{

public void acessarProduto(String nomeProduto);
}

// Explicação: A expressão @E maperia o passo para a implementação
// do método acessarProduto. O parametro nomeProduto é passado
// para o método de acesso ao produto desejado.

// Selenium
    // Automatizando a ação de Acessar o Produto:

        public <WebElement> void acessarProduto(String nomeProduto, Object driver) {
            Object By = new Object();
            WebElement tituloProduto = driver.findElement(By.xpath("//a[@title='" + nomeProduto +
                "']"));
        tituloProduto.click();
        log("Acessou o produto: " + nomeProduto);

            // Aqui o Selenium é usado para localizar o elemento HTML do produto e clicar nele.

            // Pagina de Deatlhes do Produto
                class DetalheProdutoSteps{
                    @E("aumenta a quantidade para 2")
                    public void aumentarQuantidadeProduto(String nomeProduto) {
                        ResultadoPesquisaPage(driver);
                        resultadoPesquisaPage.acessarProduto(nomeProduto);
                        WebElement botaoAumentarQuantidade = driver.findElement(By.xpath("//button[@class='btn btn-default button-plus']"));
                        botaoAumentarQuantidade.click();
                        log("Aumentou a quantidade de produto");
                    }
                }
                // Validando a Quantidade Esperada:
                    public boolean oProdutoApresentouQuantidadeEsperada(StringnomeProduto, int quantidadeProduto) {
                    WebElement quantidadeElemento = driver.findElement(By.xpath("//input[@name ='quantity_wanted']"));
                    int quantidadeAtual =
                            Integer.parseInt(quantidadeElemento.getAttribute("Value"));
                            if (quantidadeAtual = = quantidadeProduto) {
                                log("Produto " + nomeProduto + "tem a quantidade esperada: " + quantidadeProduto);
                                return true;
                                } else {
                                logFail("Quantidade do produto" + nomeProduto + "não corresponde à esperada.");
                                return false;
                            }
            }
                                // Afirmar para Validação
                            AssertionTrue("O Produto [" + nomeProduto + "] deveria ter quantidade[" + quantidadeProduto + "]", carrinhoPage.oProdutoApresentouQuantidadeEsperada(nomeProduto,quantidadeProduto));
        }

public void main() {
}



