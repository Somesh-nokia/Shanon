package Keys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Somesh {
	public static void main (String [] args ) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver somesh = new ChromeDriver() ;
     
     somesh.get("https://demo.actitime.com/login.do");
		
		/*somesh.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
	Thread.sleep(2000);
	somesh.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	
	Thread.sleep(1000);
	somesh.findElement(By.xpath("//button[text()='Submit']")).click();*/
    
     
     somesh.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	
	
	}

}
