package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoLoginPage extends BasePage {
    private By txtLogin = By.xpath("//*[@id=\"flash\"]");
    private By btnLogout = By.xpath("//*[@id=\"content\"]/div/a");

    public ResultadoLoginPage(WebDriver _browser){
        super(_browser);
    }

    public String retornaMsg(){
        return driver.findElement(txtLogin).getText();
    }

    public void clicarBtnLogout() {
        driver.findElement(btnLogout).click();
    }

    public void setaVoltar() {
        driver.navigate().back();
    }
}

