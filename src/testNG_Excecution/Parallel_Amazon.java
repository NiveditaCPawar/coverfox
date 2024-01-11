package testNG_Excecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Amazon {
  @Test
  public void amazon() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.close();
  }
  
//  @Test
//  public void flipkart() {
//	  WebDriver driver=new ChromeDriver();
//	  driver.get("https://www.coverfox.com/health-plan/address-details");
//	  driver.close();
//  }
}
