package insurance_Coverfox_Com;
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
	public void validatePlanListWithResult() {
		String result = resultInString.getText();//49 matching plan in string
		
		
		String[] ar = result.split(" "); //split using space i.e 49(0)  matching(1)  result(3)
		
		String numberOfStringResult = ar[0];//get 0 array i.e 49 into string
		int resultInInteger= Integer.parseInt(numberOfStringResult);//49-->in int
		
		int totalNumOfPlan = planList.size();
		
		
		if(totalNumOfPlan==resultInInteger) {
			System.out.println("Plan number is matching with plan list, test case passed");
		}
		else {
			System.out.println("Plan number is not matching with plan list, test case failed");
		}
		
	}
	
}
