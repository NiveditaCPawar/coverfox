package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		
		WebElement bdate = driver.findElement(By.name("birthday_day"));
		Select bday=new Select(bdate);
		bday.selectByIndex(19);
		
		WebElement bmonth = driver.findElement(By.id("month"));
		Select bm=new Select(bmonth);
		bm.selectByValue("9");
		
		WebElement byear = driver.findElement(By.id("year"));
		Select year=new Select(byear);
		year.selectByVisibleText("1982");

	}

}
