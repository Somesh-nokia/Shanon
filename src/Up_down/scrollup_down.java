package Up_down;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

        public class scrollup_down {
	    public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		
		
	/*	
		Robot somesh = new Robot();
		somesh.keyPress(KeyEvent.VK_PAGE_DOWN);
		somesh.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		somesh.keyPress(KeyEvent.VK_PAGE_UP);
		somesh.keyRelease(KeyEvent.VK_PAGE_UP);
		*/
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,5000);");
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-5000);");

	
		
		
		
	}

		
		}

	
		

