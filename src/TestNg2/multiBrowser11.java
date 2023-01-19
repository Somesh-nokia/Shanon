package TestNg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multiBrowser11 {
	@Parameters ("browsername")
	@Test

		public void openfirefox(String browsername) {
			WebDriver driver = null;
			if (browsername.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			   driver = new ChromeDriver();
			   
			}
			else if (browsername.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\shingsss\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
				 driver = new FirefoxDriver();
				
				
			}
		
			
			driver.get("https://www.amazon.in/");
			Reporter.log("open browser ",true);
			
			
		}




}
