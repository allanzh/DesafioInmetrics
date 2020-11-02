package br.com.inmetrics.test.page;

import java.util.Locale;
import com.github.javafaker.Faker;
import br.com.inmetrics.test.core.DriverFactory;
import br.com.inmetrics.teste.support.Utils;

public class NewEmpregadoPage {
	
	public static String name, CPF, gender, admissionDate, role, salary, contractModel;

	public static void insertName(String value) {
		DriverFactory.setText("//input[@id='inputNome']", value);
	}

	public static void insertCPF(String value) {
		DriverFactory.setText("//input[@id='cpf']", value);
	}

	public static void selectGender(String gender) {
		DriverFactory.click("//select[@id='slctSexo']");

		switch (gender) {
		case "Male":
			DriverFactory.click("//option[.='Masculino'] ");
			NewEmpregadoPage.gender = "Masculino";
			break;

		case "Female":
			DriverFactory.click("//option[.='Feminino']");
			NewEmpregadoPage.gender = "Feminino";
			break;

		default:
			DriverFactory.click("//option[.='Indiferente']");
			NewEmpregadoPage.gender = "Indefinido";
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
	
	public static void createNewEmployee() {
		generateEmployeeData();
		
		insertName(name);
		insertCPF(CPF);
		selectGender(gender);
		insertAdmissionDate(admissionDate);
		insertRole(role);
		insertSalary(salary);
		chooseContractModel(contractModel);
		DriverFactory.delay(1000);
		submit();
	}
	
	public static void generateEmployeeData() {
		Faker fake = new Faker(new Locale("pt-BR"));		
		name = fake.name().fullName().toString();
		CPF = Utils.gerarCPF(true); 
		gender = fake.demographic().sex().toString();
		admissionDate = Utils.todayDateFormatted();
		role = fake.job().title().toString();
		salary = "100000";
		contractModel = "clt";
		
	}
	
}