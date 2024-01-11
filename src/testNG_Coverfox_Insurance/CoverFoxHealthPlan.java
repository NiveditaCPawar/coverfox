package testNG_Coverfox_Insurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlan {
	
	
	@FindBy(xpath = "//div[@class='next-btn']")private WebElement healthPlanNextButton;
	
	public CoverFoxHealthPlan(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNextButton() {
		healthPlanNextButton.click();
	}
	
}
