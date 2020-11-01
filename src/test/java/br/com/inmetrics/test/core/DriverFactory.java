package br.com.inmetrics.test.core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver == null) { createDriver(); }
		return driver;
	}
		
	private static void createDriver() {
		System.setProperty("webdriver.chrome.driver","C:/GitPessoal/java/teste-inmetrics/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void killDriver() {
		if(driver != null) { 
			driver.quit();
			driver.close();
		} 
		driver = null;
	}
}
