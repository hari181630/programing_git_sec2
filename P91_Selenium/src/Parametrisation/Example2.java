package Parametrisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("E:\\ExcelSheet1\\Excel1.xlsx");
	  int excel1 = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	  int rowCount =excel1 + 1;
	 System.out.println(rowCount);
	}

}
