package excelworksheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Practice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("C:\\Users\\ypwr9\\OneDrive\\Documents\\NewSheet.xlsx");
		Workbook workbook = WorkbookFactory.create(myFile);
		Sheet sheetnum = workbook.getSheet("Sheet1");
		 int lastRow = sheetnum.getLastRowNum();
		 int totalRowNum = lastRow;
		 System.out.println(totalRowNum);
		 
		 short lastCell = sheetnum.getRow(0).getLastCellNum();
		 int totalCellNum = lastCell-1;
		 System.out.println(totalCellNum);
		 
		 for(int i=0;i<=totalRowNum;i++) {
			 for(int j=0;j<=totalCellNum;j++) {
				 CellType type = sheetnum.getRow(i).getCell(j).getCellType();
				 if(type==CellType.STRING)
				 {
					 String value = sheetnum.getRow(i).getCell(j).getStringCellValue();
					 System.out.print(value+"   ");
				 }
				 else if(type==CellType.NUMERIC) {
					double value = sheetnum.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value+"   ");
				 }
				 }
			 System.out.println();
		 }
		 
	}

}
