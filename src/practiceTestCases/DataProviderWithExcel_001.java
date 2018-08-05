package practiceTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelUtils;

public class DataProviderWithExcel_001 {
	
	
	public WebDriver driver;
	public String testcasename;
	public int testcaserownum;
	public static boolean bResult=true;
public Loginpageobjects loginpage;

//@DataProvider
public static Object[][] credentials()
{
	Object testdata[][] ={{"hussainonline9", "aish@1234$$"}, {"poolakhaja", "aish@1234$$$"}};
	return (testdata);
}
	
	@BeforeMethod
	  public void beforeMethod()throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/lib/geckodriver.exe");
		 
		driver = new FirefoxDriver();
		driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        driver.get("http://www.gmail.com");       
        
	  }
	
	@DataProvider
	public static Object[][] credentials1()
	{
		Object testdata[][]= {{"hussainonline9", "aish@1234$$"}};
		return testdata;
	}
	
  @Test(dataProvider="credentials1")
  //@Parameters({"username", "password"})
  public void Registration_data(String username, String password)throws  Exception
  {
	  try {
	  loginpage=new Loginpageobjects(driver);
	  loginpage.setusername(username);
	  loginpage.next_button.click();
	  loginpage.setpassword(password);
	  loginpage.clickonsigninbutton();
	  
	  if (bResult == true) {
		  ExcelUtils.takeScreenshot(driver, testcasename);

	  } else {
			throw new Exception("Test Case Failed because of Verification");
		}
	  
	  System.out.println(username+" "+  password);
	  }catch(Exception e)
	  {
		  //ExcelUtils.takeScreenshot(driver, testcasename);
		  throw e;
	  }
	  
	  
			
	  /*driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(sUserName);
		System.out.println(sUserName);

	  driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(sPassword);
	  System.out.println(sPassword);
	  driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
 
	  System.out.println(" Login Successfully, now it is the time to Log Off buddy.");*/

  
  }
  //@Test(priority=1, dataProvider = "Authontication")
  public void Registration(String sUserName, String sPassword)throws  Exception
  {
	  loginpage=new Loginpageobjects(driver);
	  loginpage.setusername(sUserName);
	  loginpage.next_button.click();
	  loginpage.setpassword(sPassword);
	  loginpage.clickonsigninbutton();
  }
  
  

  @AfterMethod
  public void afterMethod() {
  }


  //@DataProvider
  public Object[][] Authontication() throws Exception
  {
	  testcasename=this.getClass().getSimpleName();
	  System.out.println(testcasename);
	  
	  ExcelUtils.excelfile(System.getProperty("user.dir")+"/src/testData/TestData.xlsx","Sheet1");
	  
	  testcaserownum=ExcelUtils.gettestcasename(testcasename);
	  System.out.println(testcaserownum);
		
    Object testdata[][] =ExcelUtils.setExcelFile(System.getProperty("user.dir")+"/src/testData/TestData.xlsx","Sheet1", testcaserownum);

    return testdata;
    
    
    }
  }

