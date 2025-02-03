package homeworkday2;

import java.util.Scanner;

public class SubstringInString {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();
        System.out.println("Enter the substring to search for:");
        String substring = scanner.nextLine();

       
        if (mainString.contains(substring)) {
            System.out.println("The substring '" + substring + "' is present in the main string.");
        } else {
            System.out.println("The substring '" + substring + "' is not present in the main string.");
        }
        
        int position = mainString.indexOf(substring);
        if (position != -1) {
            System.out.println("The substring '" + substring + "' is found at index " + position + ".");
        } else {
            System.out.println("The substring '" + substring + "' is not found in the main string.");
        }
    }

	}



