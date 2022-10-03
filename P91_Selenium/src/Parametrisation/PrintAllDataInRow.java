package Parametrisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllDataInRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("E:\\ExcelSheet1\\Sanjay.xlsx");
		Sheet lastcellIndex= WorkbookFactory.create(file).getSheet("Sheet2");
		for(int i=0;i<=lastcellIndex.getRow(3).getLastCellNum()-1;i++) {
			String v = lastcellIndex.getRow(2).getCell(i).getStringCellValue();
			System.out.print(v);
		}
	}
}


