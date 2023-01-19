package Iframes;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class iframes1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		//formaximize of webpage
		driver.manage().window().maximize();
		//global type of wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	    driver.switchTo().frame("packageListFrame");
	   /*try to gate exception whenever you usd class locator
	    driver.switchTo().frame("classFrame"); */
	    
	    String text = driver.findElement(By.xpath("//h2 [text()='Packages']")).getText();
	   String text1 = driver.findElement(By.xpath("//a [text()='org.openqa.selenium.grid.distributor']")).getText();
	    
	    System.out.println(text);
	    System.out.println(text1);
	    
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    
	    jse.executeScript("window.scrollBy(0,2000);");
	    jse.executeScript("window.scrollBy(0,-2000);");
	    
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    
          File src = ts.getScreenshotAs(OutputType.FILE);		
		File dest = new File("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\A\\iframe.jpg");
		Files.copy(src, dest);
	/*	
		 WebElement abc = driver.findElement(By.xpath("//div[@class='contentContainer']"));
	 	      File src1 = abc.getScreenshotAs(OutputType.FILE);
	 	      File dest2 = new File("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\A\\ss2.png");
	 	      Files.copy(src1, dest2);
		
		*/
		
		
	}
	
	
	
	
	
	

}
