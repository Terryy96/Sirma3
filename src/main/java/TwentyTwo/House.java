package TwentyTwo;

import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the height of the house

        int n = scanner.nextInt();

        // Check if 'n' is a valid odd number
        if (n < 3 || n % 2 == 0) {
            System.out.println("Please enter a positive odd integer greater than or equal to 3.");
            return;
        }

        // Print the roof of the house (an isosceles triangle)
        int roofHeight = (n / 2) + 1;
        for (int i = 0; i < roofHeight; i++) {
            // Print leading spaces
            for (int j = 0; j < roofHeight - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars for the roof
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the base of the house (a rectangle)
        int baseHeight = n / 2;
        for (int i = 0; i < baseHeight; i++) {
            // Print the sides of the base
            System.out.print("|");
            for (int j = 0; j < n - 2; j++) {
                System.out.print("*");  // Fill with stars
            }
            System.out.println("|"); // End with the right side of the base
        }
    }
}