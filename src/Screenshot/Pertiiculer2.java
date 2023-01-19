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

public class Pertiiculer2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.landrover.in/vehicles/new-range-rover/index.html");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	   WebElement abcs = driver.findElement(By.xpath("//img[@class='Picture__img']"));
	   
	   File src = abcs.getScreenshotAs(OutputType.FILE);
	   File dest = new File("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\RANGE ROVER\\range.jpg");
	   Files.copy(src, dest);
	   
	    
	
	
	
	
	
	
	
	
	
	
	
	}

}
