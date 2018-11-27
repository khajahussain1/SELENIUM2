package Interview_Quesions;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Databaseconnection
{
	 private WebDriver driver;
	 private Connection con = null;
	 private Statement stmt = null;
	 String dataBaseName = "emp";
	 String driver_DBPath = "jdbc:oracle:thin:@localhost:1521:xe";
	 String DB_username = "khaja";
	 String DB_password = "khaja";
	 String Query;
	 ResultSet rs;
	 
	 @BeforeTest
	 public void DBConnection() throws Exception
	 {
	  try{
	   Class.forName("oracle.jdbc.driver.OracleDriver"); //For SQL
	      Connection con = DriverManager.getConnection(
	   driver_DBPath, DB_username,DB_password );
	      stmt = con.createStatement();
	  }catch(Exception e){System.out.println(e.getMessage());}
	 }
	 
	 @Test
	 public void tc_1() throws Exception
	 {
	  try{
	  Query = "Select * from emp";
	  rs = stmt.executeQuery(Query);
	  
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/lib/chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.get("http://www.qavalidation.com/demo");
	     
	     int i=1; //to name the screenshot file
	     while(rs.next()) //move to the next row in result set, row by row
	     {
	      String FullName = rs.getString("ename");
//	      String Email = rs.getString("Email");
//	      int Telephone = rs.getInt("Telephone");
//	      String Gender = rs.getString("Gender");
	      
	      WebElement Name = driver.findElement(By.id("username"));
	       Name.clear();
	       Name.sendKeys(FullName);
	      WebElement EmailAdd = driver.findElement(By.id("email"));
	              EmailAdd.clear();
	             // EmailAdd.sendKeys(Email);
	      WebElement CellPh = driver.findElement(By.id("tel"));
	       CellPh.clear();
	      // CellPh.sendKeys(Integer.toString(Telephone));
	 
	      Select sel = new Select(driver.findElement(By.name("sgender")));
	      //sel.selectByValue(Gender);
	      
	      i++;
	      GetScreenShot(i);
	     }
	     
	  }catch(Exception e){System.out.println(e.getMessage());}
	 }
	 
	 @AfterTest
	 public void tear()
	 {
	  con = null;
	 }
	 
	 public void GetScreenShot(int i) throws IOException
	 {
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File f = ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File(i+".jpg"));
	 }
	 }