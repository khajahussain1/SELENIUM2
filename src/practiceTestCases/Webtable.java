package practiceTestCases;



import java.io.File;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webtable {
	static WebDriver driver;
  
	//@Test
  public void Noofrowsandcols () {
		
		  System.setProperty("webdriver.chrome.driver","F:\\\\Workspace_Seetest\\\\SELENIUM1\\\\lib\\\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");         
	        List  col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	        System.out.println("No of cols are : " +col.size()); 
	        List  rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
	        System.out.println("No of rows are : " + rows.size());
	        //driver.close();
	     }
	
	//@Test
	public void RowandCell ()
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\\\Workspace_Seetest\\\\SELENIUM1\\\\lib\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://money.rediff.com/gainers/bsc/daily/groupa?"); 
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		
		 WebElement baseTable = driver.findElement(By.tagName("table"));
		  
		 //To find third row of table
		 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
		 String rowtext = tableRow.getText();
		 System.out.println("Third row of table : "+rowtext);
		    
		    //to get 3rd row's 2nd column data
		    WebElement cellIneed = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		    String valueIneed = cellIneed.getText();
		    System.out.println("Cell value is : " + valueIneed); 
    }
	
	//@Test
	public void MaxFromTable () throws ParseException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Workspace_Seetest\\SELENIUM1\\lib\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://money.rediff.com/gainers/bsc/daily/groupa?"); 
		 String max;
	     double m=0,r=0;
		 
	       //No. of Columns
	        List  col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("Total No of columns are : " +col.size());
	        //No.of rows
	        List  rows = driver.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	        System.out.println("Total No of rows are : " + rows.size());
	        
	        for (int i =1;i<rows.size();i++)
	        {    
	            max= driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
	            NumberFormat f =NumberFormat.getNumberInstance(); 
	            Number num = f.parse(max);
	            max = num.toString();
	            m = Double.parseDouble(max);
	            if(m>r)
	             {    
	                r=m;
	             }
	        }
	        System.out.println("Maximum current price is : "+ r);
   }
	
	@Test
	public static void captureScreenMethod() throws Exception{
		System.setProperty("webdriver.chrome.driver","F:\\Workspace_Seetest\\SELENIUM1\\lib\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");         
	      File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("F:\\Workspace_Seetest\\SELENIUM1\\screenshots\\SoftwareTestingMaterial.png"));
		driver.close();
		driver.quit();		
	}
}
	

	
  

