package TestNg2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multiBrowser22 {
	@Parameters ("browsername")
	@Test
	public void verfyopenchrome(String browsername) {
		WebDriver driver = null;
	if (browsername.equals("Firefox")) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shingsss\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	    driver = new FirefoxDriver();
	}    
	else if (browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
	   
		
	}	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		/* driver.findElement(By.xpath("\\\\input[@id='email']")).sendKeys("sshinge3@gmail.com"); */
		
		JavascriptExecutor jse =  (JavascriptExecutor) driver;  
		jse.executeAsyncScript("window.scrollBy(0,11);");
		
		//driver.close();
	}
	}


