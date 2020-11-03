package br.com.inmetrics.test.page;

import br.com.inmetrics.test.core.DriverFactory;

public class EditEmpregadoPage {
	
	public static void insertName(String value) {
		DriverFactory.setText("//input[@id='inputNome']", value);
	}
	
	public static void insertRole(String value) {
		DriverFactory.setText("//input[@id='inputCargo']", value);
	}
	
	public static void submit() {
		DriverFactory.click("//input[@type='submit']");
	}
}
