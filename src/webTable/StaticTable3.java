package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable3 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indiatoday.in/live-score/cricket/west-indies-england-live-cricket-scorecard-226485/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> column = driver.findElements(By.xpath("(//table)[4]/thead/tr/th"));
		for(WebElement c:column) {
			System.out.print(c.getText()+" ");
		}
		
		
		
		
		
		
		
		
		

	}

}
