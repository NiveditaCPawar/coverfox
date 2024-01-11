package mySeleniumA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodOfWeb {

	public static void main(String[] args) throws InterruptedException {
		String expect="Java Tutorial for Beginners and Core Java Tutorials - JavaGoal";
				
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://javagoal.com/");
		
		Thread.sleep(1000);
		
		String actual=driver.getTitle();
		//System.out.println(actual);
		
		if(expect.equals(actual)) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case failed");
		}
	}

}
