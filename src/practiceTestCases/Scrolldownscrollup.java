package practiceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolldownscrollup {

	WebDriver driver;
    @Test
    public void ByVisibleElement() {
        System.setProperty("webdriver.chrome.driver", "F:\\Workspace_Seetest\\SELENIUM1\\lib\\chromedriver.exe");
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("http://demo.guru99.com/test/guru99home/");

        //Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.linkText("Linux"));

        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
}
