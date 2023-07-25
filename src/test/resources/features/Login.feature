#language: pt
@login
Funcionalidade: Login no Site "The Internet"

  Cenario: TC001 - Login com sucesso
    Dado que o usuario esta na pagina de login
    Quando o usuario preencher o campo username com: "tomsmith"
    E o usuario preencher o campo password com: "SuperSecretPassword!"
    E clicar no botao login
    Entao o sistema deve exibir a mensagem: "You logged into a secure area!"

  Cenario: TC002 - Login com os campos obrigatorios em branco
    Dado que o usuario esta na pagina de login
    Quando o usuario preencher o campo username com: ""
    E o usuario preencher o campo password com: ""
    E clicar no botao login
    Entao o sistema deve exibir a mensagem: "Your username is invalid!"

  Cenario: TC003 - Login com username em branco
    Dado que o usuario esta na pagina de login
    Quando o usuario preencher o campo username com: ""
    E o usuario preencher o campo password com: "SuperSecretPassword!"
    E clicar no botao login
    Entao o sistema deve exibir a mensagem: "Your username is invalid!"

  Cenario: TC004 - Login com password em branco
    Dado que o usuario esta na pagina de login
    Quando o usuario preencher o campo username com: "tomsmith"
    E o usuario preencher o campo password com: ""
    E clicar no botao login
    Entao o sistema deve exibir a mensagem: "Your password is invalid!"

  Cenario: TC005 - Login com sucesso sem clicar no botão login e clicando na seta de seguir/voltar do Browser
    Dado que o usuario esta na pagina de login
    Quando o usuario preencher o campo username com: "tomsmith"
    E o usuario preencher o campo password com: "SuperSecretPassword!"
    E clicar no botao login
    E entrar na pagina secure area
    E clicar no botao logout
    E clicar na seta de voltar do browser
    Entao o sistema nao deve exibir "You logged into a secure area!"