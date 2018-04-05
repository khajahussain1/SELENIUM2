package p;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdownvalues {
	public WebDriver driver;
	
	@Test
	public void dropdown() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace_Selenium\\SELENIUM\\lib\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		
			Select s=new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")));
			List<WebElement> dropdown=s.getOptions();
			System.out.println(dropdown.size());
			
			for(int i=0; i<dropdown.size(); i++ )
			{
				System.out.println(dropdown.get(i).getText());
			}
			
			
			System.out.println(driver.getCurrentUrl());
			//driver.get("gmail.com");
			
	}
	//@Test
	public void textbox() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace_Selenium\\SELENIUM\\lib\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		driver.get("http://www.gmail.com/");
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("hussainonline9");
		//driver.findElement(By.xpath("//input[@name='identifier']")).clear();
	}
	
}
