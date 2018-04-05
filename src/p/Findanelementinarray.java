package p;

public class Findanelementinarray {

	public static void main(String[] args) {

		int a[] = { 50, 07, 87, 60, 102, 305, 832, 786, 548 };

		// searching an element in an array
		int searchElement = 87;

		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == searchElement) {
				
				System.out.println(" Search Eelement found at location : " + i);
				
				break;
				
			}
			
	
	}
	

}
}