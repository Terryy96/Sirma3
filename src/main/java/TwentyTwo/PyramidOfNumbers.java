package TwentyTwo;

import java.util.Scanner;

public class PyramidOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;


        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                if (current > n) {
                    break;
                }
                System.out.print(current + " ");
                current++;
            }
            System.out.println();
        }
    }
}
