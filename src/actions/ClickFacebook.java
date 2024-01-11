package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickFacebook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement loginbutton = driver.findElement(By.name("login"));
		
		Actions act=new Actions(driver);
		act.moveToElement(loginbutton).click().build().perform();
		//act.click().perform();
		
		
		
	}

}
