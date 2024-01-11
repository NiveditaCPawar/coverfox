package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG_Listener.Listener.class)

public class NewTest_UsingListener {
  @Test
  public void facebook() {
	  Reporter.log("TC is running ", true);
  }
  @Test
  public void instagram()  {
	  
	  Reporter.log("TC is running ", true);
  }
  @Test
  public void twitter() {
	  Assert.fail();
	  Reporter.log("TC is running ", true);
  }
  @Test(dependsOnMethods =  {"twitter"})
  public void whatsapp() {
	  Reporter.log("TC is running ", true);
  }
}
