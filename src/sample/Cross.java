package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.ReadORFile;

public class Cross {
	public WebDriver driver;
	
	private ReadORFile OR;
	
  @Parameters("browser")  
  @BeforeTest
  public void beforeTest(String browser) throws Exception 
  {
	  OR= new ReadORFile("C:\\Users\\Hussain\\Desktop\\Git _Local _Repo\\SELENIUM2\\src\\utility\\OR");
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hussain\\Desktop\\Git _Local _Repo\\SELENIUM2\\lib\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://spicejet.com/");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
	  }else if(browser.equalsIgnoreCase("gecko"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hussain\\Desktop\\Git _Local _Repo\\SELENIUM2\\lib\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.gmail.com");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
	  }
	  else if(browser.equalsIgnoreCase("ie"))
	  {
		  System.setProperty("webdriver.ie.driver", "C:\\Users\\Hussain\\Desktop\\Git _Local _Repo\\SELENIUM2\\lib\\IEDriverServer.exe");
		  InternetExplorerDriver  driver = new InternetExplorerDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		  driver.get("http://spicejet.com/");
		   
	  }
	  	  
  }
  @Test
  public void spicejet() 
  {
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[1]/li[12]/a")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Hyderabad (HYD)")).click();
	  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[6]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"Div1\"]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[4]/a")).click();	  
	  driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]")).click();
	  driver.findElement(By.xpath("option[2]")).click();
	  
	  
  }
  
  
  @Test
  public void gmail() throws Exception 
  
  {
	  driver.findElement(OR.getLocator("USER_NAME")).sendKeys("hussainonline9");
	  System.out.println(OR.getLocator("USER_NAME"));
	  driver.findElement(OR.getLocator("USER_BUTTON")).click();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	  driver.findElement(OR.getLocator("PASSWORD")).sendKeys("aish@1234$$");
	  driver.findElement(OR.getLocator("PASSWORD_BUTTON")).click();
  }
	  
  @AfterTest
  public void afterTest() {
  }

}
