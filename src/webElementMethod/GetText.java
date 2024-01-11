package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://telegram.org/");
		Thread.sleep(100);
		
		String expResult = "a new era of messaging";
		
		String actualResult = driver.findElement(By.className("tl_main_logo_lead")).getText();
		
		if(actualResult.equals(expResult)) {
			System.out.println("Both result is same, test case is pass");
		}
		else {
			System.out.println("Both result is not same, test case is fail");
		}

	}

}
