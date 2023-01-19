package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle_Rolex {
	public static void main (String [] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
	 WebDriver someshwar = new ChromeDriver();
	 Thread.sleep(2000);
		someshwar.get("https://www.rolex.com/en-us");
		Thread.sleep(2000);
		/*someshwar.findElement(By.xpath("//button[text()='LOGIN']")).sendKeys(Keys.TAB.TAB.TAB.ENTER); */
		Thread.sleep(2000);
		
		someshwar.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor jse =(JavascriptExecutor) someshwar;
		jse.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,-1000);");
		Thread.sleep(2000);
		
	/*	String expT = "Official Rolex Website - Swiss Luxury Watches";
		String actT =someshwar.getTitle();
		if (expT.equals(actT))  {
			System.out.println("TC wil pass");
			
		}
		else {
			System.out.println("TC is fail");  */
		
		someshwar.findElement(By.xpath("//button[@class='sc-pbxSd cHQRIT']")).click();
		Thread.sleep(3000);
	/*	
		JavascriptExecutor jre =(JavascriptExecutor) someshwar;
		jre.executeAsyncScript("window.scrollBy(0,500);");
		Thread.sleep(3000);
		someshwar.findElement(By.xpath("//a[text()='About Rolex.org']")).click();
		*/
			
			 
			
			someshwar.manage().window().minimize();
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
	}
	

	
	

