package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alert {
	public static WebDriver driver;
	
	@Test
	  public void f()
	  {
		  System.setProperty("webdriver.gecko.driver", "F:\\Workspace_Oxyze\\SELENIUM\\lib\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		  	driver.findElement(By.xpath("//*[@id='alert']")).click();
		  	  
	         driver.switchTo().alert().accept();
	         driver.findElement(By.xpath("//*[@id='alert']")).click();
		  	  
	         driver.switchTo().alert().accept();
	         
	         driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
  
	        //myAlert.accept();
 
 
	        //driver.close();
	  }

}
