package appium_interview_quesions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Scroll_fingure_tap_and_Swip {
	AppiumDriver<MobileElement> driver;

	@Test
	/*
	 * Double Tap Double tap on the touch screen using finger motion events
	 */

	public void scroll_double_fingure_tap() {
		WebElement element = driver.findElement(By.xpath(""));
		TouchActions action = new TouchActions(driver);
		action.doubleTap(element);
		action.perform();
	}

	@Test
	public void scroll_single_fingure_tap() {
		WebElement element = driver.findElement(By.xpath(""));
		TouchActions action = new TouchActions(driver);
		action.singleTap(element);
		action.perform();
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

	@Test
	public void scroll_verticle() {

	}

	@Test
	public void scroll_horizental() {

	}

	public void hortizonalSwipe() {
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int y = (int) (height * 0.20);
		int startx = (int) (width * 0.75);
		int endx = (int) (width * 0.35);
		driver.swipe(startx, y, endx, y, 500);
	}

	public void verticalSwipe() {
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width / 2;
		int starty = (int) (height * 0.80);
		int endy = (int) (height * 0.20);
		driver.swipe(x, starty, x, endy, 500);

	}

}
