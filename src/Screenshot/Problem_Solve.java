package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Problem_Solve {
	public static void main(String[] args) throws Throwable {
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver  driver = new ChromeDriver();
			driver.get("https://www.landrover.in/vehicles/new-range-rover/index.html");
			
			
         WebElement add = driver.findElement(By.xpath("//span[@class='dxnav__breadcrumb-text']"));
                    File src = add.getScreenshotAs(OutputType.FILE);
                    File dest = new File("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\A\\perticuler.jpg");
		            Files.copy(src, dest);
		
	}

}
