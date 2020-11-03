package br.com.inmetrics.test.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			createDriver();
		}
		return driver;
	}

	private static void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:/GitPessoal/java/DesafioInmetrics/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			// driver.close();
		}
		driver = null;
	}

	public static void delay(int milis) {
		try {
			Thread.sleep(milis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void setText(String xpath, String value) {
		if(getText(xpath) != "") {
			driver.findElement(By.xpath(xpath)).clear();
		}
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}

	public static void click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public static Boolean verifyElementPresent(String xpath) {
		return (driver.findElement(By.xpath(xpath)) != null);
	}

	public static String getText(String xpath) {
		return DriverFactory.getDriver().findElement(By.xpath(xpath)).getText().trim();
	}

}
