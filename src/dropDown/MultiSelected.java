package dropDown;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(1000);
		WebElement multi = driver.findElement(By.id("multiselect1"));
		
		Select s1=new Select(multi);
		
		System.out.println(s1.isMultiple());
		
		s1.selectByIndex(0);
		s1.selectByValue("swiftx");
		s1.selectByIndex(2);
		s1.selectByValue("audix");
		Thread.sleep(100);
		//s1.deselectByIndex(2);
		System.out.println(s1.getFirstSelectedOption().getText());
		
		System.out.println("=========for each loop====================");
		List<WebElement> ss = s1.getOptions();
		
		for(WebElement s2:ss) {
			System.out.println(s2.getText());
		}
		
		System.out.println("=============for loop================");
		for(int i=0;i<=ss.size()-1;i++) {
			System.out.println(ss.get(i).getText());
			
		}
		
		System.out.println("==========iterator");
		Iterator<WebElement> s3 = ss.iterator();
		while(s3.hasNext()) {
			System.out.println(s3.next().getText());
		}
		
		System.out.println("==========list iterator");
		ListIterator<WebElement> s4 = ss.listIterator();
		while(s4.hasNext()) {
			System.out.println(s4.next().getText());
		}
	
	
	
	
	
	
	
	
	}
	
	

}
