package org.orikan.pojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sinkaravelSST@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("567887654");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
	}

}
