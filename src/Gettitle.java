import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Gettitle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.amazon.in/");
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().minimize();
		
		String expT = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String aqtT = driver.getTitle();
		
		Assert.assertEquals(expT,aqtT);
		
	/*	if (expT.equals(aqtT) ) {
			System.out.println("tc is pass");
		}
			
			else  {
				System.out.println("tc is fail");
			}
			*/
		}
		
}	
		

