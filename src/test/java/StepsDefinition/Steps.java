package StepsDefinition;

import PageObjects.buscaCep;
import PageObjects.buscaLogradouro;
import PageObjects.resultadoBuscaCepEndereco;
import PageObjects.resultadoBuscaLogradouro;
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
                    .digitaCEP("21721600");
    }

    @Dado("Que informo o nome de um logradouro")
    public void informo_um_nome_de_um_logradouro() {
        new buscaLogradouro(navegador)
                .digitaLogradouro("Avenida Brasil")
                .selecionarOpcaoDeBusca();
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

    @Então("Mais de um endereço é exibido")
    public void mais_de_um_endereço_é_exibido() {
        new resultadoBuscaLogradouro(navegador)
                .encontraLogradouro();
    }

    @After
    public void tearDown(){
        navegador.quit();
    }
}
