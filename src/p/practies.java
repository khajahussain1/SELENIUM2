package p;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class practies 
{
	public static void main(String[] args) {
		 System.setProperty("webdriver.ie.driver", "C:\\Users\\Hussain\\Desktop\\Git _Local _Repo\\SELENIUM2\\lib\\IEDriverServer.exe");
		  WebDriver driver = new InternetExplorerDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		  driver.get("http://spicejet.com/");
		
	}
}
				
	
