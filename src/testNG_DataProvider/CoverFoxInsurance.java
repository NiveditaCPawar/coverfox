package testNG_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CoverFoxInsurance
	{
	//WebDriver driver=new ChromeDriver();
  @Test(dataProvider = "age",dataProviderClass = CoverFoxDataProvider.class)
  public void f(String age) throws InterruptedException
  {
	
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.coverfox.com/");
	  driver.findElement(By.xpath("//div[@class='w--radio__option ']")).click();
	  Thread.sleep(500);
	  
	  driver.findElement(By.className("next-btn")).click();
	  Thread.sleep(1500);
	  WebElement ageField = driver.findElement(By.id("Age-You"));
	  
	  Select s= new Select(ageField);
	  s.selectByValue(age +"y");
	  driver.findElement(By.className("next-btn")).click();
	  driver.close();
  }  
//  @Test(dataProvider = "xyz",dataProviderClass =CoverFoxDataProvider.class )
//  public void abc(String pincode, String monum) throws InterruptedException {
//	
//	  driver.get("https://www.coverfox.com/health-plan/address-details");
//	  Thread.sleep(1500);
//	  driver.findElement(By.className("mp-input-text")).sendKeys(pincode);
//	  Thread.sleep(1500);
//	  driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(monum);
//	  driver.close();
//	 
//  }
}
