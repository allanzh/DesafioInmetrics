package br.com.inmetrics.teste.stepDefinitions;

import br.com.inmetrics.test.core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void beforeExecution() {
		DriverFactory.getDriver();
	}
	
	@After
	public void afterExecution() {
		DriverFactory.killDriver();
	}
}
