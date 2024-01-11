package testNG_Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
  @Test
  public void f() {
	  String a="Maharashtra";
	  String b="Maharashtra";
	  SoftAssert s=new SoftAssert();
	  s.assertEquals(a, b,"a and b is not equal");
	//  s.assertNull(b,"b is not null");
	  s.assertAll();
	  
	  
  }
}
