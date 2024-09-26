package OneTwentyOne;

import java.util.Scanner;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Calculate the sum of the first 'n' even numbers
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2 * i;
        }
        System.out.println(sum);
    }
}


