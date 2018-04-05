package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myntra {
	
	public static WebDriver driver;
	public Properties OR;
	
	
	Myntra() throws IOException{
		File fl=new File("F:\\Workspace_Seetest\\SELENIUM\\src\\utility\\OR");
		FileInputStream fi=new FileInputStream(fl);
		OR=new Properties();
		OR.load(fi);
	}
	
	@BeforeTest
public  void main() {
	System.setProperty("webdriver.chrome.driver", "F:\\Workspace_Seetest\\SELENIUM\\lib\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	driver.get("https://www.myntra.com/");
	

}
	@Test
	public void order() 
	{
		driver.findElement(By.xpath(OR.getProperty("MEN"))).click();
		driver.findElement(By.xpath(OR.getProperty("SECTION"))).click();
		driver.findElement(By.xpath(OR.getProperty("MODEL"))).click();
		driver.findElement(By.xpath(OR.getProperty("SIZE"))).click();
		driver.findElement(By.xpath(OR.getProperty("CONFIRM_ORDER"))).click();
		driver.findElement(By.xpath(OR.getProperty("GO_TO"))).click();
		driver.findElement(By.xpath(OR.getProperty("PLACE_ORDER"))).click();
		driver.findElement(By.xpath(OR.getProperty("GOING"))).click();
		driver.findElement(By.xpath(OR.getProperty("DONE"))).click();
		
	}
	@AfterTest
	public void cow()
	{
		//driver.close();
	}
}