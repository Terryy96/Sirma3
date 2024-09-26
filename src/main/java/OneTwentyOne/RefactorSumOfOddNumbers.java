package OneTwentyOne;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOddnum=Integer.parseInt(scanner.nextLine());

        int currentNum=1;
        int sum=0;

        for (int i=1; i<=countOddnum; i++ ) {
            System.out.println(currentNum);
            sum+=currentNum;
            currentNum+=2;

        }
        System.out.printf("Sum: %d", sum);
    }
}
