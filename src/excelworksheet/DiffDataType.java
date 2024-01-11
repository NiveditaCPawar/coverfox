package excelworksheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DiffDataType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("C:\\Users\\ypwr9\\OneDrive\\Documents\\book1.xlsx");
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkbook.getSheet("Sheet2");
		int lastRowNum = mySheet.getLastRowNum();
		int totalRowNum = lastRowNum;
		
		short lastCellNum = mySheet.getRow(0).getLastCellNum();
		int totalCellNum = lastCellNum-1;
		
		for(int i=0;i<=totalRowNum;i++) {
			for(int j=0;j<=totalCellNum;j++) {
				CellType dataType = mySheet.getRow(i).getCell(j).getCellType();
				
				if(dataType==CellType.STRING) 
				{
					String data1 = mySheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(data1+"  ");
				}
				else if(dataType==CellType.NUMERIC)
				{
					double data2 = mySheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(data2+"  ");
				}
				else if(dataType==CellType.BOOLEAN)
				{
					boolean data3 = mySheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(data3+"  ");
				}
				else{
					System.out.println(" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
