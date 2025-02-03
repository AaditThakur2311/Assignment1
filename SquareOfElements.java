package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SquareOfElements {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter size of the array");

		int userInput = scanner.nextInt();

		int[] OrignalArray = new int[userInput];
		int[]SquaredArray=new int[userInput];
		System.out.println("Enter the elements you want to add in the array");
		
		
            
		for ( int i = 0; i < OrignalArray.length; i++) {
			OrignalArray[i] = scanner.nextInt();
			SquaredArray[i]=OrignalArray[i]*OrignalArray[i];
			}
		
		System.out.println("The orignal array is :");
		for (int element : OrignalArray) {
			System.out.print(element + " ");
		}
		
		System.out.println("\nThe squared array is : ");
		for (int element2 : SquaredArray) {
			System.out.print(element2 + " ");
		}
		
		

	}
}
