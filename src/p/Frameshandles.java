package p;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frameshandles {
	WebDriver driver;

	@Test
	public void allframeshandles() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//int size = driver.findElements(By.tagName("iframe")).size();
		List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
		
		System.out.println(allframes.size());
		

		for (int i = 0; i <= allframes.size(); i++) {
			System.out.println(i);
			driver.switchTo().frame(i);
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("khajahussain");
			driver.switchTo().defaultContent();
		}

		// //List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
		//
		// for (int i = 0; i < allframes.size(); i++) {
		// System.out.println(allframes.get(i));
		//
		// }

	}

	private char[] get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
