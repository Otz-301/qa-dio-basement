Metodologia colaborativa que integra desenvolvimento ágil 
de software com entendimento colaborativo dos requisitos do cliente. 

É uma extensão do TDD ( Test Driven Development), com foco apenas em testes automatizados. 
mas também em processos colaborativos que alinham toda a equipe na entrega de valor ao cliente. 

O BDD garante que todas as partes envolvidas tenham a mesma visão 
sobre oque deve ser construido. 
Desenvolvedores 
Analistas 
Designers 
Stakeholders 

Topicos importantes do BDD 
Colaboração: PO, QA, Dev, UX)
Clareza dos requisitos: Cretérios de aceitação automatizáveis.
Redução de Retrabalho: Minimizar mal-entendidos ao traduzir requisitos diretamento para cenparios testáveis.
Facilidade de Manutenção: Testes automatizados robustos, escritos de forma compreensivel até par anão tecnicos. 
Foco no comportamento: Prioriza o comportamento do sistema sob a ótica do 
usuário final ao inves de ficar apenas na implantação tecnica.

Diferenças entre TDD e BDD

TDD: 
Testes de unidade e design tecnico 
Linguagem Junit NUnit
Colaboração entre desenvolvedores 
Valida implementações tecnicas 

BDD: 
Comportamento do sistema do ponto de vista do usuário 
Linguagem Natural e legivel modelo Given-When-Then com Gherkin)
Colaboração com todo o time (PO, QA, Dev, UX)
Objetivo é garantir que os critérios de aceitação do cliente sejam atendidos. 

Gherkin: 
Uma linguagem simples e estruturada que descreve o comportamento esperado do sistema
em forma de cenários. É compreensivel para todos os membros do tima, sejam tecnicos ou não. 

Estrutura: 
Feature: Descreve uma funcionalidade especifica do sistema
Scenario: Define um caso de uso especifico para a funcionalidade
Given: Define o contexto inicial
When: Representa a ação ou evento a ser realizado
Then: Verifica o resultado esperado

Exemplo pratico:
Feature
Scenario1: 
Given 
When 
Then

Scenario2
Given
When
Then

Ferramentas para BDD 
Java: Frameworks como JUnit, Cucumber e Mockito
Ruby: Usando RSpec e Cucumber
Python: Usando Behave e pytest-bdd
JavaScript: Usando Jasmine, Mocha ou Cucumber.js.

Automação dos critérioa de aceitação 
No BDD criterios de uso são automaticamente validaos por meio de testes automatizados. 
Integração com ferramentas como Cucumber permite mapear diretamente
os cenarios escritos em Gherkin para codito recorrente


