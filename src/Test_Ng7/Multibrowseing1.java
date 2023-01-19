package Test_Ng7;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Multibrowseing1 {
	@Parameters ("browsername")
	@Test
	public void T1 (String browsername ) throws Throwable {
		WebDriver driver = null ;
		if (browsername.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shingsss\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		     driver = new FirefoxDriver();	
		     TakesScreenshot ts =  (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\A\\somesh.png");
				Files.copy(src, dest);
	}
	else if (browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
     driver = new ChromeDriver();
     TakesScreenshot ts =  (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\A\\somesh1.png");
		Files.copy(src, dest);
			
	}	
		
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
	//	driver.navigate().refresh();
		driver.navigate().forward();
		
	/*	TakesScreenshot ts =  (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\A\\somesh.png");
		Files.copy(src, dest);
	*/
	}

}
