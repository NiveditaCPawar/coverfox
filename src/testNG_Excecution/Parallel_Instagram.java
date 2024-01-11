package testNG_Excecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Instagram {
  @Test
  public void Instagram() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.instagram.com/");
	  driver.close();
  }
}
