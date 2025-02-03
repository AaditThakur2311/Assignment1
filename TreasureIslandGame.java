package session2;

import java.util.Scanner;

public class TreasureIslandGame {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println(" Welcome to Treasure Island! ");
        System.out.println("Your mission is to find the treasure. Choose your path: left or right?");
        String nextUserPath = userInput.nextLine().toLowerCase(); 
       
        if (!nextUserPath.equals("right")) {
            System.out.println("Oops! You fell into a hole. GAME OVER. ");
        } else {
            System.out.println("You have reached a river. Do you want to swim or wait? (swim/wait)");
            nextUserPath = userInput.nextLine().toLowerCase();

            
            if (!nextUserPath.equals("wait")) {
                System.out.println("Oops! You were attacked by a trout. GAME OVER. ");
            } else {
                System.out.println("You have found three doors: Red, Blue, and Yellow.");
                System.out.println("Which door will you enter? (red/blue/yellow)");
                nextUserPath = userInput.nextLine().toLowerCase();

               
                if (nextUserPath.equals("red")) {
                    System.out.println(" You were burned by fire . GAME OVER.");
                } else if (nextUserPath.equals("blue")) {
                    System.out.println(" You were eaten by beasts. GAME OVER.");
                } else if (nextUserPath.equals("yellow")) {
                    System.out.println(" Congratulations! You found the treasure! YOU WIN! ");
                } else {
                    System.out.println(" Invalid choice. GAME OVER.");
                }
            }
        }

        userInput.close(); 
    }
}
