package Parametrisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("E:\\Book1.xlsx");
	  String book = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	System.out.println(book);
	
//	Sheet sh = book.getSheet("Sheet1");
//	Row rw = sh.getRow(3);
//	Cell ce = rw.getCell(1);
//	String value = ce.getStringCellValue();
//	System.out.println(value);
}
}