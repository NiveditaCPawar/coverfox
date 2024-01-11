package mySeleniumA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.getTitle();
		String title= driver.getTitle();
		
		System.out.println("the actual result is "+title);
		
		//driver.quit();

	}

}
