package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class S {
	

	public static void main ( String [] args ) throws Throwable {
	System.setProperty ("webdriver.chrome.driver","C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get ("https://www.jiocinema.com/");
	
	TakesScreenshot tsn = (TakesScreenshot) driver;
	  File src = tsn.getScreenshotAs(OutputType.FILE);
	  
	  
	 File dest = new File("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\RANGE ROVER\\jiocinema home page.png");
	 Files.copy(src, dest);
       

	  

	/* "C:\Users\shingsss\OneDrive\Documents\vfb_history\Desktop\RANGE ROVER"*/
}
}