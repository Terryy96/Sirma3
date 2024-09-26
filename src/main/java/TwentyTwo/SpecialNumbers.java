package TwentyTwo;

import java.util.Scanner;

public class SpecialNumbers {
        public static boolean isSpecialNumber(int number, int n) {
            String numStr = String.valueOf(number);  // Convert the number to string

            // Loop through each digit of the number
            for (int i = 0; i < numStr.length(); i++) {
                int digit = numStr.charAt(i) - '0';  // Get the current digit

                // If the digit is 0 or n is not divisible by the digit, it's not a special number
                if (digit == 0 || n % digit != 0) {
                    return false;
                }
            }
            return true;
        }

        // Function to generate and print all special numbers
        public static void generateSpecialNumbers(int n) {
            boolean foundSpecial = false;

            // Iterate over all 4-digit numbers from 1111 to 9999
            for (int number = 1111; number <= 9999; number++) {
                if (isSpecialNumber(number, n)) {
                    System.out.println(number);  // Print the special number
                    foundSpecial = true;         // Mark that at least one special number was found
                }
            }

            // If no special number was found, print "None"
            if (!foundSpecial) {
                System.out.println("None");
            }
        }

        public static void main(String[] args){
            // Create a scanner to take user input
            Scanner scanner = new Scanner(System.in);

            // Ask the user to input n
            System.out.print("Enter an integer n: ");
            int n = scanner.nextInt();

            // Call the function to generate and print all special numbers
            generateSpecialNumbers(n);
    }
}
