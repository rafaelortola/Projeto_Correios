package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class resultadoBuscaCepEndereco extends BasePage{
    public resultadoBuscaCepEndereco(WebDriver navegador) {
        super(navegador);
    }

    public resultadoBuscaCepEndereco encontraCep() {

        String logradouro_informado = navegador.findElement(By.cssSelector("body > div.back > div.tabs > div:nth-child(2) > div > div > div.column2 > div.content > div.ctrlcontent > table > tbody > tr:nth-child(2) > td:nth-child(1)")).getText();
        System.out.println("LOGRADOURO: " + logradouro_informado);

        String bairro_distrito = navegador.findElement(By.cssSelector("body > div.back > div.tabs > div:nth-child(2) > div > div > div.column2 > div.content > div.ctrlcontent > table > tbody > tr:nth-child(2) > td:nth-child(2)")).getText();
        System.out.println("BAIRRO: " +bairro_distrito);

        String localidade_uf = navegador.findElement(By.cssSelector("body > div.back > div.tabs > div:nth-child(2) > div > div > div.column2 > div.content > div.ctrlcontent > table > tbody > tr:nth-child(2) > td:nth-child(3)")).getText();
        System.out.println("LOCALIDADE: " +localidade_uf);

        String cep = navegador.findElement(By.cssSelector("body > div.back > div.tabs > div:nth-child(2) > div > div > div.column2 > div.content > div.ctrlcontent > table > tbody > tr:nth-child(2) > td:nth-child(4)")).getText();
        System.out.println("CEP: " +cep);

        return this;

        }

            /*if (bairro_distrito == "Realengo") {
                System.out.println("O bairro está correto" + bairro_distrito);
            }
            else
                if (localidade_uf == "Rio de Janeiro/RJ") {
                    System.out.println("A localidade está correta" + localidade_uf);
                }
                else
                    if (cep == "21721600") {
                        System.out.println("O cep está correto" + cep);
                    }*/

}
