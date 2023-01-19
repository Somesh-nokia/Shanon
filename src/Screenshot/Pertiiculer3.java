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

public class Pertiiculer3 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	   driver.get("https://www.rolex.com/en-us"); 
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   driver.manage().window().maximize();
       WebElement abdd = driver.findElement(By.xpath("//div[@class='sc-fzqKVi eewPUi']"));
       File src = abdd.getScreenshotAs(OutputType.FILE );
       File dest = new File("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\ROLEX\\rolexx.jpg");
       Files.copy(src, dest);
	    
	    
	    
	}
}
