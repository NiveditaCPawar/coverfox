package synchronization_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args){
	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.facebook.com/");
//	
//	WebElement newAccount = driver.findElement(By.linkText("Create new account"));
//	WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(100));
//	
//	//newAccount.click();
//	w.until(ExpectedConditions.elementToBeClickable(newAccount));
//	newAccount.click();
//	
//	System.out.println("==================================");
	driver.get("https://www.facebook.com/signup");
	WebElement femalegender = driver.findElement(By.xpath("//input[@value='1']"));
	WebDriverWait w2=new WebDriverWait(driver, Duration.ofMillis(1000));
	femalegender.click();
	w2.until(ExpectedConditions.elementToBeSelected(femalegender));

	
	
	}

}
