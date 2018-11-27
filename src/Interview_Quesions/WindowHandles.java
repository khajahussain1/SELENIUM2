package Interview_Quesions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/lib/chromedriver.exe");
		driver=new ChromeDriver();
		driver=new ChromeDriver();
		driver=new ChromeDriver();
		driver.get("http://gmail.com");
		Set<String> windowid = driver.getWindowHandles();
		
		Iterator<String> itr = windowid.iterator();
		
		ArrayList<String> ids=new ArrayList<String>();
		
		while(itr.hasNext())
		{
			ids.add(itr.next());
		}
		//go to 3rd window
		driver.switchTo().window(ids.get(1));
		//perform some actions on 3rd window and close.
		
		driver.findElement(By.xpath(""));
		driver.close();
		
		//switchto 2nd window
		driver.switchTo().window(ids.get(2));
		
		//perform some actions and close window
		driver.close();
		
		//switch back to parent window and perform some action and close
		driver.switchTo().window(ids.get(0));
		
		//how get coordinates of window
		
		Point position = driver.manage().window().getPosition();
		position.getX();
		position.getY();
		
		//get position of element
		
		Point location = driver.findElement(By.xpath("")).getLocation();
		location.getX();
		location.getY();
	}

}
