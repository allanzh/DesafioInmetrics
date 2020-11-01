package br.com.inmetrics.test.page;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import br.com.inmetrics.test.core.DriverFactory;

public class LoginPage {
	
	public static void acessarLogin() {
		DriverFactory.getDriver().navigate().to("http://www.inmrobo.tk/accounts/login/");
	}
	
	public static void inserirUsuario(String nomeUsuario) {
		DriverFactory.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(nomeUsuario);
	}
	
	public static void inserirSenha(String senhaUsuario){
		DriverFactory.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys(senhaUsuario);
	}
	
	public static void clicaEntre(){
		DriverFactory.getDriver().findElement(By.xpath("//button[@class='login100-form-btn']")).click();
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void verificarErro() {
		Assert.assertTrue(
				DriverFactory.getDriver().findElement(By.xpath("//strong[contains(text(), 'ERRO!')]")) != null);
	}
	
}
