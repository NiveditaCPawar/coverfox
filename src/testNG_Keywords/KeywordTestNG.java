package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordTestNG {
  @Test(dependsOnMethods = {"cde1"})
  public void abc1() 
  {
	  Reporter.log("tc 1", true);
  }
  @Test
  public void bcd1() 
  {
	  Reporter.log("tc 2", true);
  }
  @Test
  public void cde1() 
  {
	  Reporter.log("tc 3", true);
  }
}
