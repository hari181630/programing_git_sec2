package Parametrisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("E:\\ExcelSheet1\\Excel1.xlsx");
	 short cellRowsCount = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
	 System.out.println(cellRowsCount);
}
}
