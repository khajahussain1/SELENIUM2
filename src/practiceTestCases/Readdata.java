package practiceTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Readdata {
	
 public WebDriver driver;

	public void ts()
	{
		driver=new FirefoxDriver();
		driver.get("https://store.rightstartmath.com/login.php?from=account.php");
	}

}
