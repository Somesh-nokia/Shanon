package TestNg2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class tryfforPara {
	@Test
	public void varifythExelsheet() throws Throwable {

		FileInputStream file = new FileInputStream("D:\\glasss\\G_1sir\\test case of jiomart.xlsx\\");
	    String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(10).getCell(2).getStringCellValue();
		System.out.println(data);
		
	    Reporter.log("try to open shet",true);
	    
		
	}

}
