package data_driven_frame_work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	public static void main (String [] args) throws Throwable {
		FileInputStream file2 = new FileInputStream("D:\\glasss\\ankush_sir\\actitime,facebook.xlsx");
		  Sheet sh1 = WorkbookFactory.create(file2).getSheet("sheet1");
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000000000));
	
	String un = sh1.getRow(0).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input [@id='email']")).sendKeys(un);
	
	String pwd = sh1.getRow(1).getCell(2).getStringCellValue();	
	driver.findElement(By.xpath("//input [@id='pass']")).sendKeys(pwd);
	 
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
	}

}
