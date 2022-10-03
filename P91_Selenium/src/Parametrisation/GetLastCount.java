package Parametrisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//how to  row count in sheet :using getlastrownum()+1 method why +1 added in method because it count row from 0
public class GetLastCount {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("E:\\ExcelSheet1\\Sanjay.xlsx");
		int lastRowIndex = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
		System.out.println(lastRowIndex);
	}

}
