package Keys;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_facebook {
	public static void main (String [] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver aai = new ChromeDriver();
		aai.get("https://www.facebook.com/");
		 aai.manage().window().maximize();
		
		Thread.sleep(1000);
		
		aai.findElement(By.xpath("//input[@id='email']")).sendKeys("sshinge3@gmsil.com",Keys.TAB,"Aai@1234",Keys.ENTER);
		
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		
		
		
		
		
	}

}
