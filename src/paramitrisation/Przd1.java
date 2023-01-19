package paramitrisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Przd1 {
	public static void main(String[] args) throws Throwable {
		
		FileInputStream file = new FileInputStream("D:\\glasss\\G_1sir\\test case of jiomart.xlsx\\");
	    String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(10).getCell(2).getStringCellValue();
		System.out.println(data);
		
		
		
		
		// String data1 = WorkbookFactory.create(file).getSheet("sheet2").getRow(11).getCell(4).getStringCellValue();
		//System.out.println(data1);
	
	}

}
