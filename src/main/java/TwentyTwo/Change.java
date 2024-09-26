package TwentyTwo;

import java.util.Scanner;

public class Change {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        double sumInCoint = Math.round(sum * 100);
        int countCoints = 0;


        while (sumInCoint >0){
            if (sumInCoint >= 200) {
                countCoints++;
                sumInCoint = sumInCoint - 200;
            } else if (sumInCoint >= 100) {
                countCoints++;
                sumInCoint = sumInCoint - 100;
            } else if (sumInCoint >= 50) {
                countCoints++;
                sumInCoint = sumInCoint - 50;
            } else if (sumInCoint >= 20) {
                countCoints++;
                sumInCoint = sumInCoint - 20;
            } else if (sumInCoint >= 10) {
                countCoints++;
                sumInCoint = sumInCoint - 10;
            } else if (sumInCoint >= 5) {
                countCoints++;
                sumInCoint = sumInCoint - 5;
            } else if (sumInCoint >= 2) {
                countCoints++;
                sumInCoint = sumInCoint - 2;
            } else if (sumInCoint >= 1) {
                countCoints++;
                sumInCoint = sumInCoint - 1;
            } else {
                break;
            }
        }
        System.out.println(countCoints);
    }
}
