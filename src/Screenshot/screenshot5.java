package Screenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot5 {
	
	public static void main (String [] args ) throws Throwable {
    System.setProperty ("webdriver.chrome.driver","C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/search?q=mysql&oq=&aqs=chrome.1.35i39i362l7j69i59i450.402124278j0j7&sourceid=chrome&ie=UTF-8");
	driver.manage().window().maximize();
	//screenshot save in file

	TakesScreenshot ts = (TakesScreenshot)driver;
	
 	 File src = ts.getScreenshotAs(OutputType.FILE);
 	 File dest = new File("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\A\\name.jpg");
 	 com.google.common.io.Files.copy(src, dest);
	


}
}