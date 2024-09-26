package OneTwentyOne;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int magicNumber = scanner.nextInt();


        int combinations = 0;
        boolean found = false;


        for (int i = first; i <= second; i++) {
            for (int j = first; j <= second; j++) {
                combinations++;  // Count each combination
                if (i + j == magicNumber) {
                    System.out.printf("Combination %d - (%d + %d = %d)", combinations, first, second, magicNumber);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;  // Stop searching once the combination is found
            }
        }

        // If no combination matches the magic number, print the total number of combinations
        if (!found) {
            System.out.println(combinations + " combinations - neither equals " + magicNumber);
        }
    }
}
