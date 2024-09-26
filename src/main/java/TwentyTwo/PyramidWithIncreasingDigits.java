package TwentyTwo;

import java.util.Scanner;

public class PyramidWithIncreasingDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of rows
        int n = scanner.nextInt();

        // Loop to print each row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for the pyramid shape
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print the increasing part of the row
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }

            // Print the decreasing part of the row
            num -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num);
                num--;
            }

            // Move to the next line
            System.out.println();
        }
    }
}
