package Parametrisation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCountColumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("E:\\ExcelSheet1\\Sanjay.xlsx");
		int columnSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
		System.out.println(columnSize);
	}
}
