package data_driven_frame_work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class A {
	public static void main(String[] args) throws Throwable {
		FileInputStream fie = new FileInputStream("D:\\glasss\\ankush_sir\\actitime.xlsx");
		Sheet sh =WorkbookFactory.create(fie).getSheet("sheet1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do"); 
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String un=sh.getRow(0).getCell(0).getStringCellValue();
		
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	    
		String pwd =sh.getRow(0).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		


		
	








}


}
	
