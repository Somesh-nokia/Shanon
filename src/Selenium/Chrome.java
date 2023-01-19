package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shingsss\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver() ;
	driver.get("https://www.google.com/search?q=pmc&rlz=1C1CHBF_enIN974IN974&oq=&aqs=chrome.1.35i39i362l7j69i59i450.536700571j0j7&sourceid=chrome&ie=UTF-8");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.manage().window().minimize();
		
	}

}
