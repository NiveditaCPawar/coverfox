package mySeleniumA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstProject {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
     
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	
	//driver.manage().window().minimize();
	
	//Thread.sleep(1000);
	
	//driver.close();
	
   driver.navigate().to("https://www.google.com/");
   
   Thread.sleep(1000);
   
   driver.navigate().back();
   
   Thread.sleep(1000);
   
   driver.navigate().forward();
   
   Thread.sleep(1000);
   
   driver.navigate().refresh();
   
   Thread.sleep(1000);
   
   driver.quit();
	
	
	
	
	}


}
