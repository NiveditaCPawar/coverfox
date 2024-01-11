package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSendKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.indeed.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='text-input-what']")).sendKeys("work from home");
	}

}
