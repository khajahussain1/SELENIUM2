package p;

import java.text.SimpleDateFormat;
import java.util.Calendar;

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
	 
	static {
//		Calendar calendar = Calendar.getInstance();
//		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
//		extent = new ExtentReports(System.getProperty("user.dir") + "/src/main/java/com/hybridFramework/report/test" + formater.format(calendar.getTime()) + ".html", false);
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		report=new ExtentReports(System.getProperty("user.dir") + "/src/extentreports/Extentreport_" + formater.format(calendar.getTime()) + ".html", false);
		 
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

	


