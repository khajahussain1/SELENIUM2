package s;

public class Factorial_using_loop 
{
	public static void main(String args[])
	{
		int i, fact=1, n=5;
		
		for(i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+n+" is "+fact);
	}

}
