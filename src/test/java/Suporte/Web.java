package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
   public static WebDriver createChrome() {
       //Abrindo o navegador
       System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
       WebDriver navegador = new ChromeDriver();
       navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       navegador.manage().window().maximize();

       //Navegando para a página

        String url = "http://www.buscacep.correios.com.br/sistemas/buscacep/";
        navegador.get(url);

       return navegador;

   }
}
