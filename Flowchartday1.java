package homeworkday1;

import java.util.Scanner;

public class Flowchartday1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your height in centimeters: ");
		int height = scanner.nextInt(); // user input for height

		scanner.nextLine(); //

		if (height < 120) {
			System.out.println("You are not eligible to ride.");
		} else {
			System.out.println("You are eligible to ride.");
			System.out.println("What is your age? ");
			int age = scanner.nextInt();// user input for age

			scanner.nextLine();

			if (age < 12) {
				System.out.println("The price for the ride is $5.");
				System.out.println("Do you want photos for $3? (yes/no)");
				String decision = scanner.nextLine();

				if (decision.equalsIgnoreCase("yes")) {
					System.out.println("The total bill is $8.");
				} else if (decision.equalsIgnoreCase("no")) {
					System.out.println("The total bill is $5.");
				}

			} else if (age >= 18) {
				System.out.println("The price for the ride is $12.");
				System.out.println("Do you want photos for $3? (yes/no)");
				String decision = scanner.nextLine();// user input for photo decision

				if (decision.equalsIgnoreCase("yes")) {
					System.out.println("The total bill is $15.");
				} else if (decision.equalsIgnoreCase("no")) {
					System.out.println("The total bill is $12.");
				}

			} else if (age >= 12 && age < 18) {
				System.out.println("The price for the ride is $7.");
				System.out.println("Do you want photos for $3? (yes/no)");
				String decision = scanner.nextLine();

				if (decision.equalsIgnoreCase("yes")) {
					System.out.println("The total bill is $10.");
				} else if (decision.equalsIgnoreCase("no")) {
					System.out.println("The total bill is $7.");
				}
			}

			else if (age >= 45 && age <= 55) {
				System.out.println("The price for the ride is $10.");
				System.out.println("Do you want photos for $3? (yes/no)");
				String decision = scanner.nextLine();

				if (decision.equalsIgnoreCase("yes")) {
					System.out.println("The total bill is $13.");
				} else if (decision.equalsIgnoreCase("no")) {
					System.out.println("The total bill is $10.");
				}
			}
		}
		scanner.close();
	}
}
