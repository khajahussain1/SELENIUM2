package p;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Gride {
	public WebDriver driver;
  @Test
  public void f() throws MalformedURLException {
	  String nodeurl="http://192.168.43.165:4444/wd/hub"; 
	  //System.setProperty("webdriver.chrome.driver", "F:\\Workspace_Seetest\\SELENIUM2\\lib\\chromedriver.exe");
	  DesiredCapabilities cap=DesiredCapabilities.firefox();
	  
	  cap.setBrowserName("firefox");
	  cap.setPlatform(Platform.WINDOWS);
	  driver=new RemoteWebDriver(new URL(nodeurl), cap);
	  driver.get("http://www.gmail.com");
  }
}
