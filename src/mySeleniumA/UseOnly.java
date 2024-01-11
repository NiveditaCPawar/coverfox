package mySeleniumA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOnly {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com/");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.navigate().to("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.close();

	}

}
