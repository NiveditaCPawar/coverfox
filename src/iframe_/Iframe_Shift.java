package iframe_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Shift {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.get("https://demoqa.com/frames");
		
		Thread.sleep(1000);
		driver.findElement(By.className("pr-1")).click();
		
		Thread.sleep(100);
		driver.switchTo().frame(3);
		driver.findElement(By.id("sampleHeading")).getText();
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(1000);
		driver.findElement(By.className("header-text")).click();
		
		
		
		
		
		
		

	}

}
