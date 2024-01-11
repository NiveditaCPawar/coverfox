package synchronization_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.zee5.com/signin");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='button']"));
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(1000));
		driver.findElement(By.name("userName")).sendKeys("7558241193");
		
		w.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
		

	}

}
