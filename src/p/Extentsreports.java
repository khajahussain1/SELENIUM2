package p;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class Extentsreports {

	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	Calendar calendar;
	SimpleDateFormat formater;
	String time;

	public Extentsreports() {
		calendar = Calendar.getInstance();
		formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		time=formater.format(calendar.getTime());
	}

	@BeforeMethod
	public void beforemethod() {
		report = new ExtentReports(System.getProperty("user.dir") + "/src/extentreports/Extentreport_"
				+ time+ ".html");

		logger = report.startTest("VerifyBlogTitle");
	}

	@Test
	public void verifyBlogTitle() {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/lib/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Browser started ");
		driver.get("http://www.learn-automation.com");

		logger.log(LogStatus.INFO, "Application is up and running");

		String title = driver.getTitle();

		Assert.assertTrue(title.contains("Google"));

		logger.log(LogStatus.PASS, "Title verified");
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {

			String screenshot_path = getScreenshot(result.getName());
			String image = logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.FAIL, "Title verification", image);

		}

		report.endTest(logger);
		report.flush();

		// driver.get("C:\\Report\\LearnAutomation.html");
	}

	public String getScreenshot(String name) {


		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir") + "/src/screenshot/" + name + "_"
				+ time + ".png";

		File destination = new File(path);

		try {
			FileUtils.copyFile(source, destination);

		} catch (IOException e) {
			System.out.println("Capture Failed " + e.getMessage());
		}

		return path;
	}

}
