#language: pt
Funcionalidade: Testes relativos as funções relacionadas ao cadastro, edição e remoção de Funcionários no sistema 

	Cenario: Cadastrar um novo funcionário
Dado que sou usuário logado e desejo adicionar um novo funcionário
Quando preencher os dados de cadastro e submeter as informações
Entao o sistema deverá válidar que os campos foram preenchidos com sucesso 
E o cadastro foi efetuado e consta na lista de funcionários

	Cenario: Editar um cadastro existente
Dado que sou usuário logado e desejo editar um funcionário pré-existente
Quando clicar para editar o usuário e editar o "<nome>" e "<cargo>" do funcionário, confirmando as alterações
Então serei direcionado para a listagem de funcionários e o sistema mostrará uma mensagem de confirmação
E ao pesquisar pelo CPF do funcionário editado, os dados editados estarão atualizados

Exemplos:
	| nome | cargo |
	| Teste de Edição | Cargo Editado |
