package br.com.inmetrics.test.page;

import org.junit.Assert;
import br.com.inmetrics.test.core.DriverFactory;

public class EmpregadosPage {
	
	public static void verifyIfLoggedIn() {
		Assert.assertTrue(DriverFactory.verifyElementPresent("//a[.='Sair']"));
	}
	
	public static void createNewEmployee() {
		DriverFactory.click("//a[.='Novo Funcionário']");
	}
	
	public static void editEmployee() {
		DriverFactory.click("(//a[contains(@href, '/empregados/edit')])[1]");
	}
	
	public static void deleteEmployee() {
		DriverFactory.click("(//button[@id=\"delete-btn\"])[1]");
	}
	
	public static void searchEmployee(String query) {
		DriverFactory.setText("//input[@type='search']", query);
	}
	
	public static void nextPageResult() {
		DriverFactory.click("//a[.='Próxima']");
	}
	
	public static void previousPageResult() {
		DriverFactory.click("//a[.='Anterior']");
	}
}
