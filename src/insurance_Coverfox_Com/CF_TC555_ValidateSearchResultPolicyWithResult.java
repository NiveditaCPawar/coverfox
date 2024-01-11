package insurance_Coverfox_Com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CF_TC555_ValidateSearchResultPolicyWithResult {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver =new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		
		CoverFoxHomePage home=new CoverFoxHomePage(driver);
		Thread.sleep(500);
		home.clickOnGender();
		
		CoverFoxHealthPlan plan= new CoverFoxHealthPlan(driver);
		Thread.sleep(500);
		plan.clickOnNextButton();
		
		CoverFoxMemberDetails details=new CoverFoxMemberDetails(driver);
		Thread.sleep(500);
		details.dropDownHandle();
		Thread.sleep(500);
		details.clickOnNextButton();
		
		CoverFoxAddDetails personalDetail= new CoverFoxAddDetails(driver);
		Thread.sleep(500);
		personalDetail.enterPinCode();
		Thread.sleep(500);
		personalDetail.enterMobileNumber();
		Thread.sleep(500);
		personalDetail.clickOnContinueButton();
		
		CoverFoxPlanResultPage result=new CoverFoxPlanResultPage(driver);
		Thread.sleep(1500);
		result.validatePlanListWithResult();
		Thread.sleep(9000);
		 driver.close();
		
		
	}

}
