package p;

import java.util.Arrays;

public class ArraysExamples {

	public static int a[] = { 73, 13, 342, 8, 963, 63, 54 };

	public static void main(String[] args) {

		diapsyDasheshAsSquare();
		System.out.println("==================================");
	sortNumbersInAnArray();
		System.out.println("==================================");
		getSumOfAllNumbers();
		System.out.println("==================================");
		getAverageValueOfAnArrayElelents();
		System.out.println("==================================");
		searchAnElement();
		System.out.println("==================================");
		copyArraytoAnother();
		System.out.println("==================================");
		insetElementInToIndex();
		System.out.println("==================================");
		minAndMaxInAnArray();
		System.out.println("==================================");
		reverseArrayElements();
	}

	public static void diapsyDasheshAsSquare() {
		/*
		 * To print the below format
		 * 
		 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
		 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
		 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
		 */

		int sqare[][] = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf(" - ", sqare[i][j]);
			}
			System.out.println();
		}
	}

	/*
	 * To sort the numeric arrays
	 */
	public static void sortNumbersInAnArray() {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Sorted array values are :	");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	/*
	 * To get the sum of the all elements in an array
	 */

	public static void getSumOfAllNumbers() {

		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}
		System.out
				.println("Sum of all the elements in an array is  : " + total);
	}

	/*
	 * To get average value of the array elements
	 */
	public static void getAverageValueOfAnArrayElelents() {
		int arrayCount = a.length;
		double average = 0.00;
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
			average = total / arrayCount;
		}
		System.out.println("Array values average is :" + average);
	}

	/*
	 * Search a value in an array weather exist or not
	 */
	public static void searchAnElement() {

		int searchElement = 342;
		boolean foundElement = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == searchElement) {
				foundElement = true;
				System.out.println("Element is exist in the array in " + i
						+ " index place");
				break;
			}
		}
		if (!foundElement) {
			System.out.println("Eelment not found in array");
		}

	}

	/*
	 * copy array to another array
	 */
	public static void copyArraytoAnother() {

		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.println("New Array Elements are :");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

	/*
	 * insert an element into specific index
	 */
	public static void insetElementInToIndex() {
		int requiredIndex = 4;
		int insertionValue = 200;
		for (int i = 0; i < a.length; i++) {

			if (i == requiredIndex) {
				a[i] = insertionValue;
			}
		}
		System.out.println("Array elements after inserted ne value");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	/*
	 * to find min and max values of an array elements
	 */

	public static void minAndMaxInAnArray() {

		int minValue = a[0];
		int maxValue = a[0];

		for (int i = 0; i < a.length; i++) {

			if (minValue > a[i]) {
				minValue = a[i];
			}
			if (maxValue < a[i]) {
				maxValue = a[i];
			}
		}
		System.out.println("Max value in the array is :" + maxValue);
		System.out.println("Min value in the array is :" + minValue);

	}

	/*
	 * reverse of the array elements
	 */
	public static void reverseArrayElements() {

		System.out.println("Original array : " + Arrays.toString(a));
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
		System.out.println("Reverse array : " + Arrays.toString(a));
	}
}
