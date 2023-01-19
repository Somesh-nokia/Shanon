package Pom_Pagefactory_Testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page_Object_Model.LoginPage;
import page_Object_Model.homePage;

public class Test1<HomePage1> {
	Sheet sh;
	WebDriver driver;
	Loging_page l;
	homePage h;
	
	@BeforeClass
	public  void openBrower() throws Throwable {
		FileInputStream fis =new FileInputStream("C:\\Users\\shingsss\\OneDrive\\Documents\\Book1111111.xlsx");
		 sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shingsss\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		//all objects we need to create
		l=new Loging_page(driver);
		 h=new homePage(driver);
	}
	@BeforeMethod
	public void openApp() {
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		l.enterUN(username);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		l.enterPWD(password);
		l.clickLoginBtn();
	}
	@Test
	public void verifyText() {
		Reporter.log("Running VerifyText",true);
		String expText = sh.getRow(0).getCell(2).getStringCellValue();
		String actText = h.verifyText();
	  Assert.assertEquals(expText,actText);
		
		
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout from app",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the browser",true);
	}

}
