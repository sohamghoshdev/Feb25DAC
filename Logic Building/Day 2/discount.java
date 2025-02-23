import java.util.Scanner;

public class discount{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total purchase amount: Rs.");
        double purchaseAmount = scanner.nextDouble();

        System.out.print("Do you have a membership card? (yes/no): ");
        String membership = scanner.next().toLowerCase();

        double discount;

        if (purchaseAmount >= 1000) {
            discount = 20;
        } else if (purchaseAmount >= 500) {
            discount = 10;
        } else {
            discount = 5;
        }

        if (membership.equals("yes")) {
            discount += 5;
        }

        double finalPrice = purchaseAmount - (purchaseAmount * discount / 100);
        System.out.println("Final price after " + discount + "% discount: Rs." + finalPrice);

        scanner.close();
    }
}
