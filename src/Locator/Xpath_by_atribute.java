package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class Xpath_by_atribute {
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	 Thread.sleep (1000);
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(1000);
		
	driver.findElement(By.xpath("//div[text()='Login ']")).click();	
	Thread.sleep(1000);
	
	driver.manage().window().minimize();
	
	 String expT = "actiTIME - Enter Time-Track";
	  
	 String actT = driver.getTitle();
	 System.out.println(actT);
	 
	 if (expT.equals(actT)) {
		 System.out.println("Tc will PASS");
	 }
	 else {
		 System.out.println("Tc will fail");
		 
	 }
	 }
     }


		
	
