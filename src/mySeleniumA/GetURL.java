package mySeleniumA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURL {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://play.google.com/");
		
		Thread.sleep(1000);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}

}
