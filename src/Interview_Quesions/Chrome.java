package Interview_Quesions;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome {
	public static WebDriver driver;

	int a[] = { 9, 7, 6, 2, 2, 2, 2, 3, 3, 4, 4, 5, 5 };

	// @Test
	public void removeduplicates() {
		int temp = a[0];
		for (int i = 0; i < a.length; i++) {
			if (temp != a[i]) {
				System.out.print(" " + temp);
				temp = a[i];
			}
		}
		System.out.print(" " + temp);
	}

	// @Test
	public void searchanelement() {
		boolean found = false;
		int searchelement = 93;
		for (int i = 0; i < a.length; i++) {
			if (searchelement == a[i]) {
				found = true;
				System.out.println("search an elemet index is :" + i);
				break;
			}
		}
		if (!found) {
			System.out.println("element is not found");
		}
	}

	// @Test
	public void minandmax() {
		int min = a[0];
		int max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (min > a[i]) {
				min = a[i];

			}
			if (max < a[i]) {
				max = a[i];
			}

		}
		System.out.println("Maximun value is: " + max);
		System.out.println("Minimum value is :" + min);
	}

	//@Test
	public void sorting() {
		int temp = a[0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {

					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}

	}
	//@Test
	public void sortingwitharray()
	{
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	//@Test
	public void primenumbers()
	{
		int n=190;
		int flag=0;
		if (n==0 || n==1) {
			System.out.println(n+" Is not a prime number");
		}else {
			for (int i = 2; i < n/2; i++) {
				if (n%2==0) {
					System.out.println(n+" Is not a prime number");
					flag=1;
					break;
				}
				
			}
		}
		if (flag==0) {
			System.out.println(n+" is a prime number");
		}
	}
	//@Test
	public void fib()
	{
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for (int i = 2; i < 10; i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	@Test 
	public void polymdromnumber()
	{
		int n=453;
		int temp=0,sum=0,r;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(sum+" Numbewr is polymdrom number");
		}else {
			System.out.println(sum+ " number is not a polymdrom number");
		}
		
		
	}
}
