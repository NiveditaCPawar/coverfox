package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("Nivedita");
		//1.tag &attribute
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name=reg_email__]")).sendKeys("7587548745");
		//tag &attribute
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("758@789");
		//2.tag & id
		
		Thread.sleep(1000);
		WebElement date = driver.findElement(By.cssSelector("select._9407[name='birthday_day']"));
		//3.tag, class & attribute
		Select day=new Select(date);
		day.selectByValue("20");
		
		
		
		
		
	}

}
