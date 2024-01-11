package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//strong[@class='hdn']")).click();
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nivedita");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nivedita Pawar");

	}

}
