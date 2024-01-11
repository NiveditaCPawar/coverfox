package insurance_Coverfox_Com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddDetails {

	@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement pinCodeField;
	@FindBy(xpath = "(//input[@type='number'])[2]")private WebElement mobileNumberField;
	@FindBy(xpath = "//div[text()='Continue']")private WebElement continueButton;
	
	public CoverFoxAddDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterPinCode() {
		pinCodeField.sendKeys("425409");
	}
	public void enterMobileNumber() {
		mobileNumberField.sendKeys("7558241193");
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	

}
