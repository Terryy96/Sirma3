package TwentyTwo;

import java.util.Scanner;

public class HalfRhombusFromAsterisks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            printAsterisks(i);
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            printAsterisks(i);
            System.out.println();
        }
    }

    public static void printAsterisks(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
    }
}
