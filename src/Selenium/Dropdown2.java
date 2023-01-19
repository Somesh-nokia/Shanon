package Selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {
	public static void main(String [] args) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		Thread.sleep(2000);
		WebDriver someshwar = new ChromeDriver();
		Thread.sleep(2000);
		someshwar.get("https://www.jiomart.com/");
		Thread.sleep(2000);
		someshwar.findElement(By.xpath("//div[@class='menu_section']")).click();
		
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)someshwar;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,100);");  
		
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
