package Pom_Pagefactory_Testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Text12 {
	FileInputStream file;
	 Sheet sh1;
	WebDriver driver;
	 
	 Login_page1 l ;
	 Home_page2 h;
	@BeforeClass
	public void openTheBroswe() throws Throwable {
		FileInputStream file = new FileInputStream("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\Book17.xlsx");
		  sh1 = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shingsss\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	     driver = new FirefoxDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	     l=new Login_page1(driver);
	     h =new Home_page2(driver);
	    }
	@BeforeMethod 
	public void openLoginpage() {
		String username = sh1.getRow(0).getCell(0).getStringCellValue();
		l.userName(username);
		String password = sh1.getRow(0).getCell(1).getStringCellValue();
		l.passWord(password);
		l.clicklogin();
	}
    @Test
    public void verifytextt() {
    	String expect = sh1.getRow(0).getCell(2).getStringCellValue();
    	String aqct = h.verifytext();
    	
    }
    @AfterMethod 
    public void logout () {
    	Reporter.log("logout the browser",true);
    	
    }
  @AfterClass 
  public void closethebrowser ( ) {
	  Reporter.log("close the browswer",true);
  }

}





