package br.com.inmetrics.test.page;

import br.com.inmetrics.test.core.DriverFactory;

public class NewEmpregadoPage {

	public static void insertName(String value) {
		DriverFactory.setText("//input[@id='inputNome']", value);
	}

	public static void insertCPF(String value) {
		DriverFactory.setText("//input[@id='cpf']", value);
	}

	public static void selectGender(String gender) {
		DriverFactory.click("//select[@id='slctSexo']");

		switch (gender) {
		case "Masculino":
			DriverFactory.click("//option[.='Masculino'] ");
			break;

		case "Feminino":
			DriverFactory.click("//option[.='Feminino']");
			break;

		case "Indiferente":
			DriverFactory.click("//option[.='Indiferente']");
			break;
		}

	}

	public static void insertAdmissionDate(String value) {
		DriverFactory.setText("//input[@id='inputAdmissao']", value);
	}

	public static void insertRole(String value) {
		DriverFactory.setText("//input[@id='inputCargo']", value);
	}

	public static void insertSalary(String value) {
		DriverFactory.setText("//input[@name='salario']", value);
	}

	public static void chooseContractModel(String contractModel) {
		switch (contractModel) {
		case "clt":
			DriverFactory.click("//input[@type='radio' and @value='clt']");
			break;

		case "pj":
			DriverFactory.click("//input[@type='radio' and @value='pj']");
			break;
		}
	}

	public static void submit() {
		DriverFactory.click("//input[@type='submit']");
	}

	public static void reset() {
		DriverFactory.click("//input[@type='reset']");
	}
}