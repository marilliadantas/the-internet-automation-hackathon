# Automação de Página de Login
O projeto consiste na automação de uma página de login, utilizando os seguintes recursos:

- IDE: IntelliJ;
- Padrão PageObjects;
- Java;
- Maven;
- JUnit;
- Selenium;
- Cucumber (BDD);
- Pluguins p/ relatórios automatizados.

# Configuração da IDE e Projeto de Automação
Criar projeto no IntelliJ
- File > New > Maven Project

Instalação de plugin na IDE
- File > Settings > Plugins > Cucumber Java

Instalar os pacotes na Aplicação através do Maven (pom.xml)
- cucumber-java 7.2.3
- cucumber-junit 7.2.3
- selenium-java 3.141.59
- webdrivermanager 5.0.3

# Planejamento de Testes
    Funcionalidade: Login
       Eu como usuário do site "The Internet"
       Gostaria de realizar o login na plataforma
       Para acessar minha conta pessoal

#### Recursos automatizados
- Login

#### Mapeando cenários
- Cenário: TC001 - Login com sucesso
- Cenário: TC002 - Login com campos obrigatórios em branco
- Cenário: TC003 - Login com username em branco
- Cenário: TC004 - Login com password em branco
- Cenário: TC005 - Login com sucesso sem clicar no botão login e clicando na seta de seguir/voltar do Browser

#### Criação da Feature de Teste
Na feature, criei os cenários de fluxo base e exceção, utilizando a escrita da feature em *gherkin* tendo como base o *BDD*:
`/src/test/resources/features/Login.feature`

## Apoie este projeto
Se você quer apoiar este projeto, deixe uma ⭐.
