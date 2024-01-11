package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("honda");
		
		Thread.sleep(1000);
		List<WebElement> element = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
		for(WebElement el:element) {
			System.out.println(el.getText());
		}
		System.out.println("=====================");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//div[@class='wM6W7d'])[2]")).click();
//		
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Images")).click();
		
		String expResult = "honda elevate";
		for(WebElement rf:element) {
			String actResult = rf.getText();
			if(actResult.equals(expResult)) {
				rf.click();
				break;
				}	
		}
		Thread.sleep(1000);
		driver.findElement(By.linkText("Images")).click();
		
		
	}

}
