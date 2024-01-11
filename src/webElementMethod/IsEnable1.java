package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.justdial.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='Login / Sign Up']")).click();
		Thread.sleep(1000);
		
		WebElement result = driver.findElement(By.name("mobile"));
		result.sendKeys("7558241193");
		Thread.sleep(1000);
		
		boolean result1 = driver.findElement(By.xpath("//button[text()='Login with OTP']")).isEnabled();
		System.out.println("button is enable now "+result1);
	}

}
