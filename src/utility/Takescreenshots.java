package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takescreenshots 
{
	public static String getScreenshot(WebDriver driver,String name)
	{
		//TakesScreenshot ts=(TakesScreenshot) driver;
		
		File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir")+"/src/screenshot/"+name+"_"+System.currentTimeMillis()+".png";
		
		File destination=new File(path);
		
		try 
		{
			FileUtils.copyFile(source, destination);
		} catch (IOException e) 
		{
			System.out.println("Capture Failed "+e.getMessage());
		}
		
		return path;
	}

	

}
