package OneTwentyOne;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String reversed = new StringBuilder(input).reverse().toString();
        boolean isPalindrome = input.equalsIgnoreCase(reversed);

        if (isPalindrome) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
