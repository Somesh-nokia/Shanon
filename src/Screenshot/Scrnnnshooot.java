package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Scrnnnshooot {
	public static void main(String [] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shingsss\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.google.com/search?q=gooogle&ie=utf-8&oe=utf-8&client=firefox-b-ab");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\A\\somesh.jpg");
	    Files.copy(src, dest);
	    
	
	
	
	
	}

}
