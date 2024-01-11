package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class HotStar
{	public static void main(String[] args) throws InterruptedException, IOException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	driver.get("https://in.bookmyshow.com/explore/home/mumbai");
	
	Thread.sleep(1000);
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	RandomString rs=new RandomString();
	RandomString.make(3);
	
	File dest=new File("C:\\Users\\ypwr9\\OneDrive\\Desktop\\Nivedita\\selenium screenshot\\myScreenshot"+rs+".png");
	
	FileHandler.copy(source, dest);
	
	
	
	
}

	
	
	
	
	
}
