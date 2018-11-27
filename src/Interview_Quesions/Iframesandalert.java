package Interview_Quesions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframesandalert {

	public static WebDriver driver;

	public static void main(String[] args) {

		// how to handle popups in selenium
		Alert alt = driver.switchTo().alert();
		alt.accept();
		alt.dismiss();

		// how to control ifrmes
		int count = driver.findElements(By.tagName("iframe")).size();
		System.out.println(count);

		// switch to based on frme index
		driver.switchTo().frame(0);

		// switch to based on frame name
		driver.switchTo().frame("auto");

		// switch to based on frame webelemt

		driver.switchTo().frame(driver.findElement(By.xpath("")));

		// how to perform select on selenium
		Select select = new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(1);
		select.selectByValue("valuename");
		select.selectByVisibleText("textname");

		// how to perform deselect

		select.deselectByIndex(1);
		select.deselectByValue("valuename");
		select.deselectByVisibleText("textname");
		select.deselectAll();

		// how to execute java script in selenium

		EventFiringWebDriver driver1 = new EventFiringWebDriver(driver);
		driver1.executeScript("document.getElementById(\"idname\")");
		driver1.executeScript("document.getElementById(\"idname\").value=\"selenium\"");

		// other way of java script executor
		// JavaScriptExecutor js = ((JavaScriptExecutor)driver);

	}

}
