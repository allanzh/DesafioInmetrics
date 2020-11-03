package br.com.inmetrics.teste.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags="@rodar",
		features="src/test/resources/Features", 
		glue= {"br.com.inmetrics.teste.stepDefinitions"}, 
		monochrome=true,
		plugin= {"pretty", "html:target/HtmlReports/Report.html"})

public class RunCucumberTest{}