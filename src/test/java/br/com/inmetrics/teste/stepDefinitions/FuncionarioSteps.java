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
	public void verificarSucesso() {
		EmpregadosPage.employeeRegistredMessage();
	}
	
	@E("o cadastro foi efetuado e consta na lista de funcionários")
	public void verificarCadastroPreenchido() {
		EmpregadosPage.searchEmployee("459.423.810-62");
		EmpregadosPage.verifyCPFMatches("459.423.810-62");
	}
	
}
