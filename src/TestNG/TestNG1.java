package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG1 {
	@Test
	public void Tc1 () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.landrover.in/vehicles/new-range-rover/index.html");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    Reporter.log("i am somesh ,how ar u testNg",true);

}
	@Test
	public void Tc2 () {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		    WebDriver driver= new ChromeDriver();
		    driver.get("https://www.google.com/");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.manage().window().maximize();
		Reporter.log("uman" ,true);
		
	}
	@Test
	public void Tc3 () {
		Reporter.log("atarman",true);
	}
	
}