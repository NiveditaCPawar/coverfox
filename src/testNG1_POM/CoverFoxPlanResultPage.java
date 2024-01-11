package testNG1_POM;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxPlanResultPage {
	
	
	@FindBy(xpath = "//div[contains(text(),' Insurance Plans')]") private WebElement resultInString;
	@FindBy(id = "plans-list")private List<WebElement>planList;
	@FindBy(xpath = "(//div[@class='drop-arrow'])[3]")private WebElement filterButton;
	@FindBy(xpath = "(//i[contains(@class,'icon-checkbox')])[1]") private WebElement adityaBirla;
	@FindBy(className = "apply-sec")private WebElement applyButton;
	@FindBy(xpath = "//div[contains(text(),' Insurance Plans')]")private WebElement adityaBirlaOnText;
	@FindBy(id = "plans-list")private List<WebElement> adityaBirlaOnBanners;
	
	
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
	
	public void clickOnFiltterButton() throws InterruptedException {
		Thread.sleep(5000);
		filterButton.click();
	}
	public void chkeckBox() throws InterruptedException {
		Thread.sleep(500);
		adityaBirla.click();
	}
	public void applybutton() throws InterruptedException {
		Thread.sleep(500);
		applyButton.click();
	}
	public int avalablePlanOnTextOfAdityBirla() {
		String result = adityaBirlaOnText.getText();//4 matching plan in string
		
		
		String[] ar = result.split(" "); //split using space i.e 4(0)  matching(1)  result(3)
		
		String numberOfStringResult = ar[0];//get 0 array i.e 49 into string
		
		int numOfStringInInt = Integer.parseInt(numberOfStringResult);
		
		return numOfStringInInt;
	}
	public int availablePlanOfAdityaOnBanners() {
		int adityBirlaTotalBanners = adityaBirlaOnBanners.size();
		return adityBirlaTotalBanners;
	}
}
