package s;

import org.testng.annotations.Test;

public class Armstrong {

	@Test
	public  void fhm() {
		
		int c=0;
		int temp=0;
		int n=152;
		int a=0;
		temp=n;
		while(n>0)
		{
			a=n%10;
			c=c+(a*a*a);
			n=n/10;
		}
		if(temp==c) {
		System.out.println("Armstorng");
		}else {
			System.out.println("not Armstrong");
		}
		

	}

}
