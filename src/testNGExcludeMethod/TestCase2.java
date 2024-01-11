package testNGExcludeMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase2 {
	 @Test(groups = "Regression")
	  public void TC5()
	  {
		  Reporter.log("testcase5 is running", true);
	  }
	  @Test(groups = "Sanity")
	  public void TC6()
	  {
		  Reporter.log("testcase6 is running", true);
	  }
	  @Test(groups = "Regression")
	  public void TC7()
	  {
		  Reporter.log("testcase7 is running", true);
	  }
	  @Test(groups = "Sanity")
	  public void TC8()
	  {
		  Reporter.log("testcase8 is running", true);
	  }
}
