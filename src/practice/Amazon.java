package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		driver.findElement(By.id("nav-link-accountList")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("Nivedita@123");
		
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(1000);
		File temp = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		RandomString rs=new RandomString();
		//rs.make(2);
		
		Thread.sleep(1000);
		File perment=new File("C:\\Users\\ypwr9\\OneDrive\\Desktop\\Nivedita\\selenium screenshot\\screenshot"+rs+".png");
		FileHandler.copy(temp, perment);
		
	}

}
