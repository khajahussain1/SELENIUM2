package p;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Javascriptexecutor {
	public WebDriver driver;

	
	@Test
	public void click() throws Exception
	{
		driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		//driver.get("http://www.google.com/");
		  driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//passing the vale into text box
		//js.executeScript("document.getElementById('lst-ib').value = 'selenium'");
		//click on button
		//js.executeScript("document.getElementById('gb_70').click()");
		//refresh the current page
		//js.executeScript("history.go(0)");
		//get the text from particularwebelement
		//String particularwebelement=js.executeScript("return document.getElementById('gb_70').innerHTML").toString();
		//System.out.println(particularwebelement);
		
		//get webpage title
		//String webpagetitle=js.executeScript("return document.title").toString();
				//System.out.println(webpagetitle);
		
		//scroll end of the page
		//js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		//scroll particular webelement
		//js.executeScript("document.getElementById('staticImage').scrollIntoView()");
		//navigate to back
		js.executeScript("window.history.back()");
		Thread.sleep(20000);
		js.executeScript("window.history.forward()");
	}
}
