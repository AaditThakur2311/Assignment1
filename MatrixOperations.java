package Array;

import java.util.Scanner;

public class MatrixOperations {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println(" Enter the number of rows");
		int rows = scanner.nextInt();
		System.out.println(" enter the number of columns");
		int column = scanner.nextInt();

		int[][] array1 = new int[rows][column];
		int[][] array2 = new int[rows][column];

		System.out.println("enter the elements for the matrix1 ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Element at position [" + i + "][" + j + "] ");
				array1[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println(" Enter the elemnts for the matrix2 ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Element at position [" + i + "][" + j + "] ");
				array2[i][j] = scanner.nextInt();
			}
		}
		
		System.out.print(" \nThe matrix 1 :");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println(array1[i][j] + "\t");
			}
			System.out.println();
		}
		
		  System.out.print(" \nThe matrix 2");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println(array2[i][j] +"\t");
			}
			System.out.println();
		}

		System.out.println(" What type of operation do you want to perform on the matrix ");
		System.out.println(" press 1 to perform additon ");
		System.out.println(" press 2 to perform subtraction ");
		System.out.println(" press 3 to perform transpose ");
		System.out.println(" press 4 to perfrom multiplication ");
		int userInput = scanner.nextInt();

		if (userInput == 1) {
			int[][] addition = new int[rows][column];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < column; j++) {
					addition[i][j] = array1[i][j] + array2[i][j];
					System.out.print( addition[i][j] + "\t");
				}
			}
		} else if (userInput == 2) {
			int[][] subtraction = new int[rows][column];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < column; j++) {
					subtraction[i][j] = array1[i][j] - array2[i][j];
					System.out.println( subtraction[i][j] + "\t");
				}
			}

		}

		else if(userInput==3) {
			if(column!=rows) {
				System.out.println(" \nMultiplication is not possible ");
			}else {
			int[][]multiplication=new int[rows][column];
			for(int i=0;i<rows;i++) {
				for(int j=0;j<column;j++) {
					multiplication[i][j]=0;
					for(int k=0;k<column;k++)
						multiplication[i][j]+=array1[i][k] * array2[k][j];
					System.out.print(multiplication[i][j] + "\t" );

				}
			
				
			}
			System.out.println();
			}
			
			
			

			
		}
	}

}
