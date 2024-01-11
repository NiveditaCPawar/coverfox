package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
  @Test
  public void TC1() {
	  Reporter.log("hello this is testcase1", true);
  }
  @Test
  public void TC2() {
	  Reporter.log("hello this is testcase2", true);
  }
  @BeforeMethod
  public void login() {
	  Reporter.log("before method", true);
  }
  @AfterMethod
  public void signin() {
	  Reporter.log("after method", true);
  }
  @BeforeClass
  public void beforeClass() {
	  Reporter.log("beforeClass method", true);
  }
  @AfterClass
  public void afterClass() {
	  Reporter.log("afterClass method", true);
  }
  @BeforeSuite
  public void suit() {
	  Reporter.log("before suit method", true);
  }
  @AfterSuite
  public void suit1() {
	  Reporter.log("afterSuit method", true);
  }
  
  
}
