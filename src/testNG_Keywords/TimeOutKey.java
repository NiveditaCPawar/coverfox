package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutKey {
	@Test(timeOut = 300)
	  public void a() throws InterruptedException {
		Thread.sleep(500);
		  Reporter.log("a is running", true);
	  }
	  @Test
	  public void b() {
		  Reporter.log("b is running", true);
	  }
	  @Test
	  public void c() {
		  Reporter.log("c is running", true);
	  }
	  @Test
	  public void d() {
		  Reporter.log("d is running", true);
	  }
}
