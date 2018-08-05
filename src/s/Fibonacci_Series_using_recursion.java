package s;

public class Fibonacci_Series_using_recursion 
{
	static int n1=0,n2=1,n3;
	
	public static void series(int count)
	{
		for (int i = 2; i < count; i++) 
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		/*if(count>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			series(count-1);
		}*/
		
	}
	public static void main(String arg[])
	{
		int count=10;
		System.out.print(n1+" "+n2);
		series(count);
	}

}
