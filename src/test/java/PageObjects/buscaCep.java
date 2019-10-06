package PageObjects;

import Suporte.Variaveis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class buscaCep extends BasePage {

    public buscaCep(WebDriver navegador) {
        super(navegador);
    }

    /*public buscaCep acessaUrl(String url){
        navegador.get(url);
        return this;
    }*/

    public buscaCep digitaCEP(String cep){
       navegador.findElement(By.cssSelector("#Geral > div > div > span:nth-child(3) > label > input")).sendKeys(cep);
        return this;
    }

    public buscaCep selecionaCampoCepDe(){
        navegador.findElement(By.cssSelector("#Geral > div > div > span:nth-child(5) > label > select")).click();

        return this;
    }

    public resultadoBuscaCepEndereco clicarNoBotãoBuscar(){
        navegador.findElement(By.cssSelector("#Geral > div > div > div.btnform > input")).click();

        return new resultadoBuscaCepEndereco(navegador);
    }
}
