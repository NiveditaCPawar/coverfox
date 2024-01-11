package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nivedita");
		
		Thread.sleep(100);
		driver.findElement(By.name("lastname")).sendKeys("Pawar");
		
		Thread.sleep(100);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("7558241193");
		
		Thread.sleep(100);
		driver.findElement(By.name("reg_passwd__")).sendKeys("47856@hi");
		
		Thread.sleep(100);
		WebElement date = driver.findElement(By.id("day"));
		Select sdate=new Select(date);
		sdate.selectByIndex(19);
		
		Thread.sleep(100);
		WebElement smonth = driver.findElement(By.name("birthday_month"));
		Select month=new Select(smonth);
		month.selectByValue("9");
		
		Thread.sleep(100);
		WebElement syear = driver.findElement(By.xpath("//select[@title='Year']"));
		Select year=new Select(syear);
		year.selectByVisibleText("1996");
		
		WebElement result = driver.findElement(By.xpath("//input[@value='1']"));
		result.click();
		boolean gender = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		System.out.println(gender);
		
		}

}
