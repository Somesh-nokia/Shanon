package String;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class gettitle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shingsss\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.google.com/search?q=pmc&rlz=1C1CHBF_enIN974IN974&oq=&aqs=chrome.1.35i39i362l7j69i59i450.536700571j0j7&sourceid=chrome&ie=UTF-8");
		
		String title = driver.getTitle();
	 String url=driver.getCurrentUrl();
	 System.out.println(url);
		
		System.out.println(title);
		
		org.openqa.selenium.Dimension   dimm = new org.openqa.selenium.Dimension(10,20);
		
		driver.manage().window().setSize(dimm);
		
		driver.manage().window().minimize();
		
		
		String expt = "pmc - Google Search";
		String aqct = driver.getTitle();
		
		/*if (expt.equals(aqct) ) {
			System.out.println("tc will pass");
		}	
			else 
				System.out.println("tc will fail");
		
		
		*/
		Assert.assertEquals(expt, aqct);
		}
		
		
		
	}


