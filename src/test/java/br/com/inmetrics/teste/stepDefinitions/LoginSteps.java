package br.com.inmetrics.teste.stepDefinitions;

import br.com.inmetrics.test.page.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps {
	
	@Given("Usuario deseja efetuar login no sistema")
	public void acessarLogin(){
		System.out.println("login");
		LoginPage.acessarLogin();
	}
	
	@When("o usuario digitar o login")
	public void digitarUsuario(){
		LoginPage.inserirUsuario("allaninmetrics");
	}
	
	@And ("o usuario digitar a senha")
	public void digitarSenha(){
		LoginPage.inserirSenha("inmetrics");
	}
	
	@Then ("ele sera direcionado para a home")
	public void clicarEntre(){
		LoginPage.clicaEntre();
	}
	
	@When("o usuario digitar o login errado")
	public void digitarUsuarioErrado(){
		LoginPage.inserirUsuario("xpto");
	}
	
	@Then("o sistema notificará um erro")
	public void verificaErroCredenciais(){
		LoginPage.clicaEntre();
		LoginPage.verificarErro();
	}
}
