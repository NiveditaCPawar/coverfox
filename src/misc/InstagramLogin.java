package misc;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();
		
		CommonMethods.waiting(driver, 5);
		WebElement name_Id = driver.findElement(By.name("emailOrPhone"));
		WebElement fullName = driver.findElement(By.name("fullName"));
		WebElement userName = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		
		name_Id.sendKeys(CommonMethods.instaExcel(1, 0));
		fullName.sendKeys(CommonMethods.instaExcel(1, 1));
		userName.sendKeys(CommonMethods.instaExcel(1, 2));
		password.sendKeys(CommonMethods.instaExcel(1, 3));
	}

}
