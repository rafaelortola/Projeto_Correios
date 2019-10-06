$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:teste.feature");
formatter.feature({
  "name": "Busca CEP",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Usuário realiza busca de um cep válido",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Que informo um cep válido",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.informo_um_CEP_válido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seleciono uma opção no campo CEP de:",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.seleciono_uma_opção_no_campo_CEP_de()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clico no botão buscar",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.clico_no_botão_buscar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Endereço é exibido corretamente",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.endereço_é_exibido_corretamente()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});