package scrollingByJavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://in.bookmyshow.com/explore/home/mumbai");
		
		WebElement premieres = driver.findElement(By.xpath("(//h2[text()='Premieres'])[1]"));
		Thread.sleep(2000);
		JavascriptExecutor jsa = (JavascriptExecutor)driver;
		jsa.executeScript("arguments[0].scrollIntoView();", premieres);
		
		
		
	}

}
