package excelworksheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import misc.CommonMethods;

public class Excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfie=new FileInputStream("C:\\Users\\ypwr9\\OneDrive\\Documents\\Book1.xlsx");
		String value = WorkbookFactory.create(myfie).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		
		CommonMethods.excelsheet(2, 2);
	}

}
