package OneTwentyOne;

import java.util.Scanner;

public class CollatzConjecture {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());


        while (number != 1) {
            System.out.print(number + " ");  // Print the current value of 'n'

            // Apply the Collatz sequence rules
            if (number % 2 == 0) {
                number = number / 2;  // If 'n' is even, divide by 2
            } else {
                number = 3 * number + 1;  // If 'n' is odd, multiply by 3 and add 1
            }
        }
            System.out.println(number);
        }
}
