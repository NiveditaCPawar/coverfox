package excelworksheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CellCount {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("C:\\Users\\ypwr9\\OneDrive\\Documents\\book1.xlsx");
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		Sheet mySheetnum = myWorkbook.getSheet("Sheet2");
		int lastRowsNum = mySheetnum.getLastRowNum();
		int totalRow = lastRowsNum;
		System.out.println(totalRow);
		System.out.println("============================");
		short lastCellNum = mySheetnum.getRow(0).getLastCellNum();
		Object totalCellNum = lastCellNum-1;
		System.out.println(totalCellNum);
		
		
		
		
	}

}
