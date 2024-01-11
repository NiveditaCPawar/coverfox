package testNG1_Test;

import org.testng.annotations.Test;

import testNG1_Base.Launching_Closing_URL;
import testNG1_POM.CoverFoxAddDetails;
import testNG1_POM.CoverFoxHealthPlan;
import testNG1_POM.CoverFoxHomePage;
import testNG1_POM.CoverFoxMemberDetails;
import testNG1_POM.CoverFoxPlanResultPage;
import testNG1_Utility.Commom_Use_Methods;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class CF_TC555_ValidateSearchResultPolicyFromTextAndBanners extends Launching_Closing_URL {
	
	CoverFoxHomePage homepage;
	CoverFoxAddDetails adddetails;
	CoverFoxHealthPlan healthPlan;
	CoverFoxMemberDetails membersDetails;
	CoverFoxPlanResultPage resultPage;
	 
	
	  @BeforeClass
	  public void beforeClass() 
	  {
		  Reporter.log("Browser luanching", true);
		  luanchingBrowser();
		
		  homepage=new CoverFoxHomePage(driver);
		  adddetails=new CoverFoxAddDetails(driver);
		  healthPlan=new CoverFoxHealthPlan(driver);
		  membersDetails=new CoverFoxMemberDetails(driver);
		  resultPage=new CoverFoxPlanResultPage(driver);
		 
	  }
	@BeforeMethod
	  public void beforeMethod() throws EncryptedDocumentException, IOException, InterruptedException
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
		 // adddetails.enterPinCode(Commom_Use_Methods.getDataFromExcel(1, 0));
		 adddetails.enterPinCode( Commom_Use_Methods.readDataFromProperty("pinCode"));
		  Reporter.log("entering mobile number", true);
		//  adddetails.enterMobileNumber(Commom_Use_Methods.getDataFromExcel(1, 1));
		  adddetails.enterMobileNumber(Commom_Use_Methods.readDataFromProperty("num"));
		  Reporter.log("Click on continue button", true);
		  adddetails.clickOnContinueButton();
		  
		  Reporter.log("Click on filter button", true);
		  resultPage.clickOnFiltterButton();
		  Reporter.log("Click on checkBox", true);
		  resultPage.chkeckBox();
		  Reporter.log("Click on apply button", true);
		  resultPage.applybutton();
		  
	  }
	
	@Test(enabled = false)
  public void CF_TC555_ValidateSearchResultPolicy() throws InterruptedException, IOException
  {		
		
		Thread.sleep(7000);
		Reporter.log("Fetching result from text ", true);
		 int textResult = resultPage.availablePlanNumOnText();
		 Thread.sleep(5000);
		 Reporter.log("Fetching result from banners ", true);
		 int bannersResult = resultPage.availablePlanNumOnBanners();
		 Thread.sleep(5000);
		 Assert.assertEquals(textResult, bannersResult,"Text result not matching with banners result,TC is failed. ");
		 Reporter.log("TC1 is pass" , true);
		 Commom_Use_Methods.takescreenshot(driver, "CF_TC555");
		 Thread.sleep(5000);
  }
	@Test
	public void CF_TC555_ValidateSearchResultPolicyOfAdidtyBirla() throws InterruptedException {
		
		Thread.sleep(7000);
		Reporter.log("Fetching result or adity birla from text ", true);
		int adityaText = resultPage.avalablePlanOnTextOfAdityBirla();
		
		Thread.sleep(7000);
		Reporter.log("Fetching result of aditya birla from banners ", true);
		Thread.sleep(5000);
		int adityaBanners = resultPage.availablePlanOfAdityaOnBanners();
		Thread.sleep(5000);
		Assert.assertEquals(adityaText, adityaBanners,"Text result not matching with banners result,TC is failed. ");
		Reporter.log("TC2 is pass",true);
	}
	


  @AfterMethod
  public void afterMethod() throws InterruptedException 
  {
	  	Reporter.log("Browser closing ",true);
		 Thread.sleep(9000);
		 closingBrowser();
  }



}
