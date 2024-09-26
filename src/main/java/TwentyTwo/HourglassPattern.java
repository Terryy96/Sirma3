package TwentyTwo;

import java.util.Scanner;

public class HourglassPattern {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the height of the hourglass
        System.out.print("Enter a positive even integer representing the height of the hourglass: ");
        int n = scanner.nextInt();

        // Ensure the input is even
        if (n % 2 != 0 || n <= 0) {
            System.out.println("Please enter a positive even integer.");
            return;
        }

        // Print the top inverted triangle (upper part of the hourglass)
        for (int i = 0; i < n / 2; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print '#' at the start of the row
            System.out.print("#");
            // Print spaces between the '#' symbols
            for (int j = 0; j < (n - 2 - 2 * i); j++) {
                System.out.print(" ");
            }
            // Print '#' at the end of the row if it's not the last row
            if (i < n / 2 - 1) {
                System.out.println(" #");
            } else {
                System.out.println();
            }
        }

        // Print the middle part of the hourglass
        System.out.print(" ");
        for (int j = 0; j < n - 2; j++) {
            System.out.print("#");
        }
        System.out.println();

        // Print the bottom right-side-up triangle (lower part of the hourglass)
        for (int i = n / 2 - 1; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print '#' at the start of the row
            System.out.print("#");
            // Print spaces between the '#' symbols
            for (int j = 0; j < (n - 2 - 2 * i); j++) {
                System.out.print(" ");
            }
            // Print '#' at the end of the row if it's not the last row
            if (i > 0) {
                System.out.println(" #");
            } else {
                System.out.println();
            }
        }
    }
}
