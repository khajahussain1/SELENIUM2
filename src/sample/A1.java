package sample;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import utility.ReadORFile;

public class A1 {
	public WebDriver driver;
	private ReadORFile OR;
  @Test
  public void f() throws Exception {
	  OR= new ReadORFile("F:\\Workspace_Seetest\\SELENIUM2\\src\\utility\\OR");
	 // System.setProperty("webdriver.chrome.driver", "F:\\Workspace_Selenium\\SELENIUM\\lib\\chromedriver.exe");
	  //driver=new ChromeDriver();
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  //driver.get("https://www.myntra.com");
	  driver.get("https://accounts.google.com/");
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//	  driver.findElement(OR.getLocator("USER_NAME")).sendKeys("hussainonline9");
//	  System.out.println(OR.getLocator("USER_NAME"));
//	  driver.findElement(OR.getLocator("USER_BUTTON")).click();
//	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//	  driver.findElement(OR.getLocator("PASSWORD")).sendKeys("aish@1234$$");
//	  driver.findElement(OR.getLocator("PASSWORD_BUTTON")).click();
	  
	  JavascriptExecutor jsx = (JavascriptExecutor)driver;
	   
	  //jsx.executeScript("window.scrollBy(0,4500)", ""); //scroll down
	  
	 /* WebElement element=driver.findElement(By.cssSelector("#mountRoot > div > main > div > div:nth-child(7) > div > div > div > div > div:nth-child(3) > div > div > div > div > div > a > div > div:nth-child(1) > div > div > div > img"));
	  jsx.executeScript("arguments[0].scrollIntoView();", element);
	  
	  Thread.sleep(3000);
	  
	  jsx.executeScript("window.scrollBy(0,-4500)", ""); //scroll up
*/	  
	  driver.get("https://www.myntra.com");
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[1]/li[12]/a")).click();
	  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Hyderabad (HYD)")).click();
	  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[6]/a")).click();
	  //driver.findElement(By.xpath("//*[@id=\"Div1\"]/button")).click();
	  driver.findElement(By.xpath("/*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[4]/a")).click();
	  screenshot();
	  //driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]")).click();
	  //driver.findElement(By.xpath("option[2]")).click();
	  
	  	  
  }
  
  public void screenshot()
  {
	  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  try {
	   // now copy the  screenshot to desired location using copyFile //method
	  FileUtils.copyFile(src, new File("F:\\WorkSpace_Selenium\\SELENIUM\\screens\\khaja.png"));
	  }
	   
	  catch (IOException e)
	   {
	    System.out.println(e.getMessage());
	   
	   }
  }
}
