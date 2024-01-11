package excelworksheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream file=new FileInputStream("C:\\Users\\ypwr9\\OneDrive\\Documents\\book1.xlsx");
		
		Workbook myfile = WorkbookFactory.create(file);
		Sheet mysheet = myfile.getSheet("sheet1");
		Row myrow = mysheet.getRow(1);
		Cell mycell = myrow.getCell(0);
		CellType datatype = mycell.getCellType();
		System.out.println("my data type of cell is "+datatype);

	}

}
