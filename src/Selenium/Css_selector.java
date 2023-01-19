package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://practicetestautomation.com/practice-test-login/");
	
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("student");
		
	driver.findElement(By.cssSelector("input[type='password']")) .sendKeys("Password123");
	
	driver.findElement(By.xpath("//button[@ id='submit']")).click();
	
	
	
	String expT = "";
	String aqct = driver.getTitle();
	
	if (expT.equals(aqct)) {
		System.out.println("test cases iss pass");
		
	}
	
	else 
		System.out.println("test cases is fail");
	}
	
	
}
	

		
		
		
