package testNG1_Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Launching_Closing_URL 
	
{
	protected static WebDriver driver;
	
	public static void luanchingBrowser() {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--disable-notifications");
//		driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public static void closingBrowser() 
	{
		
		driver.close();
	}
	
}
