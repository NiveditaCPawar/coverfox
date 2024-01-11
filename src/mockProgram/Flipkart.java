package mockProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN714G0&p=flipkart");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=' India logs 9% revenue growth at Rs 55,823 crore; losses widen by 42%']")).click();
		
		Thread.sleep(1000);
		driver.navigate().to("https://economictimes.indiatimes.com/");
		
		String abc = driver.getTitle();
		System.out.println("the current url title is "+abc);
		
		
		
	}

}
