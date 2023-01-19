package Selenium;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {
	public static void main (String [] args ) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver somesh = new ChromeDriver();
		
		somesh.get("https://www.croma.com/");
		//typecast
		JavascriptExecutor jre =(JavascriptExecutor)somesh;
		Thread.sleep(1000);
		jre.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(1000);
		jre.executeScript("window.scrollBy(0,-1000);");
		
		String expT = "Croma Electronics | Online Electronics Shopping | Buy Electronics Online";
		String actT = somesh.getTitle();
		if (expT.equals(actT)) {
			System.out.println("TC is pass");
			
		}
		else {
			System.out.println("TC is fail");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
