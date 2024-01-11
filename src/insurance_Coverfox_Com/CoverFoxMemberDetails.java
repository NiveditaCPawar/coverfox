package insurance_Coverfox_Com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMemberDetails {

	@FindBy(id = "Age-You")private WebElement ageDropDownButton;
	@FindBy(xpath = "//div[@class='next-btn']")private WebElement memberDetailsNextButton;
	
	public CoverFoxMemberDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void dropDownHandle() {
		Select s=new Select(ageDropDownButton);
		s.selectByValue("27y");
		
	}
	
	
	public void clickOnNextButton() {
		memberDetailsNextButton.click();
	}
	
}
