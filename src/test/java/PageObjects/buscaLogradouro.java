package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class buscaLogradouro extends BasePage {
    public buscaLogradouro(WebDriver navegador) {
        super(navegador);
    }

    public buscaLogradouro digitaLogradouro(String logradouro){
        navegador.findElement(By.cssSelector("#Geral > div > div > span:nth-child(3) > label > input")).sendKeys(logradouro);
        return this;
    }

    public resultadoBuscaLogradouro selecionarOpcaoDeBusca() {
        navegador.findElement(By.cssSelector("#Geral > div > div > span:nth-child(5) > label > select")).findElement(By.cssSelector("#Geral > div > div > span:nth-child(5) > label > select > option:nth-child(1)")).click();
        return new resultadoBuscaLogradouro(navegador);
    }
}
