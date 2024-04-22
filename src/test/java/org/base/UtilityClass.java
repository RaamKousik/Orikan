package org.base;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void launchUrl(String url) {

		driver.get(url);
	}
	
	public static void implWaits() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public static void clickWebElement(WebElement element) {

		element.click();
	}
	
	public static void passText(WebElement element, String txt) {
		
		element.sendKeys(txt);
	}
	
	public static void selectOption(WebElement element, int index) {

		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public static void scrollPage() {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0, 250)");
	}
	
	public static String retrieveText(WebElement element) {

		String text = element.getText();
		return text;
	}

}
