package testNG_Coverfox_Insurance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class CF_TC555_ValidateSearchResultPolicyFromTextAndBanners {
	WebDriver driver;
	CoverFoxHomePage homepage;
	CoverFoxAddDetails adddetails;
	CoverFoxHealthPlan healthPlan;
	CoverFoxMemberDetails membersDetails;
	CoverFoxPlanResultPage resultPage;
	
	@Test
  public void CF_TC555_ValidateSearchResultPolicy() throws InterruptedException
  {		
		Thread.sleep(7000);
	 Reporter.log("Fetching result from text ", true);
	 int textResult = resultPage.availablePlanNumOnText();
	 Thread.sleep(5000);
	 Reporter.log("Fetching result from banners ", true);
	 int bannersResult = resultPage.availablePlanNumOnBanners();
	 Thread.sleep(5000);
	 Assert.assertEquals(textResult, bannersResult,"Text result not matching with banners result,TC is failed. ");	  
  }
  @BeforeMethod
  public void beforeMethod()
  {	
	  Reporter.log("Click on gender button", true);
	 homepage.clickOnGender();
	 
	 Reporter.log("Click on Next button", true);
	 healthPlan.clickOnNextButton();
	 
	 Reporter.log("handeling dropDown ", true);
	  membersDetails.dropDownHandle();
	  Reporter.log("Click on next button", true);
	  membersDetails.clickOnNextButton();
	  
	  Reporter.log("Entering pin code", true);
	  adddetails.enterPinCode();
	  Reporter.log("entering mobile number", true);
	  adddetails.enterMobileNumber();
	  Reporter.log("Click on continue button", true);
	  adddetails.clickOnContinueButton();
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException 
  {
	  Reporter.log("Browser closing ",true);
	  Thread.sleep(7000);
	  driver.close();
  }

  @BeforeClass
  public void beforeClass() 
  {
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("--disable-notifications");
	  
	  driver=new ChromeDriver(opt);
	  homepage=new CoverFoxHomePage(driver);
	  adddetails=new CoverFoxAddDetails(driver);
	  healthPlan=new CoverFoxHealthPlan(driver);
	  membersDetails=new CoverFoxMemberDetails(driver);
	  resultPage=new CoverFoxPlanResultPage(driver);
	  
	  Reporter.log("Browser luanching", true);
	  driver.get("https://www.coverfox.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 
  }

}
