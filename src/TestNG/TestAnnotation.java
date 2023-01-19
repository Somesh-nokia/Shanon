package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotation {
     /*   @BeforeClass 
        public void openBrowser() {
        	Reporter.log("open the Browser",true);  */
        @BeforeClass 
		public void openBrowser() {System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
			Reporter.log("Open Browser",true);
		}
		@BeforeMethod 
		public void ogintoApp() {
			Reporter.log("Login to App",true);
		}
		@Test
		public void verifyText() {
			Reporter.log("Running actual test case",true);
		}
		@BeforeClass
		public void logoutApp() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		    WebDriver driver= new ChromeDriver();
		    driver.get("https://www.landrover.in/vehicles/new-range-rover/index.html");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.manage().window().maximize();
			Reporter.log("Logout from App",true);
		}
		@AfterClass
		public void CloseBrowser() {
			Reporter.log("close browser",true);
		}
			

		}


