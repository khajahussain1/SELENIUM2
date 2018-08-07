package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takescreenshots 
{
	/*public static String getScreenshot(WebDriver driver,String name)
	{
		Calendar calendar = Calendar.getInstance();
	SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
//extent = new ExtentReports(System.getProperty("user.dir") + "/src/main/java/com/hybridFramework/report/test" + formater.format(calendar.getTime()) + ".html", false);
	
		//TakesScreenshot ts=(TakesScreenshot) driver;
		
		
		File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir")+"/src/screenshot/"+name+"_"+formater.format(calendar.getTime())+".png";
		
		File destination=new File(path);
		
		try 
		{
			FileUtils.copyFile(source, destination);
		} catch (IOException e) 
		{
			System.out.println("Capture Failed "+e.getMessage());
		}
		
		return path;
	}*/

	

}
