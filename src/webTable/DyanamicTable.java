package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/search?q=live+cricket+score&rlz=1C1RXQR_enIN1068IN1068&oq=&gs_lcrp=EgZjaHJvbWUqBggBEEUYOzIMCAAQRRg5GLEDGIAEMgYIARBFGDsyEggCEAAYQxiDARixAxiABBiKBTIPCAMQABhDGLEDGIAEGIoFMhIIBBAuGEMYgwEYsQMYgAQYigUyDwgFEAAYQxixAxiABBiKBTIGCAYQRRg8MgYIBxBFGDzSAQgzNDM4ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8#sie=m;/g/11v3d4hf9f;5;/m/021q23;dt;fp;1;;;");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		  List<WebElement> numOfColumn = driver.findElements(By.xpath("(//table[@class='imspo_tps__tb'])[1]/thead/tr/th"));
		 int column = numOfColumn.size();
		
		System.out.println(column);
		//header
		 List<WebElement> numOfRow = driver.findElements(By.xpath("(//table[@class='imspo_tps__tb'])[3]/thead/tr"));
		int rows = numOfRow.size();
		System.out.println(rows);
		for(int i=1;i<=1;i++) {
			for(int j=1;j<=6;j++) {
				 WebElement data = driver.findElement(By.xpath("(//table[@class='imspo_tps__tb'])[1]/thead/tr["+i+"]/th["+j+"]"));
			System.out.print(data.getText()+" ");
			}
			
		}
		System.out.println();
		
		
		
	}

}
