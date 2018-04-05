package s;


public class Swapingtwonumbers {
	static void checkprime(int n)
	{
		int m=0,flag=0;
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println(n+" is not aprime number");
		}else {
			for(int i=2;i<=m; i++)
			{
				if(n%i==0)
				{
					System.out.println(n+"is not a prime number");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(n+" is a prime number");
			}
		}
	}

	 public static void main(String args[]){    
		 /*0 and 1 are not prime numbers. The 2 is the only even prime number because all the other 
		 even numbers can be divided by 2.*/
		 checkprime(5);
		 checkprime(8);
		 checkprime(10);
		 checkprime(17);
		 checkprime(21);
	} 
}
