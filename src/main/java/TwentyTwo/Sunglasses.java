package TwentyTwo;

import java.util.Scanner;

public class Sunglasses {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            printSunglasses(n);
        }

        public static void printSunglasses(int n) {
            // Print the top border of the sunglasses
            printBorder(n);
            System.out.println();
            // Print the middle lines of the sunglasses
            for (int i = 0; i < n; i++) {
                printMiddleLine(n);
                System.out.println();
            }
            // Print the bottom border of the sunglasses
            printBorder(n);
            System.out.println();
        }

        public static void printBorder(int n) {
            for (int i = 0; i < 5 * n; i++) {
                System.out.print("*");
            }
        }

        public static void printMiddleLine(int n) {
            System.out.print("*");
            for (int i = 0; i < 2 * n - 2; i++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int i = 0; i < n; i++) {
                System.out.print("|");
            }
            System.out.print("*");
            for (int i = 0; i < 2 * n - 2; i++) {
                System.out.print("/");
            }
            System.out.print("*");
       }

}