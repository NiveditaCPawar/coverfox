package excelworksheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("C:\\Users\\ypwr9\\OneDrive\\Documents\\NewSheet.xlsx");
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		
		Sheet mySheet = myWorkbook.getSheet("Sheet4");
		int lastRow = mySheet.getLastRowNum();
		int totalRow = lastRow;
		
		short lastCell = mySheet.getRow(0).getLastCellNum();
		int totalCell = lastCell-1;
		
		for(int i=0;i<=totalRow;i++) {
			for(int j=0;j<=totalCell;j++) {
				CellType data = mySheet.getRow(i).getCell(j).getCellType();
				if(data==CellType.STRING) {
					 String value = mySheet.getRow(i).getCell(j).getStringCellValue();
					 System.out.print(value+" ");
				}
				else if(data==CellType.NUMERIC) {
					double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(data==CellType.BOOLEAN) {
					boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(value+" ");
				}
			}System.out.println();
		}

	}

}
