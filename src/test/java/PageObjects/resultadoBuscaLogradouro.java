package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class resultadoBuscaLogradouro extends BasePage {
    public resultadoBuscaLogradouro(WebDriver navegador) {
        super(navegador);
    }

    public resultadoBuscaLogradouro encontraLogradouro() {
        List<WebElement> tr = navegador.findElements(By.tagName("table"));
        for (WebElement linha : tr) {
                System.out.println(linha.getText());
        }
        return this;
    }
}
