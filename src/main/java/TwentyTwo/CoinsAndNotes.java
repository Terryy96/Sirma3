package TwentyTwo;

import java.util.Scanner;

public class CoinsAndNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oneLvCoins = scanner.nextInt();
        int twoLvCoins = scanner.nextInt();
        int fiveLvBanknotes = scanner.nextInt();


        int targetSum = scanner.nextInt();

        // Loop through each possible combination of 1lv, 2lv, and 5lv to find valid ones
        for (int oneCount = 0; oneCount <= oneLvCoins; oneCount++) {
            for (int twoCount = 0; twoCount <= twoLvCoins; twoCount++) {
                for (int fiveCount = 0; fiveCount <= fiveLvBanknotes; fiveCount++) {
                    int total = oneCount * 1 + twoCount * 2 + fiveCount * 5;

                    if (total == targetSum) {
                        System.out.println(oneCount + " * 1 lv. + " + twoCount + " * 2 lv. + " + fiveCount + " * 5 lv. = " + targetSum + " lv.");
                    }
                }
            }
        }
    }
}
