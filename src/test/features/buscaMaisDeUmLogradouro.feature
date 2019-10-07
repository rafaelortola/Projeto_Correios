# language: pt
Funcionalidade: Buscar mais de um Logradouro

  @SmokeTest
  Cenário: Usuário realiza busca de mais de um logradouro
    Dado Que informo o nome de um logradouro
    Quando Clico no botão buscar
    Então Mais de um endereço é exibido


