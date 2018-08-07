package p;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.Takescreenshots;

public class Extentsreports {
	
	ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;
	 
	 
	@BeforeMethod
	public void beforemethod()
	{
		report=new ExtentReports("C:\\Users\\Hussain\\Desktop\\Git _Local _Repo\\SELENIUM2\\src\\extentreports\\Extentreport.html");
		 
		logger=report.startTest("VerifyBlogTitle");
	}
	@Test
	public void verifyBlogTitle()
	{
		 
	driver=new FirefoxDriver();
	 
	driver.manage().window().maximize();
	 
	logger.log(LogStatus.INFO, "Browser started ");
	 
	driver.get("http://www.learn-automation.com");
	 
	logger.log(LogStatus.INFO, "Application is up and running");
	 
	String title=driver.getTitle();
	 
	Assert.assertTrue(title.contains("Google")); 
	 
	logger.log(LogStatus.PASS, "Title verified");
	}
	 
	 
	@AfterMethod
	public void tearDown(ITestResult result)
	{
	if(result.getStatus()==ITestResult.FAILURE)
	{
	 
	String screenshot_path=Takescreenshots.getScreenshot(driver, result.getName());
	String image= logger.addScreenCapture(screenshot_path);
	logger.log(LogStatus.FAIL, "Title verification", image);
	 
	 
	}
	 
	report.endTest(logger);
	report.flush();
	 
	driver.get("C:\\Report\\LearnAutomation.html");
	}

	 
}

	


