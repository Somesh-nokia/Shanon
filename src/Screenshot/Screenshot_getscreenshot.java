package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_getscreenshot {
	public static void main (String [] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver somesh = new ChromeDriver();
	somesh.get("https://www.google.com/search?q=speed+test&rlz=1C1CHBF_enIN974IN974&oq=&aqs=chrome.0.35i39i362l8.351713207j0j7&sourceid=chrome&ie=UTF-8");
	somesh.manage().window().maximize();
	Thread.sleep(2000);
	TakesScreenshot ts =(TakesScreenshot)somesh;
	 
	 File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\RANGE ROVER\\namu.jpg");
	Files.copy(src, dest);
	
		
		
		
		
		
		
		
		
		
		
		
}
}