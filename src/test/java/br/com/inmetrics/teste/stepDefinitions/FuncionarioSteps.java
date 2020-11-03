package br.com.inmetrics.teste.stepDefinitions;

import br.com.inmetrics.test.page.EditEmpregadoPage;
import br.com.inmetrics.test.page.EmpregadosPage;
import br.com.inmetrics.test.page.LoginPage;
import br.com.inmetrics.test.page.NewEmpregadoPage;
import io.cucumber.java.pt.*;

public class FuncionarioSteps {
	@Dado("que sou usuário logado e desejo adicionar um novo funcionário")
	public void adicionarNovoFuncionario() {
		LoginPage.login();
		EmpregadosPage.navigateToNewEmployee();
	}
	
	@Quando("preencher os dados de cadastro e submeter as informações")
	public void preencherCadastro() {
		NewEmpregadoPage.createNewEmployee();
	}
	
	@Entao("o sistema deverá válidar que os campos foram preenchidos com sucesso e o registro foi salvo") 
	public void verificarSucessoCadastroOuEdicao() {
		EmpregadosPage.employeeRegistredMessage();
	}
	
	@E("o cadastro foi efetuado e consta na lista de funcionários")
	public void verificarCadastroPreenchido() {
		EmpregadosPage.searchEmployee(NewEmpregadoPage.CPF);
		EmpregadosPage.verifyEmployeeDataMatches(NewEmpregadoPage.name, 
				NewEmpregadoPage.CPF, NewEmpregadoPage.gender,
				NewEmpregadoPage.role, NewEmpregadoPage.admissionDate);
	}
	
	
	@Dado ("que sou usuário logado e desejo editar um funcionário pré-existente")
	public void editarFuncionario() {
		LoginPage.login();
		EmpregadosPage.searchEmployee("038.480");
		EmpregadosPage.editEmployee();
	}
	
	@Quando ("clicar para editar o usuário e editar o {string} e {string} do funcionário, confirmando as alterações")
	public void alterarDadosFuncionario(String nome, String cargo) {
		EditEmpregadoPage.insertName(nome);
		EditEmpregadoPage.insertRole(cargo);
		EditEmpregadoPage.submit();
	}
	
	@E ("ao pesquisar pelo CPF do funcionário editado, o {string} e o {string} editados estarão atualizados")
	public void conferirEdicao(String nome, String cargo) {
		EmpregadosPage.searchEmployee("038.480");
		EmpregadosPage.verifyNameMatches(nome);
		EmpregadosPage.verifyRoleMatches(cargo);
	}
	
	@Dado("que desejo excluir um funcionário cadastrado no sistema")
	public void cadastrarFuncionarioQueSeraExcluido() {
		LoginPage.login();
		EmpregadosPage.navigateToNewEmployee();
		NewEmpregadoPage.createNewEmployee();
		EmpregadosPage.employeeRegistredMessage();
	}
	
	@Quando("clicar para excluir o registro")
	public void buscarRegistroParaExclusao() {
		EmpregadosPage.searchEmployee(NewEmpregadoPage.CPF);
		EmpregadosPage.deleteEmployee();
	}
	
	@Então("o registro não será mais listado entre os resultados")
	public void verificarSeRegistroFoiApagado() {
		EmpregadosPage.employeeDeletedMessage();
		EmpregadosPage.searchEmployee(NewEmpregadoPage.CPF);
		EmpregadosPage.verifyEmptyDataTable();		
	}

	
}
