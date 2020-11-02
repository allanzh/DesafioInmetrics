package br.com.inmetrics.teste.stepDefinitions;

import br.com.inmetrics.test.page.EmpregadosPage;
import br.com.inmetrics.test.page.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps {
	
	@Given("que o Usuario deseja efetuar login no sistema")
	public void acessarLogin(){
		LoginPage.navigateToLogin();
	}
	
	@When("o usuario digitar o {string}")
	public void digitarUsuario(String login){
		LoginPage.insertUser(login);
	}
	
	@And ("o usuario digitar a {string}")
	public void digitarSenha(String senha){
		LoginPage.insertPassword(senha);
	}
	
	@Then ("ele sera direcionado para a listagem de empregados")
	public void clicarEntre(){
		LoginPage.submit();
		EmpregadosPage.verifyIfLoggedIn();
	}
	
	
	@Then("o sistema notificará um erro")
	public void verificaErroCredenciais(){
		LoginPage.submit();
		LoginPage.verifyErrorMessage();
	}
}
