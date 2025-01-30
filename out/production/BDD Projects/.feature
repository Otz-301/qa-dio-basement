Cenário 1: Realizar Compra no E-commerce
**Funcionalidade** : Realizar compra no E-commerce

**Como um comprador** : Quero ver a lista de produtos disponíveis

**Para que eu possa escolher qual devo comprar**

Cenário: Adicionar ao produto carrinho

Dado que um usuário acessa o site "http://automationpractice.com"
E pesquisa pelo produto "Blouse"
Quando adiciona o produto "Blouse" ao carrinho
Então o produto "Blouse" deve estar presente no carrinho

Cenário 2: Aumentar a Quantidade de Produto

Dado que um usuário acessa o site "http://automationpractice.com"
E pesquisa pelo produto "Dress"
E acessa o produto "Printed Chiffon Dress"
E aumenta a quantidade para 2
Quando adiciona o produto "Printed Chiffon Dress" ao carrinho
Então o produto "Printed Chiffon Dress" deve possuir quantidade 2

