package testNG_DataProvider;

import org.testng.annotations.DataProvider;


public class CoverFoxDataProvider {
 
@DataProvider(name="age")
	public static String[] ageset()
{
	String age[]= {"25","40"};
	return age;
}

@DataProvider(name="xyz")
public static String[][] dataset(){
	String data[][]= {{"450122","4587120145"},{"758462","9845120120"}};
	return data;
}
 
}
