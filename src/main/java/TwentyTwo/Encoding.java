package TwentyTwo;

import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        String numberStr = Integer.toString(number);

        String reversedNumber = new StringBuilder(numberStr).reverse().toString();
        for (int i = 0; i < reversedNumber.length(); i++) {
            char digitChar = reversedNumber.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            // Check if the digit is 0, then print "ZERO"
            if (digit == 0) {
                System.out.println("ZERO");
            } else {
                // Calculate the ASCII symbol (33 + digit)
                char symbol = (char) (33 + digit);

                // Print the symbol as many times as the value of the digit
                for (int j = 0; j < digit; j++) {
                    System.out.print(symbol);
                }

                // Move to the next line after printing the symbols
                System.out.println();
            }
        }
    }
}
