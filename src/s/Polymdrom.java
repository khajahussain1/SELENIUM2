package s;

import org.testng.annotations.Test;

public class Polymdrom {
	
	@Test
	public void polymdromindigit()
	{
		int r,sum=0,temp;
		int n=454;
		
		temp=n;
		
		while(n>0){
			
			r=n%10;
			
			sum=(sum*10)+r;
			
			n=n/10;
		    }
		if(temp==sum)
		{
			System.out.println("Polymdrom number");
		}else {
			System.out.println("not polymdrom");
		}
		
		
	}
	//@Test
	public void polymdrominstring()
	{
		String s = "malayalam";

		String str = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			
			str = str + s.charAt(i);
		}
		
		if (s.equalsIgnoreCase(str)) {
		
				
			System.out.println(s + " is palindrome");
                 }
			
		else {
			System.out.println(s + " is not a palindrome");
		}
	}
	
	//@Test
	public void reverseString()
	{
		String s="madam";
		String a[]=s.split("");
		
		for (int i = s.length()-1; i >=0; i--) {
			System.out.print(" "+a[i]);
			
		}
	}
	}
	
	
	


