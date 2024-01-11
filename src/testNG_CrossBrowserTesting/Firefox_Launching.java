package testNG_CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox_Launching {
  @Test
  public void f() 
  {
	  
	  WebDriver driver =new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  driver.close();
  }
}
