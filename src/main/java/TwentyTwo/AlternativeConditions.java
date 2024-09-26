package TwentyTwo;

import java.util.Scanner;

public class AlternativeConditions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();

                printPyramid(n);
            }

            public static void printPyramid(int n) {
                int num = 1;
                int rows = (int) Math.ceil(Math.sqrt(n));

                for (int i = 0; i <rows; i++) {
                    // Print leading spaces
                    for (int j = 0; j <= rows - i - 1; j++) {
                        System.out.print("  ");
                    }

                    // Print numbers
                    for (int j = 0; j <= i; j++) {
                        System.out.print(num + " ");
                        num++;
                        if (num > n) {
                            return;
                        }
                    }

                    System.out.println();
        }
    }
}
