package TwentyTwo;

import java.util.Scanner;

public class TreePattern {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            // Print leading spaces to center the asterisks
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print the asterisks (2*i - 1 gives the correct number of stars for each level)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Print the trunk of the tree, which is usually one line
        for (int i = 1; i <= n - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

   }
}
