#language: pt
Funcionalidade: Testes relativos as funções relacionadas ao cadastro, edição e remoção de Funcionários no sistema

Cenario: Cadastro de um novo funcionário
Dado que sou usuário logado e desejo adicionar um novo funcionário
Quando preencher os dados de cadastro e submeter as informações
Entao o sistema deverá válidar que os campos foram preenchidos com sucesso 
E o cadastro foi efetuado e consta na lista de funcionários
