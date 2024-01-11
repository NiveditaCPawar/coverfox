package synchronization_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicit_IsSelected {

	public static void main(String[] args)   {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		//Thread.sleep(7000);
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(500));
		
		gender.click();
		
		 w.until(ExpectedConditions.elementToBeSelected(gender));
		 //gender.click();
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
