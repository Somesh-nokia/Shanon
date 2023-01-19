package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 {
	public static void main (String [] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
	WebDriver namu = new ChromeDriver();
	
	//forr get web 
	namu.get("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(3000);
	
	//for window view full screen
	namu.manage().window().maximize();
	Thread.sleep(2000);	
	// for scrolldown we usd jacvascriptexecutorinteface
	JavascriptExecutor jre =(JavascriptExecutor)namu;
	Thread.sleep(2000);
	jre.executeScript("window.scrollBy(0,500);");
	Thread.sleep(2000);
	//Radio button
	
	namu.findElement(By.xpath("//input[@name='radio'] [2]")).click();
	Thread.sleep(2000);
	
	//for search any thing on bar
	namu.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("namu");
	//for drop down
		WebElement dd = namu.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Thread.sleep(2000);
		Select d1= new Select(dd);
		d1.selectByValue("option1");
		Thread.sleep(1000);
		WebElement dd12 = namu.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select d2 = new Select(dd12);
		d2.selectByValue("option3");
		
		//for drop down
		WebElement dd3 = namu.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Thread.sleep(2000);
		Select d15= new Select(dd3);
		d15.selectByValue("option1");
		Thread.sleep(1000);
		WebElement dd1 = namu.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select d26 = new Select(dd1);
		d26.selectByValue("option3");
		
		
			
	//checkbox
	Thread.sleep(2000);
	namu.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	Thread .sleep(2000);
	JavascriptExecutor jse =(JavascriptExecutor)namu;
	jse.executeScript("window.scrollBy(0,500);");
	
	Thread.sleep(2000);
	namu.findElement(By.xpath("//button[@id='openwindow']")).click();
	Thread.sleep(2000); 
	namu.findElement(By.xpath("//input[@id='name']")).sendKeys("namusomesh",Keys.TAB.TAB.TAB,Keys.ENTER);
	Thread.sleep(2000);
	
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*  namu.findElement(By.xpath("//input[@id='hide-textbox']")).click();
	
	
	
	/*namu.findElement(By.xpath("//a[@id='opentab']")).click();  */
	
	
	
	
	
	
	
	
	
	
	
	/*namu.manage().window().minimize();
	 * 
	 * /*namu.navigate().back();*/
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
	}

}
