package Interview_Quesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findalllinksinwebpage {
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Workspace_Selenium\\SELENIUM\\lib\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']")); 
		 
	    List<WebElement> dropdown = driver.findElements(By.tagName("select"));  

		//java.util.List<WebElement> textboxes = driver.findElements(By.xpath("//input[@type='text'[@class='inputtext']")); 
		//System.out.println(textboxes.size());
		System.out.println(dropdown.size());
		System.out.println(links.size());
		System.out.println(checkboxes.size());
		
		for (int i = 0; i<=links.size(); i++)
 
		{
 
			System.out.println(links.get(i).getText());
 
		}
 
	
	}

}
