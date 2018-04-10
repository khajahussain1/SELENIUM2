package p;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excelreader {
	public WebDriver driver;

	public ArrayList<String> readdata(int colnum) throws IOException {
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Hussain\\Desktop\\TestData.xlsx");
		
      XSSFWorkbook wb=new XSSFWorkbook(fi);
      XSSFSheet s=wb.getSheet("Sheet1");
      
      Iterator<Row> it=s.iterator();
      it.next();
      
      ArrayList<String> list=new ArrayList<String>();
      
      while(it.hasNext())
      {
    	  list.add(it.next().getCell(colnum).getStringCellValue());
      }
      System.out.println("List ::::"+list);
      return list;
	}
	public void ts() throws IOException
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://store.rightstartmath.com/login.php?from=account.php");
		ArrayList<String> username=readdata(0);
		ArrayList<String> password=readdata(1);
		
		for(int i=0; i<username.size(); i++) {
			
		driver.findElement(By.id("login_email")).sendKeys(username.get(i));
		driver.findElement(By.id("login_pass")).sendKeys(password.get(i));
		}
		
	}

 public static void main(String args[]) throws IOException
 {
	 Excelreader ex=new Excelreader();
	 ex.readdata(1);
	 ex.ts();
 }
}
