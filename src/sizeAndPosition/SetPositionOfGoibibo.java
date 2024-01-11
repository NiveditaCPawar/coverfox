package sizeAndPosition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import misc.CommonMethods;

public class SetPositionOfGoibibo {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		CommonMethods.waiting(driver, 3);
		Point defaultPosition = driver.manage().window().getPosition();
		System.out.println(defaultPosition);
		
		Point p=new Point(100, 100);
		driver.manage().window().setPosition(p);
		
		//CommonMethods.screenshot(driver, "goibibo");
		WebElement hotelsInManali = driver.findElement(By.linkText("Hotels in Manali"));
		CommonMethods.scrollInToView(driver, hotelsInManali);
		
	}

}
