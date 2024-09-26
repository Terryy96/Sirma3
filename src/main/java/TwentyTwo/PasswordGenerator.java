package TwentyTwo;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input n (for the range of digits) and l (for the range of letters)
        System.out.print("Enter the value of n (1 to 9): ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of l (1 to 26): ");
        int l = scanner.nextInt();

        // Generate all possible passwords
        for (int d1 = 1; d1 <= n; d1++) { // First digit
            for (int d2 = 1; d2 <= n; d2++) { // Second digit
                for (char ch1 = 'a'; ch1 < 'a' + l; ch1++) { // First letter
                    for (char ch2 = 'a'; ch2 < 'a' + l; ch2++) { // Second letter
                        for (int d3 = 1; d3 <= n; d3++) { // Third digit (greater than d1 and d2)
                            if (d3 > d1 && d3 > d2) {
                                // Print the valid password
                                System.out.println("" + d1 + d2 + ch1 + ch2 + d3);
                            }
                        }
                    }
                }
            }
        }
    }
}
