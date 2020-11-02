package br.com.inmetrics.test.page;

import org.junit.Assert;

import br.com.inmetrics.test.core.DriverFactory;

public class EmpregadosPage {
	
	public static void verifyIfLoggedIn() {
		Assert.assertTrue(DriverFactory.verifyElementPresent("//a[.='Sair']"));
	}
	
}
