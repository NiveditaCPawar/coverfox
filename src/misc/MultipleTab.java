package misc;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Remote']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='HR']")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		ArrayList<String> as=new ArrayList<String>(allwindow);
		
		for(int i=0;i<allwindow.size();i++) {
			driver.switchTo().window(as.get(i));
			System.out.println(driver.getTitle());
		}
		
		
		
		
	}

}
