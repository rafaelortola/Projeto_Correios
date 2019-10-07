# language: pt
Funcionalidade: Busca CEP

    @SmokeTest
    Cenário: Usuário realiza busca de um cep válido
    Dado Que informo um cep válido
    E Seleciono uma opção no campo CEP de:
    Quando Clico no botão buscar
    Então Endereço é exibido corretamente


