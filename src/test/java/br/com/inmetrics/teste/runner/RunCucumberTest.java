package br.com.inmetrics.teste.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"br.com.inmetrics.teste.stepDefinitions"}, dryRun = false)

public class RunCucumberTest{}