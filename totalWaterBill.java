package session2;

import java.util.Scanner;

public class totalWaterBill {  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = sc.nextInt();

        int meterCharge = 75;  
        int charge = 0;

        if (unitsConsumed <= 100) {
            charge = unitsConsumed * 5;
        } else if (unitsConsumed <= 250) { 
            charge = unitsConsumed * 10;
        } else {
            charge = unitsConsumed * 20;
        }

        int totalBill = charge + meterCharge;  
        System.out.println("The total water bill is: " + totalBill);

        sc.close(); // Close Scanner to prevent resource leaks
    }
}
