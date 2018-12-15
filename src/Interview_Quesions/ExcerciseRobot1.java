package Interview_Quesions;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExcerciseRobot1 {
	public static WebDriver driver;

	//@Test
	public void main() throws AWTException, InterruptedException {	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/lib/chromedriver2.exe");
		  driver =new ChromeDriver();
		  Thread.sleep(2000);
        driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // sample url	
        driver.findElement(By.xpath(".//a[@href=contains(text(),'yearly-calendar.xls')]")).click();	
        
        Robot robot = new Robot();  // Robot class throws AWT Exception	
        Thread.sleep(2000); // Thread.sleep throws InterruptedException	
        robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
        
        Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_ENTER);	
    // press enter key of keyboard to perform above selected action	
  }	 

	//@Test
	public void passFirfoxDownloadDialogUseRobot() {
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/lib/geckodriver2.exe");

			driver = new FirefoxDriver();
			driver.manage().window().maximize();

			driver.navigate().to("http://www.dev2qa.com/download/326/");

			Robot robotObj = new Robot();

			Thread.sleep(2000);
			robotObj.keyPress(KeyEvent.VK_DOWN);
			robotObj.keyRelease(KeyEvent.VK_DOWN);

			// Press tab key three time to navigate to Save button.
			for (int i = 0; i < 3; i++) {
				Thread.sleep(2000);
				robotObj.keyPress(KeyEvent.VK_TAB);
			}

			// Press down Save button.
			Thread.sleep(2000);
			robotObj.keyPress(KeyEvent.VK_ENTER);

			// Release up Save button, download process start.
			Thread.sleep(2000);
			robotObj.keyRelease(KeyEvent.VK_ENTER);

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (driver != null) {
				driver.close();
				driver = null;
			}
		}
	}
	
	//@Test
	public void screen_capture_using_robot() throws IOException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/lib/chromedriver2.exe");
		  driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		// open webpage
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Robot robot = new Robot();
		int x = 10;
		int y = 10;
		int width = 500;
		int height = 200;
		Rectangle area = new Rectangle(x, y, width, height);
		BufferedImage bufferedImage = robot.createScreenCapture(area);
		File imageFile = new File("F:\\Robot.png");
		ImageIO.write(bufferedImage, "png", imageFile);
	}
	
	@Test
	public void screen_capture_using_robot_full() throws IOException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/lib/chromedriver2.exe");
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		// open webpage
		driver.get("https://chercher.tech/java/practice-pop-ups-selenium-webdriver");
		// create object to robt class
		Robot robot = new Robot();
		// create rectangle for full screenshot
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		// capture screen of the desktop
		BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
		// save the screenshot to local system
		ImageIO.write(screenFullImage, "png", new File("F:\\FullScreenshotRobot.png"));

		System.out.println("Full Desktop screenshot saved!");
  
	}
	
	/*
	 * Difference between Actions class and Robot class 
	 *1. Actions class simulates Mouse and keyboard, Robot class enables the actual mouse and keyboard, because of this reason 
	    you can see the movement of mouse cursor.
      2. Actions class does not affect parallel running but Robot class affects the parallel running as there is only one 
         mouse connected to system
      3. Actions class uses the native browser commands, Mouse class does not use browser based commands
      4. Actions class limited to browser application, Robot class is can be used along with all the applications
      5. Actions class is from org.openqa.selenium.interactions.Actions, Robot class is from java.awt.Robot
      
      6. Robot class throws few exceptions, we have to explicitly handle the exception with java.

      7. AWTException - if the platform configuration does not allow low-level input control. This exception is always thrown 
         when GraphicsEnvironment.isHeadless() returns true.

      8. IllegalArgumentException - if screen is not a screen GraphicsDevice.

      9. SecurityException - if createRobot permission is not granted

	 */

}
