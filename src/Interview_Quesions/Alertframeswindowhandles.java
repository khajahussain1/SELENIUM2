package Interview_Quesions;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertframeswindowhandles {

	public static WebDriver driver;
	
	public boolean isAlertpresent()
	{
		try {
			driver.switchTo().alert();
			return true;
			
		}catch(Exception e) {
			
		}
		return false;
	}
	
	public void allseleniuminterviewquestions() throws IOException
	{
		driver=new FirefoxDriver();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		//how to get alert text in selenium
		Alert text = driver.switchTo().alert();
		System.out.println(text.getText());
		
		
		//how to switch to frames		
		driver.switchTo().frame(0);
		driver.switchTo().frame("frmaename");
		driver.switchTo().frame("framewebelemet");
		
		//how to get windowhandle		
		String pwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> allwindow = allwindows.iterator();
		
		String parantwindow = allwindow.next();
		driver.switchTo().window(parantwindow);
		
		String chiledwindow = allwindow.next();
		driver.switchTo().window(chiledwindow);
		driver.switchTo().defaultContent();
		
		//wait conditions
		//implicitywait aplicable for entair page
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		//explicit wait applied some conditions where your adviseted statement popup will appear after 30 sencond that time it will aplicable.
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		//how to do mouse over in selenium
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath(""))).build().perform();
		
		//how to select data in the dropdown
		
		Select se = new Select(driver.findElement(By.xpath("")));
		se.selectByIndex(8);
		se.selectByValue("value");
		se.selectByVisibleText("text");
		
		//how to get the data of dropdowns
		List<WebElement> op = se.getOptions();
		
		//how to do draganddrop
		Actions a1=new Actions(driver);
		a1.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath("")));
		
		//how to get screen shot in selenium
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("C:\\text\\screenshot\\login\\"+".png"));
		
		//how to get the coordinate of window
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		
		//how to get both x & Y coordinates for window
		Point popoint = driver.manage().window().getPosition();
		popoint.getX();
		popoint.getY();
		
		//how get forwors and back word in window
		driver.navigate().forward();
		driver.navigate().back();
		
		//how to get currenturl of the page
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		
		//how to get title of the page
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//how we can count similar objets presents in the page
		int size = driver.findElements(By.xpath("")).size();
		
		//what is the syntex of follwing sybling and following
		driver.findElement(By.xpath("//*[@id='text']/following-sibling::td[2]")); 
		
		//what is the syntex of preceding sybling and following
		driver.findElement(By.xpath("//*[@id='text']/preceding-sibling::td[2]")); 
		
		//how to get the chiled locator of based on the x-path
		driver.findElement(By.xpath("//*[@id='text']/child::td[2]")); 
		
		//how you will get the 5th element of the UI----similar kind of element in the UI in 5th element
		driver.findElements(By.xpath("")).get(5);
		
		// how to know check boxes are selected or not
		driver.findElement(By.xpath("checkbox")).isSelected();
		
		//how to check that is element is displayed or not in the UI
		
		driver.findElement(By.xpath("")).isDisplayed();
		
		driver.findElement(By.xpath("")).isEnabled();
		
		//how to execute the javascript in selenium
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		//how to get no of windows are available on the UI
		js.executeScript("return window.lenght");
		
		//how to maximize the window
		driver.manage().window().maximize();
		
		//what is the different between "/" and "//"
		// is the relative path ang / is the absolute path
		
		//how to get the atribute value from the webelement
		System.out.println(driver.findElement(By.xpath("")).getAttribute("name")); //here we will get name of element
		
		//how to tap on submit button with out using click method in selenium
		
		driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
		
	 // i what to wait for particular element that time we will go for explicitywait	
		
	}

}
