package p;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlenoofframes {
	public WebDriver driver;
	@Test
	public void frames() {
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace_Selenium\\SELENIUM\\lib\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	
	driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
	 
	JavascriptExecutor exe = (JavascriptExecutor) driver;
	Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
	System.out.println("Number of iframes on the page are " + numberOfFrames);
	
	//By finding all the web elements using iframe tag
	List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
	System.out.println("The total number of iframes are " + iframeElements.size());
	
	
	}
	@Test
	public void switchframes() {
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace_Selenium\\SELENIUM\\lib\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();	
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement element=driver.findElement(By.xpath("//*[@id=\"content\"]/p[5]"));
	js.executeScript("arguments[0].scrollIntoView()", element);
	
	driver.switchTo().frame(0);
	
	WebElement Element=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[2]/a/strong"));
	js.executeScript("arguments[0].scrollIntoView()", Element);
	
	
	/* now find the First name field */
	WebElement firstName = driver.findElement(By.xpath("//*[@id='content']/form/fieldset/div[1]/p[3]/input"));

	/* now find the Last name field */
	WebElement lastName = driver.findElement(By.xpath("//*[@id='content']/form/fieldset/div[1]/p[4]/input"));
	firstName.sendKeys("Virender");
	lastName.sendKeys("Singh");
	
	
	}

}
