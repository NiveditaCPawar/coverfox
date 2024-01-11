package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotOfInstagram {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		
		File myScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		RandomString rs=new RandomString(2);
		File getScreenshot=new File("C:\\Users\\ypwr9\\OneDrive\\Desktop\\Nivedita\\selenium screenshot\\abcd"+rs+".png");
		
		FileHandler.copy(myScreenshot, getScreenshot);

	}

}
