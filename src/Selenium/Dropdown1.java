package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown1 {
	public static void main (String [] args ) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	     WebDriver somesh1 = new ChromeDriver();
	
	somesh1.get("https://www.tatacliq.com/");
	Thread.sleep(2000);
	
	somesh1.findElement(By.xpath("//button[@id='wzrk-confirm']")).click();
	Thread.sleep(2000);
	
	

	  JavascriptExecutor jse =(JavascriptExecutor)somesh1;
	jse.executeScript("window.scrollBy(0,1000);");
	Thread.sleep(2000);
	
	jse.executeScript("window.scrollBy(0,-1000);");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,1000);");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,-1000);");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,1000);");
	Thread.sleep(2000);
	
	somesh1.findElement(By.xpath("//input[@id='search-text-input']")).sendKeys("neon jeans",Keys.ENTER);
	

		
		
		
		
	}

}
