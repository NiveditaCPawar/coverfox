package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonMethods {
	
	//takescreenshot
	//read excel sheet
	//scrolling
	//waiting
	
	
	

	public static void screenshot(WebDriver driver,String fileName) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\ypwr9\\OneDrive\\Desktop\\Nivedita\\selenium screenshot\\"+fileName+".png");
		FileHandler.copy(src, dest);
		
	}
	public static void waiting(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public static void scrollInToView(WebDriver driver,WebElement element) {
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeAsyncScript("arguments[0],scrollInToView():", element);
	}
	
	public static String excelsheet(int row, int cell) throws EncryptedDocumentException, IOException {
	
	FileInputStream myFile=new FileInputStream("C:\\Users\\ypwr9\\OneDrive\\Documents\\Book1.xlsx");
	Sheet myWorkbook = WorkbookFactory.create(myFile).getSheet("Sheet1");
	String data = myWorkbook.getRow(row).getCell(cell).getStringCellValue();
	return data;
	}
	
	public static String instaExcel(int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("C:\\Users\\ypwr9\\OneDrive\\Documents\\Instagram excelSheet.xlsx");
		Sheet myWorkbook = WorkbookFactory.create(myFile).getSheet("Sheet1");
		String data = myWorkbook.getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}
	
	
}
