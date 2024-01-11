package mySeleniumA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseGetTitle {

	public static void main(String[] args) throws InterruptedException {
		String expectedResult=("Velocity | Best Software Training Center");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(1000);
		
		driver.getTitle();
		String actualresult=driver.getTitle();
		
		if(expectedResult.equals(actualresult)) {
			System.out.println("test case is pass");
		}
		else {
			System.out.println("test case failed");
		}
		
	}

}
