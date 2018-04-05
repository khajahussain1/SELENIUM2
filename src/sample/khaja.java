package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class khaja {
	public static WebDriver driver=null;
	
  @Test
  public void f() 
  {
	/*// Set the driver path
			System.setProperty("webdriver.edge.driver","F:\\Workspace_Seetest\\SELENIUM\\lib\\MicrosoftWebDriver.exe");
			
			//Start Edge Session
			driver=new EdgeDriver();
			
			driver.get("http://spicejet.com/");
	*/		
		
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\Workspace_Selenium\\SELENIUM\\lib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://spicejet.com/");
	  driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
	 

	  /*System.setProperty("webdriver.ie.driver", "F:\\Workspace_Selenium\\SELENIUM\\lib\\IEDriverServer.exe");
	  InternetExplorerDriver  driver = new InternetExplorerDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
	  driver.get("http://spicejet.com/");
	  */
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	  driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[1]/li[12]/a")).click();
	  driver.findElement(By.linkText("Hyderabad (HYD)")).click();
	  //driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[6]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"Div1\"]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[4]/a")).click();	  
	  driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]")).click();
	  driver.findElement(By.xpath("option[2]")).click();
	  
	 
	 /* String exePath = "F:\\\\Workspace_Selenium\\\\SELENIUM\\\\lib\\\\IEDriverServer.exe";
		InternetExplorerDriverService.Builder serviceBuilder = new InternetExplorerDriverService.Builder();
		serviceBuilder.usingAnyFreePort(); // This specifies that sever can pick any available free port to start
		serviceBuilder.usingDriverExecutable(new File(exePath)); //Tell it where you server exe is
		serviceBuilder.withLogLevel(InternetExplorerDriverLogLevel.TRACE); //Specifies the log level of the server
		serviceBuilder.withLogFile(new File("C:\\Users\\Hussain\\Documents\\logFile.txt")); //Specify the log file. Change it based on your system
		InternetExplorerDriverService service = serviceBuilder.build(); //Create a driver service and pass it to Internet explorer driver instance
		InternetExplorerDriver driver = new InternetExplorerDriver(service);
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.get("http://spicejet.com/");
 */ }
}
