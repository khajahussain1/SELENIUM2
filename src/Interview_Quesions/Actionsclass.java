package Interview_Quesions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {
	public static WebDriver driver;

	public static void main(String[] args) {

		//mouse over the webelement
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath(""))).build().perform();
		
		//drag and drop
		
		Actions a1 = new Actions(driver);
		WebElement source = driver.findElement(By.xpath(""));
		WebElement target = driver.findElement(By.xpath(""));		
		a1.dragAndDrop(source, target).build().perform();
		
		//other way of mouse over and drag and drop
		
		a1.clickAndHold(driver.findElement(By.xpath(""))).moveToElement(driver.findElement(By.xpath("")))
		.release(driver.findElement(By.xpath("")));
		a1.build().perform();
		
		//other way of mouse over and drag and drop
		Actions a2 = new Actions(driver);
		a2.moveToElement(driver.findElement(By.xpath("//*[@id='dragable']")));
		a2.keyDown(Keys.CONTROL);
		a2.moveToElement(driver.findElement(By.xpath("//*[@dropable]")));
		a2.keyDown(Keys.CONTROL);
		a2.build().perform();
		
		//how to perform double click
		
		a2.moveToElement(driver.findElement(By.xpath(""))).doubleClick();
		
		//how to perform keys in selenium usinf key calss
		
		a2.sendKeys(Keys.ENTER);
		a2.sendKeys(Keys.F6);
		
	}

}
