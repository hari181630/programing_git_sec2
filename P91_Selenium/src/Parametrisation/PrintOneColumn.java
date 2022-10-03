package Parametrisation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintOneColumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream file= new FileInputStream("E:\\ExcelSheet1\\Sanjay.xlsx");
		Sheet sh= WorkbookFactory.create(file).getSheet("Sheet2");
		int lastIndexRow = sh.getLastRowNum();
		for(int i=0;i<=lastIndexRow;i++)
		{
			String s1=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.print(s1+" ");
		}
}
}