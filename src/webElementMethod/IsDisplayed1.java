package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://sripriyapkulkarni.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//i[@class='bx bx-server'][1]")).click();
		Thread.sleep(1000);
		
		 boolean result = driver.findElement(By.id("hide-textbox")).isDisplayed();
		System.out.println("the status of button is hide "+result);
		
		driver.findElement(By.id("show-textbox")).click();
		driver.findElement(By.name("show-hide")).sendKeys("selenium");

	}

}
