package br.com.inmetrics.test.page;
import org.junit.Assert;
import br.com.inmetrics.test.core.DriverFactory;

public class LoginPage {
	
	public static void navigateToLogin() {
		DriverFactory.navigateTo("http://www.inmrobo.tk/accounts/login/");
	}
	
	public static void insertUser(String nomeUsuario) {
		DriverFactory.setText("//input[@name='username']", nomeUsuario);
	}
	
	public static void insertPassword(String senhaUsuario){
		DriverFactory.setText("//input[@type='password']", senhaUsuario);
	}
	
	public static void submit(){
		DriverFactory.click("//button[@class='login100-form-btn']");
	}
	
	public static void verifyErrorMessage() {
		Assert.assertTrue(DriverFactory.verifyElementPresent("//strong[contains(text(), 'ERRO!')]"));
	}
	
}
