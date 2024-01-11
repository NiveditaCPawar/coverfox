package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(1000);
		WebElement drop = driver.findElement(By.xpath("//select[@name='country']"));
		
		
		Select down=new Select(drop);
		System.out.println(down.isMultiple());
		Thread.sleep(1000);
		
		
		
		

	}

}
