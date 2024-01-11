package testNG_DataProvider;

import org.testng.annotations.DataProvider;

public class FBDataProvider 
{
  @DataProvider(name="ReTesting")
  public static String[][] fbTestData() {
	  String[][]data= {{"Nivedita","Pawar","Nive@123"},{"Sarthak","Sharma","sarth@gmail.com"},{"Ashwini","Patil","ash@758"}};
	  return data;
  }
  
  
}
