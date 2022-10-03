package Parametrisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class VerifyTypeOfCell1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	FileInputStream file = new FileInputStream("E:\\ExcelSheet1\\BBC.xlsx");
	
	// Cell celltype = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0);
	 
	 org.apache.poi.ss.usermodel.Cell cellTypeData = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
