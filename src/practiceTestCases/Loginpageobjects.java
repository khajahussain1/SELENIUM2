package practiceTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpageobjects 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='identifierId']")
	public WebElement Username_txtbox;
	
	@FindBy(xpath="//*[@id='identifierNext']/content/span")
	public WebElement next_button;
	
	@FindBy(xpath="//*[@id='password']/div[1]/div/div[1]/input")
	public WebElement password_txtbox;
	
	@FindBy(xpath="//*[@id='passwordNext']/content/span")
	public WebElement signin_button;
	
public Loginpageobjects(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public void setusername(String username)
{
	Username_txtbox.sendKeys(username);
}

public void clickonnextbutton()
{
	next_button.click();
}

public void setpassword(String password)
{
	password_txtbox.sendKeys(password);
}

public void clickonsigninbutton()
{
	signin_button.click();
}

}
