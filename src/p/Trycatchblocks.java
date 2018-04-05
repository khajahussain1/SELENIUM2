package p;

public class Trycatchblocks {

	public static void main(String args[]){
		try {
	       
	        int a[]=new int[5];
	        a[5]=20/23;
	        //int data=50/0;//may throw exception 
		}catch(ArithmeticException e) {System.out.println(e);}
		catch(ArrayIndexOutOfBoundsException e1) {System.out.println(e1);}
		catch(Exception e) {System.out.println(e);}
		finally{System.out.println("finally block is always executed");}  
		System.out.println("rest of the code...");
	}  

}
