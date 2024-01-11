package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class MixAllKeyWords {
	@Test(priority = 5)
	  public void a() {
		  Reporter.log("a is running", true);
	  }
	  @Test(dependsOnMethods = {"d"})
	  public void b() {
		  Reporter.log("b is running", true);
	  }
	  @Test(enabled = false)
	  public void c() {
		  Reporter.log("c is running", true);
	  }
	  @Test(dependsOnMethods = {"a"},priority = 1)
	  public void d() {
		  Reporter.log("d is running", true);
	  }

}
