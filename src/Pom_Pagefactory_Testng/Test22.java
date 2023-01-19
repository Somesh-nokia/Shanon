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

public class Test22 {
	 Sheet shh;
	 WebDriver driver;
	 LoginPage22 l1;
	 HomePage22 h1;
	 FileInputStream file;
	@BeforeClass
	public void openbroweer() throws Throwable {
		FileInputStream file = new FileInputStream("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\Book17.xlsx");
	    Sheet shh = WorkbookFactory.create(file).getSheet("sheet1");
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\shingsss\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    LoginPage22 l1= new LoginPage22(driver);
	    HomePage22 h1 = new HomePage22(driver);
	    
	}
	@BeforeMethod
	public void openloginpage() {
		   String username = shh.getRow(0).getCell(0).getStringCellValue();
		   l1.username1(username);
		     String password = shh.getRow(0).getCell(1).getStringCellValue();
		   l1.password1(password);
		   
	}
	
	
	@Test
	public void openhomepage() {
		 String expT = shh.getRow(0).getCell(2).getStringCellValue();
		String actT = h1.verifytext();
		
		
	}
	@AfterMethod
	public void logout() {
		Reporter.log("loggout",true);
	}
	@AfterClass
	public void close() {
		Reporter.log("close",true);
	}
	  
	 
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

	
	
	
	
	
	
	
