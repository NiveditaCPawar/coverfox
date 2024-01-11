package excelworksheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ForRowAndCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("C:\\Users\\ypwr9\\OneDrive\\Documents\\book1.xlsx");
		Workbook book = WorkbookFactory.create(myFile);
		Sheet mySheet = book.getSheet("Sheet1");
		//read whole row
		for(int i=0;i<=2;i++) {
			String value = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value+" ");
		}
		System.out.println("=====================================");
		for(int i=0;i<=2;i++) {
			String value2 = mySheet.getRow(i).getCell(0).getStringCellValue();
			System.out.print(value2+" ");
		}
	}

}
