package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.get("https://in.bookmyshow.com/explore/home/mumbai");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Events']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='sc-1y4pbdw-6 iLzgbw'][2]")).click();
		
		
		

	}

}
