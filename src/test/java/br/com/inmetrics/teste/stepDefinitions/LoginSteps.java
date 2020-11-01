package br.com.inmetrics.teste.stepDefinitions;

import br.com.inmetrics.test.page.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps {
	
	@Given("Usuario deseja efetuar login no sistema")
	public void acessarLogin(){
		LoginPage.navigateToLogin();
	}
	
	@When("o usuario digitar o login")
	public void digitarUsuario(){
		LoginPage.insertUser("allaninmetrics");
	}
	
	@And ("o usuario digitar a senha")
	public void digitarSenha(){
		LoginPage.insertPassword("inmetrics");
	}
	
	@Then ("ele sera direcionado para a home")
	public void clicarEntre(){
		LoginPage.submit();
	}
	
	@When("o usuario digitar o login errado")
	public void digitarUsuarioErrado(){
		LoginPage.insertUser("xpto");
	}
	
	@Then("o sistema notificará um erro")
	public void verificaErroCredenciais(){
		LoginPage.submit();
		LoginPage.verifyErrorMessage();
	}
}
