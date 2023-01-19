package paramitrisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Przd2 {
	public static void main(String [] args) throws Throwable {
		FileInputStream file2 = new FileInputStream("D:\\glasss\\G_1sir\\test case of jiomart.xlsx\\");
		  String data2 = WorkbookFactory.create(file2).getSheet("sheet1").getRow(12).getCell(4).getStringCellValue();
		System.out.println(data2);
		
		
		
		
	}

}
