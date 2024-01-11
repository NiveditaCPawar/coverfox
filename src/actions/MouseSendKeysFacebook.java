package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSendKeysFacebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("day"));
		
		Actions act=new Actions(driver);
		act.moveToElement(day);
		act.click().keyDown(Keys.ARROW_UP);
		Thread.sleep(1000);
		act.keyDown(Keys.ARROW_UP);
		Thread.sleep(1000);
		act.keyDown(Keys.ARROW_UP);
		Thread.sleep(1000);
		act.keyDown(Keys.ARROW_UP).perform();
		
		for(int i=0;i<=10;i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
	}

}
