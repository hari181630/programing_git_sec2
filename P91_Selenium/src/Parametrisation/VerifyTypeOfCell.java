package Parametrisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyTypeOfCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("E:\\ExcelSheet1\\BBC.xlsx");
		Cell cellTypeData = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0);
		Cell cellTypeData1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0);
		CellType getDataType = cellTypeData1.getCellType();
		//if(TypeOfCell == getDataType) {
			
		//}
	}

}
