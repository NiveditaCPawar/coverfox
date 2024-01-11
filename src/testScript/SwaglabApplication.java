package testScript;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SwaglabApplication {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//CommonMethods.waiting(driver, 5);
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		driver.findElement(By.className("btn_action")).click();
		
		WebElement bagpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		WebElement bikeLight = driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
		bagpack.click();
		bikeLight.click();
		WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
		cartButton.click();
		
		List<WebElement> totalItems = driver.findElements(By.className("inventory_item_name"));
		
		System.out.println(totalItems.size());
		for(WebElement cartItem:totalItems) {
			System.out.println("The total items in cart is "+cartItem.getText());
		}
		
		Iterator<WebElement> it = totalItems.iterator();
		WebElement item1 = it.next();
		if(item1.getText().equals("Sauce Labs Backpack"))
		{
			System.out.println("item1 should be successfully added");
		}
		WebElement item2 = it.next();
		if(item2.getText().equals("Sauce Labs Bike Light")) {
			System.out.println("item2 should be successfully added");
			driver.findElement(By.id("checkout")).click();
		}
		
		WebElement firstName = driver.findElement(By.id("first-name"));
		WebElement lastName = driver.findElement(By.id("last-name"));
		WebElement postalCode = driver.findElement(By.id("postal-code"));
		WebElement continueButton = driver.findElement(By.name("continue"));
		firstName.sendKeys("Nivedita");
		lastName.sendKeys("Pawar");
		postalCode.sendKeys("424509");
		continueButton.click();
		
		WebElement finishButton = driver.findElement(By.id("finish"));
		finishButton.click();
		
		WebElement thankYouMsg = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
		if(thankYouMsg.getText().equals("Thank you for your order!")) {
			System.out.println("thank you massage displayed--->loggin out");
			driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
			Thread.sleep(500);
			driver.findElement(By.id("logout_sidebar_link")).click();
			
		}
		
		
		
	}

}
