package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private String url = "https://the-internet.herokuapp.com/login";
    private By inputUser = By.xpath("//*[@id=\"username\"]");
    private By inputPassword = By.xpath("//*[@id=\"password\"]");
    private By btnLogin = By.xpath("//*[@id=\"login\"]/button/i");


    public LoginPage(WebDriver _browser) {
        super(_browser);
    }

    public void abrir() {
        driver.get(url);
    }

    public void preencherUsername(String username) {
        waitElementVisible(inputUser, 5);
        driver.findElement(inputUser).sendKeys(username);
        actions.sendKeys(Keys.ESCAPE).perform();
    }

    public void preencherPassword(String password) {
        waitElementVisible(inputPassword, 5);
        driver.findElement(inputPassword).sendKeys(password);
        actions.sendKeys(Keys.ESCAPE).perform();
    }

    public void clicarBntLogin() {
        waitElementVisible(btnLogin, 5);
        driver.findElement(btnLogin).click();
    }
}
