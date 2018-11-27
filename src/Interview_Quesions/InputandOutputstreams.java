package Interview_Quesions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class InputandOutputstreams {

	public static void main(String args[]){    
		try{    
			FileInputStream fin1=new FileInputStream("F:\\Workspace_Seetest\\SELENIUM2\\src\\p\\OR1");    
			   FileInputStream fin2=new FileInputStream("F:\\Workspace_Seetest\\SELENIUM2\\src\\p\\OR1");    
			   FileOutputStream fout=new FileOutputStream("F:\\Workspace_Seetest\\SELENIUM2\\src\\p\\OR2");      
			   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
			   int i;    
			   while((i=sis.read())!=-1)    
			   {    
			     fout.write(i);        
			   }    
			   sis.close();    
			   fout.close();      
			   fin1.close();      
			   fin2.close();       
			   System.out.println("Success..");   }catch(Exception e){System.out.println(e);}    
   }    
}  
