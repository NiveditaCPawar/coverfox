package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		String table = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[3]")).getText();
		System.out.println(table);//one header read
		
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		
		for(WebElement h:tableHeader) {
			System.out.print(h.getText()+" ");
		}
		System.out.println();
		System.out.println("=====================");
		
		for(int i=2;i<=7;i++) {
			 WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[3]"));
			System.out.println(data.getText());
		}
		
		
		
	}

}
