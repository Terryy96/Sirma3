package OneTwentyOne;

import java.util.Scanner;

public class LettersInAWord {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String text= scanner.nextLine();

        for (int i = 0; i <text.length() ; i++) {
            char letter= text.charAt(i);
            System.out.println(letter);

        }
    }
}
