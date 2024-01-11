package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolutePath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://groww.in/");
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/p")).click();
		//html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/p
		
		//driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys("Indian Railway Finance Corp");
		driver.findElement(By.xpath("//span/span[1]")).click();
		
	}

}
