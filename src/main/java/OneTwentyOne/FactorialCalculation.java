package OneTwentyOne;

import java.util.Scanner;

public class FactorialCalculation {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int sumFact=0;

        while (number>0){
            int lastDigit=number%10;
            int factorial= 1;
            for (int i = 1; i<=lastDigit; i++ ) {
                factorial=factorial*i;
            }

            sumFact+=factorial;

            number=number/10;
        }

        System.out.println(sumFact);
    }
}
