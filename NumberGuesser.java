package homeworkday1;

import java.util.Scanner;
import java.util.Random;

public class NumberGuesser {

	public static void main(String[]args) {
		
	 Scanner scanner = new Scanner(System.in);
	 Random random = new Random();

		       
	 String response = "yes"; 

		        
   while (response.equalsIgnoreCase("yes")) {
		            
    int targetNumber = random.nextInt(100) + 1;
    int guess = 0;
    int numberOfTries = 0;

	System.out.println(" Welcome to the Number Guesser Game ");
    System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
		            
		            
	while (guess != targetNumber) {
	 System.out.print("Enter your guess: ");
	 guess = scanner.nextInt();
     numberOfTries++;

		              
   if (guess < targetNumber) {
   System.out.println(" Sorry, Too Low! Try again.");
   } else if (guess > targetNumber) {
	 System.out.println("Sorry, Too High! Try again.");
	 } else {
    System.out.println(" You've guessed the correct number ");
    System.out.println("It took you " + numberOfTries + " tries.");
		                }
		            }
		 System.out.print("Do you want to play again? (yes/no): ");
		response = scanner.next(); 
		        }
         System.out.println(" Thanks for playing the Number Guesser Game ");
		        
		        scanner.close();
		    }
		

}

