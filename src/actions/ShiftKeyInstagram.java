package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShiftKeyInstagram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		
		WebElement name = driver.findElement(By.className("_aa48"));
		Actions act=new Actions(driver);
		//act.sendKeys(name, "Nivedita").perform();
		
		//act.keyDown(name, Keys.SHIFT).sendKeys("nivedita").build().perform();
		
		
		act.keyDown(name, Keys.SHIFT).sendKeys("n").build().perform();
		
		act.keyUp(name,Keys.SHIFT).sendKeys("ivedita").build().perform();

	}

}
