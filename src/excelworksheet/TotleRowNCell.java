package excelworksheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TotleRowNCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("C:\\Users\\ypwr9\\OneDrive\\Documents\\book1.xlsx");
		Workbook workbook = WorkbookFactory.create(myFile);
		Sheet sheet = workbook.getSheet("Sheet1");
		
		int lastRow = sheet.getLastRowNum();
		System.out.println(lastRow);
		System.out.println("================");
		short lastCell = sheet.getRow(0).getLastCellNum();
		System.out.println(lastCell);
	}

}
