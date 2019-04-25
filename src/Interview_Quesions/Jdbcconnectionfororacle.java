package Interview_Quesions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Jdbcconnectionfororacle {
	public WebDriver driver;

	@Test
	public void oracledatabaseconnection()
	{
	try{  
		
		
		//step1 load the driver class for Oracle 
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		
		//step1 load the driver class for MySQL
		//Class.forName("com.mysql.jdbc.Driver"); //For MySQL

		//step2 create  the connection object for Oraclr 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","khaja","khaja");  

		//step2 create  the connection object for Mysql
		//Connection con = DriverManager.getConnection("jdbc:myDriver:myDatabase",username,password);
		
		//step3 create the statement object  
		Statement stmt=con.createStatement(); 
		String sql="select *from emp where salary=(select max(salary) from emp)";

		//step4 execute query  
		ResultSet rs=stmt.executeQuery(sql); 
		
		/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/lib/chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.get("http://www.qavalidation.com/demo");
	     */
		while(rs.next()) { 
			
			int eno=rs.getInt("ENO");
			System.out.print(eno);
			System.out.print(" ");
			
			String name=rs.getString("ename");
			System.out.print(name);
			System.out.print(" ");
			
//			WebElement Name = driver.findElement(By.id("username"));
//		       Name.clear();
//		       Name.sendKeys(name);
		//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)); 
		}

		//step5 close the connection object  
		con.close();  

		}catch(Exception e){ System.out.println(e);}  

		}  
		} 

/*Class.forName("com.mysql.jdbc.Driver"); //For MySQL
Class.forName ("oracle.jdbc.driver.OracleDriver"); //For Oracle
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //For MS SQL Server

Connection con = DriverManager.getConnection("jdbc:myDriver:myDatabase",username,password);
//For MySQL: myDriver = mysql
//For SQL Server: myDriver = sqlserver
//For Oracle: myDriver = oracle
//myDatabase: database path: e.g - //&lt;systemipadd/Servername&gt;/dataBaseName  */