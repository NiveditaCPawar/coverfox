package testNG1_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage {
	
	
	@FindBy(xpath = "//div[@class='w--radio__option ']")private WebElement genderButton;
	
	public CoverFoxHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnGender() {
		genderButton.click();
	}
	
	
}
