package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class suiteForMultyBrowser {
	@Parameters("browsername")
	 @Test
	 public void tc1 (String browsername) {
		 WebDriver driver = null;
		 if (browsername.equals("chrome")) {
			 
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		 }
		 else if (browsername.equals("firefox")) {
			 System.setProperty("webdriver.gekco.driver", "C:\\Users\\shingsss\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			 driver= new FirefoxDriver();
		 }
		 driver.get("https://www.facebook.com/");
		 }
		 
	 }