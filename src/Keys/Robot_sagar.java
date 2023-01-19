package Keys;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_sagar {
	public static void main (String [] sargs ) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver somesh = new ChromeDriver();
		somesh.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders%3Flink%3Dhome_orders&fromMyOrdersPage=true");
		
	/*	Robot p =new Robot();
		p.keyPress(KeyEvent.VK_PAGE_DOWN);
		p.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		p.keyPress(KeyEvent.VK_PAGE_DOWN);
		p.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		p.keyPress(KeyEvent.VK_PAGE_DOWN);
		p.keyRelease(KeyEvent.VK_PAGE_DOWN);
		*/
		
		Thread.sleep(3000);
		somesh.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]")).sendKeys("9021588887");
		Thread.sleep(2000);
		somesh.findElement(By.xpath("//span[contains(text(),'Forgot?')]")).click();
		Thread.sleep(2000);
		somesh.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]")).sendKeys("291352");
		Thread.sleep(3000);
	     somesh.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Wam@1234");
		Thread.sleep(3000);
		somesh.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd _3AWRsL')]")).click();
		Thread.sleep(2000);
		somesh.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]")).sendKeys("9021588887");
		Thread.sleep(2000);
		somesh.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Wam@1234");
		Thread.sleep(2000);
		somesh.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		
		/*somesh.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]")).sendKeys("9021588887",Keys.TAB,"Aai@1234",Keys.ENTER);*/
		
	/*somesh.findElement(By.xpath("//button[contains(text(),'Request OTP')]")).click();
	Thread.sleep(1000);
	somesh.findElement(By.xpath("//p[contains(text(),'Press & Hold')] "));
		
		/*somesh.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]")).sendKeys("9021588887",Keys.TAB,"Aai@1234",Keys.ENTER);*/
		
		 
		/*Thread.sleep(1000);
		somesh.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("i phone 14 pro");
		Thread.sleep(2000);
		somesh.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
		/*Thread.sleep(3000);
		somesh.findElement(By.xpath("//span[contains(text(),'Optimum CP Gold Aquarium Flake Fish Food For All Life Stages, 100 G')]")).click();
		*/
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		
		
		
	}

}
