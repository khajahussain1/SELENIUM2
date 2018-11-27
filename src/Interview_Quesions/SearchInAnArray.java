package Interview_Quesions;

public class SearchInAnArray {

	public static void main(String[] args) {

//		int a[] = { 50, 07, 87, 60, 102, 305, 832, 786, 548 };
//
//		// searching an element in an array
//		int searchElement = 100;
//
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] == searchElement) {
//				System.out.println(" Search Eelement found at location : " + i);
//				break;
//			}
//		}

		int[] a = { 1, 1, 3, 7, 7, 8, 9, 9, 9, 10 };
		int temp = a[0];
		boolean found = false;

		for (int i = 0; i < a.length; i++) {
			/*if (temp == a[i] && found) {
				found = true;
			} else 
			*/	if (temp != a[i]) {
				System.out.print(" " + temp);
				temp = a[i];
				found = false;
			}
		}
		System.out.print(" " + temp);

	}

}
