package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEneble {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zee5.com/signin");
		Thread.sleep(1000);
		
		driver.findElement(By.name("userName")).sendKeys("7558241193");
		
		boolean result = driver.findElement(By.xpath("//button[@type='button']")).isEnabled();
		System.out.println("login button is enable now "+result);
		


	}

}
