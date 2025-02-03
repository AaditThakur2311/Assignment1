package Array;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter size of the array");

		int userInput = scanner.nextInt();

		int[] arr1 = new int[userInput];
		System.out.println("Enter the elements you want to add in the array");

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scanner.nextInt();

		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int element : arr1) {
			if (element > largest) {
				secondLargest = largest;
				largest = element;
				
			}

			else if (element > secondLargest && element != largest) {
				secondLargest = element;
			}

		
		}
		
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println(" there is no second largest element in the array ");
		} else {
			System.out.println(" the second largest element in the array is : " +secondLargest);
		}

	}
}
