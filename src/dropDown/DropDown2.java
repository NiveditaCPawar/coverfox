package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.toyotabharat.com/showroom/fortuner/index-legender.html#");
		Thread.sleep(1000);
		
		WebElement fix = driver.findElement(By.id("cboPopupCity"));
		Select max=new Select(fix);
		max.selectByValue("147");
		

	}

}
