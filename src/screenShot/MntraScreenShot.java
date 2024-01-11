package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class MntraScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		File tempLocation = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		RandomString rs=new RandomString(3);
		File permenentLocation=new File("C:\\Users\\ypwr9\\OneDrive\\Desktop\\Nivedita\\selenium screenshot\\myntrass"+rs+".png");
		FileHandler.copy(tempLocation, permenentLocation);
		
	}

}
