package mySeleniumA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudyClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://javagoal.com/");
		
		Thread.sleep(1000);
		driver.getCurrentUrl();
		String url=driver.getCurrentUrl();
		System.out.println(url);

	}

}
