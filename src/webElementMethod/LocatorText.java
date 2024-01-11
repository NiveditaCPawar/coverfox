package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cardekho.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='budget']")).sendKeys("15-20lakh");
		driver.findElement(By.xpath("//input[@id='vehicleTypeName']")).sendKeys("BMW");
		driver.findElement(By.xpath("//button[text()='submit']")).click();
	}

}
