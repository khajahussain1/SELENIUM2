package s;

import org.testng.annotations.Test;

public class A2 {

	@Test
	public void f(){
		
		
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++ )
			{
				if(i==2 && j==2)
				{
					break;
				}
				System.out.println(i+" "+j);
				
			}
			
		}

	}

}
