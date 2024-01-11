package testNG1_POM;



import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CoverFoxAddDetails {

	@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement pinCodeField;
	@FindBy(xpath = "(//input[@type='number'])[2]")private WebElement mobileNumberField;
	@FindBy(xpath = "//div[text()='Continue']")private WebElement continueButton;
	@FindBy(className = "error-ui")private WebElement errorMessage;
	
	public CoverFoxAddDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterPinCode(String pin) throws EncryptedDocumentException {
		pinCodeField.sendKeys(pin);
	}
	public void enterMobileNumber(String moNum) throws EncryptedDocumentException {
		mobileNumberField.sendKeys(moNum);
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	public boolean checkErrorMessage() throws InterruptedException { 
		Thread.sleep(1000);
		boolean result = errorMessage.isDisplayed();
		return result;
	}
	

}
