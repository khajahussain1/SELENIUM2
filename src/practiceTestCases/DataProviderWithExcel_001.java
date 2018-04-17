package practiceTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelUtils;

public class DataProviderWithExcel_001 {
	
	
	public WebDriver driver;
	
	//@BeforeMethod
	  public void beforeMethod()throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hussain\\Desktop\\Git _Local _Repo\\SELENIUM2\\lib\\geckodriver.exe");
		 
		driver = new FirefoxDriver();
		driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        driver.get("http://www.gmail.com");
        
        
	  }
	
  @Test(dataProvider = "Authontication")
  public void Registration_data(String sUserName, String sPassword)throws  Exception
  {
			
	  /*driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(sUserName);
		System.out.println(sUserName);

	  driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(sPassword);
	  System.out.println(sPassword);
	  driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
 
	  System.out.println(" Login Successfully, now it is the time to Log Off buddy.");*/

  
  }
  
  

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] Authontication() throws Exception
  {
		
    Object test[][] =ExcelUtils.setExcelFile("C:\\Users\\Hussain\\Desktop\\Git _Local _Repo\\SELENIUM2\\src\\testData\\TestData.xlsx","Sheet1");

    return (test);
    
    
    }
  }

