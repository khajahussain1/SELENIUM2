package p;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practies {
	public static WebDriver driver;


	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","F:\\\\Workspace_Seetest\\\\SELENIUM1\\\\lib\\\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");  
		
		String noofrows=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[2]")).getText();
		
		System.out.println("No of rows are: "+noofrows);
		
		/*List <WebElement> noofcol=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td"));
		
		System.out.println("No of columes are : "+noofcol.size());
		
        List <WebElement> noofrowsnoofcolums=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td"));
		
		System.out.println("no of rows * no of columes are : "+noofrowsnoofcolums.size());
 */
		
		}
		
				
	}
