package scrollingByJavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.get("https://chat.openai.com/c/8a2353c7-be4a-44f0-abc0-04f9a26e9bc4");
		//find web element
		Thread.sleep(1000);
		WebElement slider = driver.findElement(By.className("hljs-string"));
		
		JavascriptExecutor jsa = (JavascriptExecutor)driver;
		jsa.executeScript("arguments[0].scrollIntoView();",slider );
	}

}
