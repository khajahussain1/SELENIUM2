package appium_interview_quesions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Scroll_fingure_tap_and_Swip {
	//AppiumDriver<MobileElement> driver;
	AndroidDriver<MobileElement> driver;
	
	@Test
	public void logpress()
	{
		TouchAction ac = new TouchAction(driver);
		MobileElement ele = driver.findElementById("com.android.mms:id/from");
		ac.longPress(ele).perform().release();
	}

	@Test
	/*
	 * Double Tap Double tap on the touch screen using finger motion events
	 */

	public void scroll_double_fingure_tap() {
		WebElement element = driver.findElement(By.xpath(""));
		TouchActions action = new TouchActions(driver);
		action.doubleTap(element).perform();
	}

	@Test
	public void scroll_single_fingure_tap() {
		WebElement element = driver.findElement(By.xpath(""));
		TouchActions action = new TouchActions(driver);
		action.singleTap(element).perform();
	}

	@Test
	public void scroll_multy_fingure_tap() {
		
		 /*TouchActions actionOne = new TouchActions(driver); actionOne.press(10, 10);
		 actionOne.moveTo(10, 100); actionOne.release(); TouchActions actionTwo = new
		 TouchActions(driver); actionTwo.press(20, 20); actionTwo.moveTo(20, 200);
		 actionTwo.release(); MultiTouchAction action = new MultiTouchAction(driver);
		 action.add(actionOne); action.add(actionTwo); action.perform();
		*/
	}

	

	public void hortizonalSwipe() {
		Dimension di = driver.manage().window().getSize();
		int height = di.getHeight();
		int width = di.getWidth();
		int y = (int) (height * 0.20);
		int startx = (int) (width * 0.75);
		int endx = (int) (width * 0.35);
		//driver.swipe(startx, y, endx, y, 500);
	}

	public void verticalSwipe() {
		Dimension di = driver.manage().window().getSize();
		int height = di.getHeight();
		int width = di.getWidth();
		int x = width / 2;
		int starty = (int) (height * 0.80);
		int endy = (int) (height * 0.20);
		//driver.swipe(x, starty, x, endy, 500);

	}
	
	@Test
	public void presskeycode() throws InterruptedException
	{
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		Thread.sleep(2000);
	}

}
