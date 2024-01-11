package testNG_Coverfox_Insurance;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxPlanResultPage {
	
	
	@FindBy(xpath = "//div[contains(text(),' Insurance Plans')]") private WebElement resultInString;
	@FindBy(id = "plans-list")private List<WebElement>planList;
	
	
	public CoverFoxPlanResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public int availablePlanNumOnText() {
		String result = resultInString.getText();//49 matching plan in string
		
		
		String[] ar = result.split(" "); //split using space i.e 49(0)  matching(1)  result(3)
		
		String numberOfStringResult = ar[0];//get 0 array i.e 49 into string
		
		int numOfStringInInt = Integer.parseInt(numberOfStringResult);
		
		return numOfStringInInt;
		
	}
	public int availablePlanNumOnBanners() {
		
		int totalNumOfPlanOnBanners = planList.size();
		return totalNumOfPlanOnBanners;
		
	}
	
	
}
