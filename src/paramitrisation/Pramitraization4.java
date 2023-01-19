package paramitrisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Pramitraization4 {
	public static void main(String args []) throws Throwable, Throwable {
		FileInputStream file = new FileInputStream("C:\\Users\\shingsss\\OneDrive\\Documents\\vfb_history\\Desktop\\Copy of TAKALE_ESTIMATE.xls");
		String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);

}
}