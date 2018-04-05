package p;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Typedtextfromtextbox {
	public WebDriver driver;

	
	@Test
	public void switchframes() {
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace_Selenium\\SELENIUM\\lib\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();	
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.get("https://accounts.google.com/");
	driver.get("https://www.flipkart.com/");
	WebElement element=driver.findElement(By.name("identifier"));
	element.sendKeys("hussainonline9");
	//System.out.println(element.getAttribute("value"));

}
}
