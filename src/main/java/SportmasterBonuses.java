import java.util.Scanner;

public class SportmasterBonuses {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the accumulated amount of purchases: ");
            int accumulatedPurchaseAmount = scan.nextInt();
            System.out.print("Current purchase amount: ");
            int currentPurchaseAmount = scan.nextInt();
            int sumAllPurchase = accumulatedPurchaseAmount + currentPurchaseAmount;
            System.out.println("The sum of all purchases: " + sumAllPurchase);
            int minimalBorderPurchase=1000;
            int firstLevelSumBorder=0;
            int secondLevelSumBorder=15000;
            int thirdLevelSumBorder=150000;
            int firstLevelBonusesAvarded=50;
            int secondLevelBonusesAvarded=70;
            int thirdLevelBonusesAvarded=100;
            if (sumAllPurchase > firstLevelSumBorder && sumAllPurchase < secondLevelSumBorder) {
                int purchaseBonuses = (currentPurchaseAmount / minimalBorderPurchase) * firstLevelBonusesAvarded;
                System.out.println("Purchase Bonuses: " + purchaseBonuses);
            }
            if (sumAllPurchase > secondLevelSumBorder && sumAllPurchase < thirdLevelSumBorder) {
                int purchaseBonuses = (currentPurchaseAmount / minimalBorderPurchase) * secondLevelBonusesAvarded;
                System.out.println("Purchase Bonuses: " + purchaseBonuses);
            }
            if (sumAllPurchase > thirdLevelBonusesAvarded) {
                int purchaseBonuses = (currentPurchaseAmount / minimalBorderPurchase) * thirdLevelBonusesAvarded;
                System.out.println("Purchase Bonuses: " + purchaseBonuses);
            }
            else {
                System.out.println("The amount is not enough to get bonuses!");
            }

    }
}
