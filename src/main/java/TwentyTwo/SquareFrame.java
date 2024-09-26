package TwentyTwo;

import java.util.Scanner;

public class SquareFrame {

        public static void printBorder(int n) {
            System.out.print("+");  // Start with "+"
            for (int i = 0; i < n - 2; i++) {
                System.out.print(" -");  // Print "- " n-2 times
            }
            System.out.println(" +");  // End with "+"
        }

        // Function to print the middle rows of the frame
        public static void printMiddleRows(int n) {
            for (int i = 0; i < n - 2; i++) {
                System.out.print("|");  // Start with "|"
                for (int j = 0; j < n - 2; j++) {
                    System.out.print("  ");  // Print spaces in the middle
                }
                System.out.println(" |");  // End with "|"
            }
        }

        public static void main(String[] args) {
            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for input
            int n = scanner.nextInt();

            // If n is less than 2, we cannot draw a frame
            if (n < 2) {
                System.out.println("n must be at least 2 to draw a frame.");
            } else {
                // Print the top border
                printBorder(n);

                // Print the middle rows if n is greater than 2
                if (n > 2) {
                    printMiddleRows(n);
                }

                // Print the bottom border
                printBorder(n);
            }
    }
}
