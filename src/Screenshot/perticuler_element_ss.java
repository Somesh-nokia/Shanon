package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class perticuler_element_ss {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.mysql.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
	driver.manage().window().maximize();
	WebElement abcc =driver.findElement(By.xpath("//a[@id='l1-home-link']"));
	
	 File src = abcc.getScreenshotAs(OutputType.FILE);
	 File dest = new File("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\RANGE ROVER\\perticuler img.jpg");
	 Files.copy(src, dest);
	
	 
	
	 
	 
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	

}
