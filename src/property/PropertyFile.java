package property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream myFile=new FileInputStream("C:\\Users\\ypwr9\\eclipse-workspace\\mySelenium\\MyProperty.properties");
		prop.load(myFile);
		Object value = prop.get("pinCode");
		System.out.println(value);
	}

}
