#language: pt
Funcionalidade: Testes relativos as funções relacionadas ao cadastro, edição e remoção de Funcionários no sistema 

	Cenario: Cadastrar um novo funcionário
Dado que sou usuário logado e desejo adicionar um novo funcionário
Quando preencher os dados de cadastro e submeter as informações
Entao o sistema deverá válidar que os campos foram preenchidos com sucesso e o registro foi salvo
E o cadastro foi efetuado e consta na lista de funcionários

	Cenario: Editar um funcionário existente
Dado que sou usuário logado e desejo editar um funcionário pré-existente
Quando clicar para editar o usuário e editar o "<nome>" e "<cargo>" do funcionário, confirmando as alterações
Entao o sistema deverá válidar que os campos foram preenchidos com sucesso e o registro foi salvo
E ao pesquisar pelo CPF do funcionário editado, o "<nome>" e o "<cargo>" editados estarão atualizados

Exemplos:
	| nome | cargo |
	| Teste de Edição | Cargo Editado |
	
	Cenario: Excluir um funcionário
Dado que desejo excluir um funcionário cadastrado no sistema
Quando clicar para excluir o registro
Então o registro não será mais listado entre os resultados
