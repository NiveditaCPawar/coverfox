package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.trivago.in/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@aria-hidden=\'true\']")).click();
		
		

	}

}
