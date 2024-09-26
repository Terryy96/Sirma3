package TwentyTwo;

import java.util.Scanner;

public class EqualSumOfOddAndEvenPositions {
        public static boolean isSumEqual(int number) {
            int oddSum = 0;
            int evenSum = 0;
            String numStr = String.valueOf(number);  // Convert the number to a string

            // Loop through each digit position
            for (int i = 0; i < 6; i++) {
                int digit = numStr.charAt(i) - '0';  // Get the current digit

                // Check if the position is odd or even (1-based index)
                if ((i + 1) % 2 == 0) {
                    evenSum += digit;  // Even position
                } else {
                    oddSum += digit;   // Odd position
                }
            }

            // Check if the sums are equal
            return oddSum == evenSum;
        }

        // Function to find and print all numbers between two given six-digit numbers
        public static void findEqualSumNumbers(int lowerBound, int upperBound) {
            boolean found = false;

            // Iterate over the range from lowerBound to upperBound
            for (int i = lowerBound; i <= upperBound; i++) {
                if (isSumEqual(i)) {
                    System.out.println(i);
                    found = true;  // Mark that at least one number was found
                }
            }

            // If no number was found, print "None"
            if (!found) {
                System.out.println("None");
            }
        }

        public static void main(String[] args){
            // Create a scanner to get input
            Scanner scanner = new Scanner(System.in);

            // Get the first and second number
            System.out.print("Enter the first six-digit number (100000 - 300000): ");
            int lowerBound = scanner.nextInt();
            System.out.print("Enter the second six-digit number (greater than the first): ");
            int upperBound = scanner.nextInt();

            // Call the function to find and print the numbers
            findEqualSumNumbers(lowerBound, upperBound);

    }
}
