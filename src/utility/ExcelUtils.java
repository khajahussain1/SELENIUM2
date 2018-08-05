package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


    public class ExcelUtils {
                private static XSSFSheet s;
                private static XSSFWorkbook wb;
                private static org.apache.poi.ss.usermodel.Cell Cell;
                private static XSSFRow Row;
                public static Properties OR;
               
                
                public static void excelfile(String path, String sheetname) throws IOException
                {
                	FileInputStream fi=new FileInputStream(path);
         		   
         		   wb = new XSSFWorkbook(fi);

     			   s = wb.getSheet(sheetname);
                	
                }
                
                public static int gettestcasename(String testcasename)
                {
                	int i;
                	int totalrows=s.getLastRowNum();
                	System.out.println(totalrows);
                	for (i = 0; i < totalrows; i++) 
                	{
                		String cellvalue=s.getRow(i).getCell(0).getStringCellValue();
                		if (cellvalue.equalsIgnoreCase(testcasename)) 
                		{
                			break;
							
						}
					}
					return i;
					
                	
                }
    
    
    public static String[][] setExcelFile(String path, String sheetname, int testcaserownum)
    {
    	
    	String datasets[][]=null;
    	try {
    		
    		FileInputStream fi=new FileInputStream(path);
    		wb=new XSSFWorkbook(fi);
    		s=wb.getSheet(sheetname);
    		
    		int totalrows=1;
    		int totalcolums=s.getRow(testcaserownum).getLastCellNum()-1;
    		System.out.println(totalcolums);
    		
    		datasets=new String[totalrows][totalcolums];
    		int ci=0,cj=0;
    		
    		for (int j = 1; j <= totalcolums; j++, cj++) 
    		{
    			datasets[ci][cj]=s.getRow(testcaserownum).getCell(j).getStringCellValue();
    			System.out.println(datasets[ci][cj]);
			}
    		
    		
    		
    	}catch(FileNotFoundException e)
    	{
    		System.out.println("Could not read the excel sheet");
    		e.printStackTrace();
    		
    	}catch(IOException e)
    	{
    		System.out.println("could not read the excel sheet");
    		e.printStackTrace();
    	
		
    	}
		return datasets;
    	
    	
    }
    
    public static void takeScreenshot(WebDriver driver, String testcasename) throws Exception{
		try{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			System.getProperty("user.dir");
			FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"/src/screenshot/" + testcasename +".jpg"));
			System.getProperty("user.dir");
		} catch (Exception e){
			throw new Exception();
		}
	}
    
    }
    
    
                
          
		/*public static String getCelldata(int RowNum, int ColNum) throws Exception
		{
			try {
				
				Cell= s.getRow(RowNum).getCell(ColNum);
				int dataType= Cell.getCellType();
				
				if(dataType==3)
				{
					return null;
				}else {
					String CellData = Cell.getStringCellValue();

					return CellData;}
					
				}catch (Exception e) {
					System.out.println(e.getMessage());

					throw (e);
				}
			}
		
			
		}*/
    
    
   /* public static int getRowContains(String sTestCasesName, int colNum) throws Exception
	{
		int i;
		try {
			int rowcount=ExcelUtils.getRowUsed();
			for(i=0; i<rowcount; i++)
			{
				if(ExcelUtils.getCellData(i, colNum).equalsIgnoreCase(sTestCasesName))
				{
					break;
				}
			}
			return i;
			
		}catch(Exception e) {throw (e);}

}
	public static int getRowUsed() throws Exception
	{
		try {
			int RowCount=s.getLastRowNum();
			return RowCount;
			
		}catch(Exception e) {throw (e);}
	}    
    	*/
    
    