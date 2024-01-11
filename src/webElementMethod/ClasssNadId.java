package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClasssNadId {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("Nivedita@gmail.com");
		
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Pawar1234");
		
		

	}

}
