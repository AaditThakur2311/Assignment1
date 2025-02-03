package homeworkday1;

import java.util.Random;
import java.util.Scanner;

public class PIG {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int turns = 0, totalScore = 0, turnScore = 0;

        System.out.println("Welcome to the PIG game! Press 'r' to start the game.");
        String decision = scanner.nextLine().trim().toLowerCase();

        // Validate the first input
        while (!decision.equals("r")) {
            System.out.println("Invalid input. Press 'r' to start the game.");
            decision = scanner.nextLine().trim().toLowerCase();
        }

        // Main game loop
        while (totalScore < 20) {
            System.out.print("\nWould you like to roll or hold? (r/h): ");
            decision = scanner.nextLine().trim().toLowerCase();

            if (decision.equals("r")) {
                int numberOnDice = random.nextInt(6) + 1;
                System.out.println("You rolled: " + numberOnDice);

                if (numberOnDice == 1) {
                    System.out.println("Oops! You rolled a 1. Turn over, no score for this turn.");
                    turnScore = 0;
                    turns++;
                } else {
                    turnScore += numberOnDice;
                }

            } else if (decision.equals("h")) {
                totalScore += turnScore;
                turns++;
                System.out.println("\nYou chose to hold.");
                System.out.println("Your score for this turn: " + turnScore);
                System.out.println("Total score so far: " + totalScore);
                turnScore = 0;
            } else {
                System.out.println("Invalid input. Please enter 'r' to roll or 'h' to hold.");
            }

            if (totalScore >= 20) {
                System.out.println("\nCongratulations! You reached a score of " + totalScore + " in " + turns + " turns.");
                System.out.println("GAME OVER ");
                break;
            }
        }
        
        scanner.close();
    }
}

