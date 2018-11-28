package appium_interview_quesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

public class Scroll_fingure_tap_and_Swip 
{
	WebDriver driver;
	
	@Test	
	/*Double Tap
	Double tap on the touch screen using finger motion events
*/

	public void scroll_double_fingure_tap()
	{
		WebElement element=driver.findElement(By.xpath(""));
		TouchActions action = new TouchActions(driver);
		action.doubleTap(element);
		action.perform();
	}
	
	@Test
	public void scroll_single_fingure_tap()
	{
		
	}
	
	@Test
	public void scroll_multy_fingure_tap()
	{
		
	}
	
	@Test
	public void scroll_verticle()
	{
		
	}
	
	@Test
	public void scroll_horizental()
	{
		
	}
	
	@Test
	public void swip_verticle()
	{
		
	}
	@Test
	public void swip_horizental()
	{
		
	}

}

