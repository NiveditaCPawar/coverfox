package scrollingByJavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByElemnt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.npci.org.in/");
		Thread.sleep(1000);
		WebElement blogs = driver.findElement(By.xpath("//a[text()='Blogs']"));
		
		Thread.sleep(2000);
		JavascriptExecutor jsa = (JavascriptExecutor)driver;
		jsa.executeScript("arguments[0].scrollIntoView();", blogs);
		
		
	}

}
