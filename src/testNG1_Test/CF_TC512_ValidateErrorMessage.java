package testNG1_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testNG1_Base.Launching_Closing_URL;
import testNG1_POM.CoverFoxAddDetails;
import testNG1_POM.CoverFoxHealthPlan;
import testNG1_POM.CoverFoxHomePage;
import testNG1_POM.CoverFoxMemberDetails;
import testNG1_Utility.Commom_Use_Methods;

public class CF_TC512_ValidateErrorMessage  extends Launching_Closing_URL  {
 
	CoverFoxHomePage homepage;
	CoverFoxAddDetails adddetails;
	CoverFoxHealthPlan healthPlan;
	CoverFoxMemberDetails membersDetails;
	
	@BeforeClass
	  public void beforeClass() 
	  {
		  Reporter.log("Browser luanching", true);
		  luanchingBrowser();
		
		  homepage=new CoverFoxHomePage(driver);
		  adddetails=new CoverFoxAddDetails(driver);
		  healthPlan=new CoverFoxHealthPlan(driver);
		  membersDetails=new CoverFoxMemberDetails(driver);
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
		  adddetails.enterPinCode(Commom_Use_Methods.getDataFromExcel(0, 0));
		// adddetails.enterPinCode( Commom_Use_Methods.readDataFromProperty("pinCode"));
		  Reporter.log("entering mobile number", true);
		 adddetails.enterMobileNumber(Commom_Use_Methods.getDataFromExcel(1, 1));
		 // adddetails.enterMobileNumber(Commom_Use_Methods.readDataFromProperty("num"));
		  Reporter.log("Click on continue button", true);
		  adddetails.clickOnContinueButton();
		 
	  }
		  
	@Test
  public void CF_TC512_ValidateErrorMessageForPinCodeField() throws InterruptedException 
	{
		
		
		Reporter.log("error message is display ", true);
		 Assert.assertTrue(adddetails.checkErrorMessage(), "error message is displyed,TC is pass");
	}
	@AfterMethod
	  public void afterMethod() throws InterruptedException 
	  {
		  	Reporter.log("Browser closing ",true);
			 Thread.sleep(9000);
			 closingBrowser();
	  }
}
