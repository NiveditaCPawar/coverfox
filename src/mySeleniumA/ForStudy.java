package mySeleniumA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForStudy {
	public static void main(String[] args) throws InterruptedException {
		String expected="The Community for Open Innovation and Collaboration | The Eclipse Foundation";
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.eclipse.org/");
		
		Thread.sleep(1000);
		
		driver.getTitle();
		String actual=driver.getTitle();
		System.out.println(actual);
		
		if(expected.equals(actual)) {
			System.out.println("test case pass");
			
		}
		else {
			System.out.println("test case fail");
		}
	}

}
