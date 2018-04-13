package p;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavapropertiesoR {

	public static void main(String[] args) throws IOException {

		Properties OR = new Properties();
		File fi=new File("C:\\Users\\Hussain\\Desktop\\Git _Local _Repo\\SELENIUM2\\src\\p\\OR1");
		FileInputStream fil = new FileInputStream(fi);
		OR.load(fil);
		System.out.println(OR.getProperty("USER_NAME"));
		
		//what are the selenium (functions) locator are working in javascript
		
		//following-seblings
		//preceding-seblings
		//start-with()
		//ends-with()
		//following
		//precedings
		//contains
		
		//nth-child(1)
		//$(starts-with)
		//^(ends-with)
		//
	}

}
