package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod_usd {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shingsss\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver() ;
	driver.get("https://www.google.com/search?q=pmc&rlz=1C1CHBF_enIN974IN974&oq=&aqs=chrome.1.35i39i362l7j69i59i450.536700571j0j7&sourceid=chrome&ie=UTF-8");
    driver.navigate().to ("https://www.google.com/search?q=google&rlz=1C1CHBF_enIN974IN974&oq=google&aqs=chrome..69i57.3770j0j7&sourceid=chrome&ie=UTF-8");
    driver.navigate().to("https://www.amazon.in/");
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();

	
	
	
	
	}

}