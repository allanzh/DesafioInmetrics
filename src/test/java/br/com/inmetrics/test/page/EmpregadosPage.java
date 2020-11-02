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

	public static void verifyNameMatches(String name) {
		Assert.assertTrue(DriverFactory.getText("(//td)[1]") == name);
	}

	public static void verifyCPFMatches(String cpf) {
		Assert.assertTrue(DriverFactory.getText("(//td)[2]") == cpf);
	}

	public static void verifyGenderMatches(String gender) {
		Assert.assertTrue(DriverFactory.getText("(//td)[3]") == gender);
	}

	public static void verifyRoleMatches(String role) {
		Assert.assertTrue(DriverFactory.getText("(//td)[4]") == role);
	}

	public static void verifyAdmissionDateMatches(String admissionDate) {
		Assert.assertTrue(DriverFactory.getText("(//td)[5]") == admissionDate);
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
