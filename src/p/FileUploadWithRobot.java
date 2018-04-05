package p;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadWithRobot {

	public static void main(String args[]) throws Exception
    {
        
        System.setProperty("webdriver.chrome.driver","F:\\Workspace_Seetest\\SELENIUM2\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.findElement(By.id("imagesrc")).click();
        
        Robot r = new Robot();
        r.setAutoDelay(2000);
        r.delay(1500); 
 
        StringSelection ss = new StringSelection("F:\\vali photes\\ameer");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
 
        r.setAutoDelay(1000);
 
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
 
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
 
        r.setAutoDelay(1000);
 
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }
}
