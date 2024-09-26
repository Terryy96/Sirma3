package TwentyTwo;

import java.util.Scanner;

public class ArrowPattern {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of rows
        int n = scanner.nextInt();

        // Print the first part of the pattern (pyramid of stars)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for the pyramid shape
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars with spaces in between
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }

        // Print the second part of the pattern (rectangle of stars)
        for (int i = 0; i < n; i++) {
            // Print leading spaces for rectangle alignment
            for (int j = 3; j < n; j++) {
                System.out.print(" ");
            }
            // Print rectangle of stars
            for (int j = 1; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
