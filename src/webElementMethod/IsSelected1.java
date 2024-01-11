package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(1000);
		WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
		
		boolean female = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		System.out.println(female);
		Thread.sleep(1000);
		gender.click();
		
		boolean result = gender.isSelected();
		System.out.println(result);
		
	}

}
