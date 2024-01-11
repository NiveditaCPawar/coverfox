package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestCase1 {
  @Test
  public void testCase1() {
	  Reporter.log("Test Case1 is running", true);
  }
  @Test
  public void testCase2() {
	  Reporter.log("Test Case2 is running", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Before method is running", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("after method is running", true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("Before class is running", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("after class is running", true);
  }

}
