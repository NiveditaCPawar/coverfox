package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_pathByContains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//h2[contains(text(),'people in your life')]")).click();
//      //h2[contains(text(),'people in your life')]
		
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).click();
	
		//button[contains(@id,'u_0_5_')]
	}

}
