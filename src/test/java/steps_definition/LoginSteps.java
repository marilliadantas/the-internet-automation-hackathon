package steps_definition;

import base_class.BaseSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page_objects.LoginPage;
import page_objects.ResultadoLoginPage;

public class LoginSteps extends BaseSteps {

    LoginPage paginaLogin = new LoginPage(browser);
    ResultadoLoginPage resultLogin = new ResultadoLoginPage(browser);

    @Dado("que o usuario esta na pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login() {
        paginaLogin.abrir();
        screenshot();
    }

    @Quando("o usuario preencher o campo username com: {string}")
    public void o_usuario_preencher_o_campo_username_com(String username) {
        paginaLogin.preencherUsername(username);
        screenshot();
    }

    @E("o usuario preencher o campo password com: {string}")
    public void o_usuario_preencher_o_campo_password_com(String password) {
        paginaLogin.preencherPassword(password);
        screenshot();
    }

    @E("clicar no botao login")
    public void clicar_no_botao_login() {
        paginaLogin.clicarBntLogin();
    }

    @Entao("o sistema deve exibir a mensagem: {string}")
    public void o_sistema_deve_exibir_a_mensagem(String resultadoEsperado) {
        String msgTela = resultLogin.retornaMsg().replaceAll("[^a-zA-Z0-9]", "");
        Assert.assertEquals(resultadoEsperado.replaceAll("[^a-zA-Z0-9]", ""), msgTela);
        screenshot();
    }

    @Quando("entrar na pagina secure area")
    public void entrar_na_pagina_secure_area() {
        resultLogin.retornaMsg();
        screenshot();
    }

    @E("clicar no botao logout")
    public void clicar_no_botao_logout() {
        resultLogin.clicarBtnLogout();
    }

    @E("clicar na seta de voltar do browser")
    public void clicar_na_seta_de_voltar_do_browser() {
        resultLogin.setaVoltar();
    }

    @Entao("o sistema nao deve exibir {string}")
    public void o_sistema_nao_deve_exibir(String resultadoEsperado) {
        String msgTela = resultLogin.retornaMsg().replaceAll("[^a-zA-Z0-9]", "");
        Assert.assertNotEquals(resultadoEsperado.replaceAll("[^a-zA-Z0-9]", ""), msgTela);
        screenshot();
    }
}
