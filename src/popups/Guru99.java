package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(1000);
		alt.dismiss();
		
		driver.findElement(By.name("cusid")).sendKeys("1234");
		
		
		
		
		
	}

}
