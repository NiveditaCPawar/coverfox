package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderByAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement slider = driver.findElement(By.id("slider"));
		//WebElement name = driver.findElement(By.id("q0"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(1000);
		act.dragAndDropBy(slider, 60, 0).perform();

	}

}
