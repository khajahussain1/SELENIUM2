package Interview_Quesions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {
	public static WebDriver driver;

	//@Test
	public  void main() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/lib/chromedriver.exe");
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
	
	//@Test
	public void windows()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver3.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		ArrayList<String> al = new ArrayList<String>();

		while (i1.hasNext()) {

			al.add(i1.next());
		}
		driver.switchTo().window(al.get(2));
		System.out.println("welcome to hyd");

		driver.findElement(By.name("emailid")).sendKeys("gaurav3n@gmail.com");

		driver.findElement(By.name("btnLogin")).click();

		//driver.close();
		//driver.switchTo().window(al.get(0));
		//driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

	}
	
	@Test
	public void windows_Demo()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver3.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		
		
		String mainWindow=driver.getWindowHandle();
		 Set<String> set =driver.getWindowHandles();
		 Iterator<String> itr= set.iterator();
		 
		 while(itr.hasNext()){
			 
		 String childWindow=itr.next();
		 
		 if(!mainWindow.equals(childWindow)){
			 
		 driver.switchTo().window(childWindow);
		 
		 System.out.println(driver.switchTo().window(childWindow).getTitle());
		 driver.close();
		 }
		 }
		 driver.switchTo().window(mainWindow);
		 driver.close();
		 }
		
	}




