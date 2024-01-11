package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		WebElement mainText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
		System.out.println("main page text is "+mainText.getText());
		
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		Iterator<String> it = allWindows.iterator();
		
		String mainPageId = it.next();
		String childId = it.next();
		System.out.println(mainPageId);
		System.out.println(childId);
		
		Thread.sleep(1000);
		driver.switchTo().window(childId);
		driver.manage().window().maximize();
		driver.findElement(By.id("the7-search")).sendKeys("Nivedita");
		driver.close();
		
		Thread.sleep(1000);
		driver.switchTo().window(mainPageId);
		driver.findElement(By.name("home")).click();
		
		
		
		
		
	}

}
