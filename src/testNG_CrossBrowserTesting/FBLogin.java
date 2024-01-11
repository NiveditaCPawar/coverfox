package testNG_CrossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FBLogin {
	@Parameters("bName")
	@Test
  	  public void fbAccount(String browserName) throws InterruptedException 
	  {
	  WebDriver driver=null;
	  
	   if(browserName.equals("chrome")) 
	   {
		  driver=new ChromeDriver();
	  }
	   else if(browserName.equals("firefox")) {
		   driver=new FirefoxDriver();
	   }	
	   driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  Thread.sleep(500);
		  driver.findElement(By.linkText("Create new account")).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.findElement(By.name("firstname")).sendKeys("Nivedita");
		  driver.findElement(By.name("lastname")).sendKeys("Pawar");
		  driver.findElement(By.name("reg_email__")).sendKeys("nivedita@123");
		  driver.close();
	  }
  }

