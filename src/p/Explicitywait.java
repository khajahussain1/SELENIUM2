package p;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Explicitywait {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		//######### implicitywait ####################
		//It is aplying entair page
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		//####### Explicitywait ##########
		//it is checking every 1 second
		
	WebDriverWait	wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));
   
	//############# polling interval ######################
	//it is checking evering 5 seconds
	
	WebDriverWait	wait1 = new WebDriverWait(driver, 60);
	wait1.pollingEvery(5, TimeUnit.SECONDS);
	wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));
	
	//################# fluentwait #############
	
	WebElement wait3= new FluentWait<WebDriver>(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class)
			.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
	wait3.click();
	
	// ########## page load time out###########
	// It is applying for only loading page
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	// ############# javascript ready state ##########
	
	ExpectedCondition<Boolean> javascriptwait= new ExpectedCondition<Boolean>() {

		public Boolean apply(WebDriver driver) {
			return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
		}
				
	};
	try {
		System.out.println("Wait for page to load");
		WebDriverWait wait4= new WebDriverWait(driver, 60);
		wait4.until(javascriptwait);
		
	}catch(Throwable error) {
		System.out.println("Time waiting for page load request to complete after "+ 60+"Seconds");
		Assert.assertFalse(true, "Time waiting for page load request to complete");
	}
	
	}

}
