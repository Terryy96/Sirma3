package TwentyTwo;

import java.util.Scanner;

public class PyramidNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int currentNumber = 1;

        for (int row = 1; currentNumber <= n; row++) {
            // Loop to print numbers in each row
            for (int j = 1; j <= row; j++) {
                if (currentNumber > n) {
                    break;  // Stop if the current number exceeds n
                }
                System.out.print(currentNumber + " ");
                currentNumber++;  // Increment the number to be printed
            }
            System.out.println();  // Move to the next row
        }
    }
}
