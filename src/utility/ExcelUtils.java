package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;


    public class ExcelUtils {
                private static XSSFSheet ExcelWSheet;
                private static XSSFWorkbook ExcelWBook;
                private static org.apache.poi.ss.usermodel.Cell Cell;
                private static XSSFRow Row;
                public static Properties OR;
               
                
                
           public static Object[][] getTableArray(String Filepath, String SheetName)throws Exception
           {
        	   String[][] tabarray=null; 
        	   try {
        		   FileInputStream fi=new FileInputStream(Filepath);
        		   
        		   ExcelWBook = new XSSFWorkbook(fi);

    			   ExcelWSheet = ExcelWBook.getSheet(SheetName);
    			   
    			   int startrow=1;
    			   int startcol=1;
    			   int ri,cj;
    			   
    			   int totalrows=ExcelWSheet.getLastRowNum();
    			   int totalcol=2;
    			   
    			   tabarray=new String[totalrows][totalcol];
    			   
    			   ri=0;
    			   for(int i=startrow; i<=totalrows; i++, ri++)
    			   {
    				   cj=0;
    				   
    				   for(int j=startcol; j<=totalcol; j++, cj++)
    				   {
    					   tabarray[ri][cj]= getCelldata(i,j);
    					   
    					   System.out.println(tabarray[ri][cj]);
    				   }
    			   }
        	   }catch(FileNotFoundException e) {
        		   System.out.println("Could not read the Excel sheet");

   				e.printStackTrace();
        	   }
        	   catch (IOException e){

   				System.out.println("Could not read the Excel sheet");

   				e.printStackTrace();

   				}

   			return(tabarray);

   			}

		public static String getCelldata(int RowNum, int ColNum) throws Exception
		{
			try {
				
				Cell= ExcelWSheet.getRow(RowNum).getCell(ColNum);
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
			
		}
    
    
            
    	