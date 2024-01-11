package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableAll {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
//		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
//		System.out.println(table.getText()+"  ");
		
		//single row value
		WebElement row = driver.findElement(By.xpath("//table[@class='dataTable']//tr[8]/td[4]"));
		System.out.println(row.getText());
		
		//single column value
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='dataTable']//tr[8]/td"));
		
		for(WebElement c:column) {
			//
			System.out.print(c.getText()+"  ");
		}System.out.println();
	
		
		
	}

}
