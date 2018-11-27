package Interview_Quesions;

public class Removeduplicateinarray {

	public static void main(String[] args) {

		int a[] = { 1, 1, 1, 3, 7, 7, 8, 9, 9, 9, 10, 26, 26, 37, 37, 45, 45 };
		
		int temp = a[0];
		
		boolean found = false;

		for (int i = 0; i < a.length; i++) {
			
			/*if (temp == a[i]) {								
				
				//found = true;
				
			} else */
				if (temp != a[i]) {
				
				System.out.print(" " + temp);
				
				temp = a[i];
				
				//found = false;
			}
		}
		
		System.out.print(" " + temp);

	}


	}


