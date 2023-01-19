package Keys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_practice {
	public static void main (String [] args ) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver namu = new ChromeDriver();
	namu .get("https://practicetestautomation.com/practice-test-login/");
	Thread.sleep(2000);
	namu.findElement(By.xpath("//input[@id='username']")).sendKeys("student",Keys.TAB,"Password123",Keys.ENTER);
	Thread.sleep(2000);
	
	
	
	
	}

}
