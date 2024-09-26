package TwentyTwo;

import java.util.Scanner;

public class StaircasePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Print the staircase pattern
        for (int i = 1; i <= n; i++) {
            // Print '#' characters for the current step
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            // Move to the next line after each step
            System.out.println();
        }
    }
}