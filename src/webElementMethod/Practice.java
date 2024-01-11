package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b_')]")).sendKeys("Nivedita");
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]")).sendKeys("Pawar");
	}

}
