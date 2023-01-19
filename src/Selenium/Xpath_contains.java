package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	Thread.sleep(1000);
	
	}


}
