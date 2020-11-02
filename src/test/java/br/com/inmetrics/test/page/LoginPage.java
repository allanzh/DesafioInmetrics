package br.com.inmetrics.test.page;
import org.junit.Assert;
import br.com.inmetrics.test.core.DriverFactory;

public class LoginPage {
	
	public static void navigateToLogin() {
		DriverFactory.navigateTo("http://www.inmrobo.tk/accounts/login/");
	}
	
	public static void insertUser(String login) {
		DriverFactory.setText("//input[@name='username']", login);
	}
	
	public static void insertPassword(String password){
		DriverFactory.setText("//input[@type='password']", password);
	}
	
	public static void submit(){
		DriverFactory.click("//button[@class='login100-form-btn']");
	}
	
	public static void verifyErrorMessage() {
		Assert.assertTrue(DriverFactory.verifyElementPresent("//strong[contains(text(), 'ERRO!')]"));
	}
	
	public static void login() {
		DriverFactory.navigateTo("http://www.inmrobo.tk/accounts/login/");
		DriverFactory.setText("//input[@name='username']", "allaninmetrics");
		DriverFactory.setText("//input[@type='password']", "inmetrics");
		DriverFactory.click("//button[@class='login100-form-btn']");
	}
	
}
