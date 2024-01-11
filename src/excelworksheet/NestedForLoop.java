package excelworksheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NestedForLoop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("C:\\Users\\ypwr9\\OneDrive\\Documents\\book1.xlsx");
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		Sheet mysheet = myWorkbook.getSheet("Sheet1");
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				String table = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(table+" ");
			}
			System.out.println();
		}

	}

}
