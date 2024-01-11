package testNGExcludeMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1 {
	 @Test(groups = "Sanity")
	  public void TC1()
	  {
		  Reporter.log("testcase1 is running", true);
	  }
	  @Test(groups = "Sanity")
	  public void TC2()
	  {
		  Reporter.log("testcase2 is running", true);
	  }
	  @Test(groups = "Sanity")
	  public void TC3()
	  {
		  Reporter.log("testcase3 is running", true);
	  }
	  @Test(groups = "Regression")
	  public void TC4()
	  {
		  Reporter.log("testcase4 is running", true);
	  }
}
