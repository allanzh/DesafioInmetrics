package br.com.inmetrics.teste.stepDefinitions;

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
	
	@Entao("o sistema deverá válidar que os campos foram preenchidos com sucesso") 
	public void verificarSucessoCadastro() {
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
		
	}
	
	@Quando ("clicar para editar o usuário e editar o {string} e {string} do funcionário, confirmando as alterações")
	public void alterarDadosFuncionario(String nome, String cargo) {
		
	}
	
	@Então ("serei direcionado para a listagem de funcionários e o sistema mostrará uma mensagem de confirmação")
	public void verificarSucessoEdicao() {
		
	}
	
	@E ("ao pesquisar pelo CPF do funcionário editado, os dados editados estarão atualizados")
	public void conferirEdicao() {
		
	}
	
}
