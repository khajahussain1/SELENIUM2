package p;

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

		//step4 execute query  
		ResultSet rs=stmt.executeQuery("select *from emp");  
		while(rs.next()) { 
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)); 
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