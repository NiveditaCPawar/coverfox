package testNG1_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Commom_Use_Methods 
{
	public static String getDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException {
		
	
	FileInputStream myFile=new FileInputStream("C:\\Users\\ypwr9\\OneDrive\\Documents\\Book1.xlsx");
	Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
	String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	return value;
	
	}
	public static void takescreenshot(WebDriver driver,String Id) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\ypwr9\\OneDrive\\Desktop\\Nivedita\\selenium screenshot\\coverfox"+Id+".png");
		FileHandler.copy(src, dest);
	}
	public static String readDataFromProperty(String key) throws IOException {
		Properties prop=new Properties();
		String abc = System.getProperty("user.dir");
		FileInputStream myFile=new FileInputStream(abc+"\\MyProperty.properties");
		prop.load(myFile);
		String value1 = prop.getProperty(key);
		return value1;
	}
}
