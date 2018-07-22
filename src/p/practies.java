package p;

public class practies 
{
	public static void main(String[] args) 
	{
		/*int i=50/0;
		System.out.println(i);*/
		
		/*String s=null;
		System.out.println(s.length());*/
		 
		/*int a[]=new int[5];
		a[10]=20;*/
		
		try {
		String s="khaja";
		int i=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		
			finally
		
		{
			System.out.println("finally block always executed");
		}
	
		
	}
}
				
	
