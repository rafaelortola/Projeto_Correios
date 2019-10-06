package StepsDefinition;

import PageObjects.buscaCep;
import PageObjects.resultadoBuscaCepEndereco;
import Suporte.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;

import java.util.Random;


public class Steps {

    private WebDriver navegador;


    @Before
    public void setUp() {
         navegador = Web.createChrome();
    }

    @Dado("Que informo um cep válido")
    public void informo_um_CEP_válido() {
            new buscaCep(navegador)
                    .digitaCEP("06401160");
    }

    @Dado("Seleciono uma opção no campo CEP de:")
    public void seleciono_uma_opção_no_campo_CEP_de() {
        new buscaCep(navegador)
                .selecionaCampoCepDe();
    }

    @Quando("Clico no botão buscar")
    public void clico_no_botão_buscar() {
        new buscaCep(navegador)
                .clicarNoBotãoBuscar();
    }

    @Então("Endereço é exibido corretamente")
    public void endereço_é_exibido_corretamente() {
        new resultadoBuscaCepEndereco(navegador)
                .encontraCep();
    }

    @After
    public void tearDown(){
        navegador.quit();
    }
}
