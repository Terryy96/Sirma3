package TwentyTwo;

import java.util.Scanner;

public class SquareAsterisks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            // Loop through each column in the row
            for (int j = 0; j < n; j++) {
                // Print an asterisk followed by a space
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

