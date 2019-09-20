import java.util.Scanner;

public class sportmasterBonuses {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the accumulated amount of purchases: ");
            int accumulatedPurchaseAmount = scan.nextInt();
            System.out.print("Current purchase amount: ");
            int currentPurchaseAmount = scan.nextInt();
            int sumAllPurchase = accumulatedPurchaseAmount + currentPurchaseAmount;
            System.out.println("The sum of all purchases: " + sumAllPurchase);
            if (sumAllPurchase > 0 && sumAllPurchase < 15000) {
                int purchaseBonuses = (currentPurchaseAmount / 1000) * 50;
                System.out.println("Purchase Bonuses: " + purchaseBonuses);
            }
            if (sumAllPurchase > 15000 && sumAllPurchase < 150000) {
                int purchaseBonuses = (currentPurchaseAmount / 1000) * 70;
                System.out.println("Purchase Bonuses: " + purchaseBonuses);
            }
            if (sumAllPurchase > 150000) {
                int purchaseBonuses = (currentPurchaseAmount / 1000) * 100;
                System.out.println("Purchase Bonuses: " + purchaseBonuses);
            } else {
                System.out.println("The amount is not enough to get bonuses!");
            }

    }
}
