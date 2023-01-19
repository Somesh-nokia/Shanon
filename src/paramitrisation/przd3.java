package paramitrisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class przd3 {
	public static void main(String[] args) throws Throwable {
		
		FileInputStream file = new FileInputStream("D:\\glasss\\G_1sir\\test case Template.xlsx\\");
		 String data3 =WorkbookFactory.create(file).getSheet("sheet1").getRow(18).getCell(1).getStringCellValue();
		System.err.println(data3);
		
		
		
		
		
	}

}
