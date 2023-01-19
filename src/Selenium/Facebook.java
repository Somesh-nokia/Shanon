package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shingsss\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver() ;
	
	driver.get("https://www.facebook.com/");
	
	
	
	
	driver.findElement(By.id("email")).sendKeys("sshinge3@gmail.com");
	Thread.sleep (5000);
	driver.findElement(By.id("pass")).sendKeys("12345882162");

	driver.findElement(By.name("login")).click();
	
	
	
	
	Thread.sleep (1000);
	
	driver.manage().window().minimize();

	
	String expT = "Log in to Facebook";
	Thread.sleep (1000);
	String actT = driver.getTitle();
	System.out.println(actT);
	if (expT.equals(actT)) {
		System.out.println("TC is pass");
	}
	else {
		System.out.println("TC is fail");
	
	}
    
	
	
	
	
	
	
		
	}

}
