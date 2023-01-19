package Test_Ng7;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Suite_create_first {
	    @Test
	    public void T1() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shingsss\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	
		
	}
}
