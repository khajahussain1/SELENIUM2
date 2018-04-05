package sample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SwitchWindow {
	public static WebDriver driver;
	
  @Test
  public void f()
  {
	  System.setProperty("webdriver.gecko.driver", "F:\\Workspace_Oxyze\\SELENIUM\\lib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  String handle=driver.getWindowHandle();
	  System.out.println(handle);

	  	  driver.findElement(By.xpath("//*[@id='content']/p[3]/button")).click();
      Set handles = driver.getWindowHandles();

      System.out.println(handles);
      
      for (String handle1 : driver.getWindowHandles()) {
    	  
    	  System.out.println("#####################");

      	System.out.println(handle1);
      	System.out.println("#####################");

      	driver.switchTo().window(handle1);
      	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

      	}
      driver.close();
      driver.quit();

  }
}
