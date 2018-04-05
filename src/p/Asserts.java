package p;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserts {
	public WebDriver driver;
	
	//@Test
	public void asserttrue()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace_Selenium\\SELENIUM\\lib\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();	
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		 
	      driver.get("http://www.store.demoqa.com");
	 
	      // Here driver will try to find out My Account link on the application
	 
	      WebElement myAccount = driver.findElement(By.xpath(".//*[@id='account']/a"));
	 
	      //Test will only continue, if the below statement is true
	 
	      //This is to check whether the link is displayed or not
	 
	      Assert.assertTrue(myAccount.isDisplayed());
	 
	      //My Account will be clicked only if the above condition is true
	 
	      myAccount.click();
	 
	}
	@Test
	public void assertfalse()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace_Selenium\\SELENIUM\\lib\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();	
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		 
	      driver.get("http://www.store.demoqa.com");
	 
	      // Here driver will try to find out My Account link on the application
	 
	      WebElement myAccount = driver.findElement(By.xpath(".//*[@id='account']/a"));
	 
	      //Test will only continue, if the below statement is true
	 
	      //This is to check whether the link is displayed or not
	 
	      Assert.assertFalse(myAccount.isDisplayed());
	 
	      //My Account will be clicked only if the above condition is true
	 
	      myAccount.click();
	 
		/*System.setProperty("webdriver.chrome.driver", "F:\\Workspace_Selenium\\SELENIUM\\lib\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();	
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		 
			driver.navigate().to("http://google.com");
			Assert.assertEquals("Gooogle", driver.getTitle(), "Strings are not matching");
			//Write a code to login and write a method called isUserLoggedInSuccessfully and isUserLoggedOut which returns boolean.
			Assert.assertTrue(isUserLoggedInSuccessfully(), "User failed to login");
			Assert.assertFalse(isUserLoggedOut())
	      */
	      
	}
	
	//@Test
	public void assertequals()
	{
		
	String sValue = "Lakshay Sharma";
	 
	  System.out.println(" What is your full name");

	  Assert.assertEquals("Lakshay Sharm", sValue);

	  System.out.println(sValue);
	}




/*1. assertEqual(String actual,String expected) :- It takes two string arguments and checks whether
  both are equal, if not it will fail the test.
 

2. assertEqual(String actual,String expected, String message) :- It takes three string arguments 
and checks whether both are equal, if not it will fail the test and throws the message which we 
provide.

3. assertEquals(boolean actual,boolean expected) :- It takes two boolean arguments and checks 
whether both are equal, if not it will fail the test.

4. assertEquals(java.util.Collection actual, java.util.Collection expected, java.lang.String 
message) :- Takes two collection objects and verifies both collections contain the same elements 
and with the same order. if not it will fail the test with the given message.

5. Assert.assertTrue(condition) :- It takes one boolean arguments and checks that a condition
 is true, If it isn't, an AssertionError is thrown.

6. Assert.assertTrue(condition, message) :- It takes one boolean argument and String message. 
It Asserts that a condition is true. If it isn't, an AssertionError, with the given message, is 
thrown.

7. Assert.assertFalse(condition) :- It takes one boolean arguments and checks that a condition
 is false, If it isn't, an AssertionError is thrown.

8. Assert.assertFalse(condition, message) :- It takes one boolean argument and String message. 
It Asserts that a condition is false. If it isn't, an AssertionError, with the given message, 
is thrown.
*/
}