package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.support.ui.Select;

public class List_box {
public static void main(String[] args) throws Throwable {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver somesh = new ChromeDriver();
		somesh.get("https://www.facebook.com/");
		
		somesh.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(1000);
		  
		WebElement day =somesh.findElement(By.xpath("//select[@id='day']"));
		Select d = new Select (day);
		d.selectByValue("21");
		Thread.sleep(1000);
		WebElement month = somesh.findElement(By.xpath("//select[@id='month']"));
		Select m = new Select(month);
		m.selectByVisibleText("Feb");
		Thread.sleep(1000);
		WebElement year = somesh.findElement(By.xpath("//select[@id='year']"));
		Select y = new Select (year);
		m.selectByValue("2022");
		}
		}


	
	
	
	
	
	
	

