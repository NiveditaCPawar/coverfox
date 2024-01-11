package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		
		//hiden popup-->because it is hide in division.
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(100);
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(100);
		driver.findElement(By.className("_30XB9F")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("books");
	}

}
