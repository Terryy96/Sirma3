package OneTwentyOne;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int originalNumber;
        int remainder;
        int result=0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
