package p;

public class MinandmaxnumberofArray {
	
	static void min(int arr[])
	{
		int min=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(min<arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min);
		
	}

	public static void main(String[] args) {

		int a[]={3,5,67,90,28938474};
		
		min(a);
	}

}
