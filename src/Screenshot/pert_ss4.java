package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class pert_ss4 {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shingsss\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	
	}
		
	
	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.co.in/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	driver.manage().window().maximize();
	WebElement Ns = driver.findElement(By.xpath("//a[@class='gb_j']"));
        File src = Ns.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\ROLEX\\gemail.jpg");
        Files.copy(src, dest);
    	


}
//a[@class='gb_j'] }   //img[@class='gb_Dc'] */
	}