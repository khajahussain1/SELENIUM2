package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class ReadORFile {
	Properties prop;

	// COnstructor to load properties file
	public ReadORFile(String propertiesFilePath) {

		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(propertiesFilePath);
			// prop = new Properties();
			prop.load(fis);
			fis.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	// Method to get locator type

	public By getLocator(String WebElementName) throws Exception {

		// Retrieve value from properties file using key
		String a = prop.getProperty(WebElementName);

		// extract the locator type and value from the object
		String s[] = a.split(":");
		String locatorType = s[0];
		String locatorValue = s[1];
		
		if(locatorType.equals("id"))
		{
			return By.id(locatorValue);
		}
		else if(locatorType.equals("name"))
		{
			return By.name(locatorValue);
		}
		
		else if(locatorType.equals("tagname"))
		{
			return By.tagName(locatorValue);
		}
		else if(locatorType.equals("linktext"))
		{
			return By.linkText(locatorValue);
		}
		
		else if(locatorType.equals("partiallinktext"))
		{
			return By.partialLinkText(locatorValue);
		}
		
		else if(locatorType.equals("xpath"))
		{
			return By.xpath(locatorValue);
		}
		else if(locatorType.equals("css"))
		{
			return By.cssSelector(locatorValue);
		}
		
		else if(locatorType.equals("classname"))
		{
			return By.className(locatorValue);
		}
		return null;

		/*switch (locatorType.toUpperCase()) 
		{
		case "ID":
			return By.id(locatorValue);
		case "NAME":
			return By.name(locatorValue);
		case "TAGNAME":
			return By.tagName(locatorValue);
		case "LINKTEXT":
			return By.linkText(locatorValue);
		case "PARTIALLINKTEXT":
			return By.partialLinkText(locatorValue);
		case "XPATH":
			return By.xpath(locatorValue);
		case "CSS":
			return By.cssSelector(locatorValue);
		case "CLASSNAME":
			return By.className(locatorValue);
		default:return null;
		}*/

	}
}