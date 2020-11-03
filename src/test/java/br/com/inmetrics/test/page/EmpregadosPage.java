package br.com.inmetrics.test.page;

import org.junit.Assert;
import br.com.inmetrics.test.core.DriverFactory;

public class EmpregadosPage {

	public static void verifyIfLoggedIn() {
		Assert.assertTrue(DriverFactory.verifyElementPresent("//a[.='Sair']"));
	}

	public static void navigateToNewEmployee() {
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
		DriverFactory.delay(2000);
	}

	public static void nextPageResult() {
		DriverFactory.click("//a[.='Próxima']");
	}

	public static void previousPageResult() {
		DriverFactory.click("//a[.='Anterior']");
	}

	public static void employeeRegistredMessage() {
		DriverFactory.verifyElementPresent("//strong[contains(text(),'SUCESSO!')]");
	}
	
	public static void employeeDeletedMessage() {
		DriverFactory.verifyElementPresent("//strong[contains(text(),'SUCESSO!')]");
	}

	public static void verifyNameMatches(String name) {
		Assert.assertEquals(name, DriverFactory.getText("(//td)[1]"));
	}

	public static void verifyCPFMatches(String cpf) {
		Assert.assertEquals(cpf, DriverFactory.getText("(//td)[2]"));
	}

	public static void verifyGenderMatches(String gender) {
		Assert.assertEquals(gender, DriverFactory.getText("(//td)[3]"));
	}

	public static void verifyRoleMatches(String role) {
		Assert.assertEquals(role, DriverFactory.getText("(//td)[4]"));
	}

	public static void verifyAdmissionDateMatches(String admissionDate) {
		Assert.assertEquals(admissionDate, DriverFactory.getText("(//td)[5]"));
	}
	
	public static void verifyEmptyDataTable() {
		DriverFactory.verifyElementPresent("//td[@class='dataTables_empty']");
	}

	public static void verifyEmployeeDataMatches(String name, String cpf, String gender, String role, String admissionDate) 
	{
		verifyNameMatches(name);
		verifyCPFMatches(cpf);
		verifyGenderMatches(gender);
		verifyRoleMatches(role);
		verifyAdmissionDateMatches(admissionDate);
	}
}
