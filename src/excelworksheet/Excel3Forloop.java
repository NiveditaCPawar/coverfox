package excelworksheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel3Forloop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile=new FileInputStream("C:\\Users\\ypwr9\\OneDrive\\Documents\\book1.xlsx");
		
		Workbook myWokrbook = WorkbookFactory.create(myfile);
		Sheet mySheet = myWokrbook.getSheet("Sheet1");
		
		for(int i=0;i<=2;i++) {
			String sheet = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(sheet);
		}
		

	}

}
