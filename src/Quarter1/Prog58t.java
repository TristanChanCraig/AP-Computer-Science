package Quarter1;
import java.util.*;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in cost: ");
        double cost = input.nextDouble();

        System.out.print("Enter in amount paid: ");
        double paid = input.nextDouble();

        double change = paid - cost;
        System.out.printf("Change Due: %.2f", change);
        System.out.println();
        System.out.println("------------------------");

        final double dol = 1.00;
        final double q = 0.25;
        final double di = 0.10;
        final double n = 0.05;
        final double p = 0.01;

        double dolOwed = change - (change % dol);
        change -= dolOwed * dol;
        double qOwed = (change - (change % q)) / q;
        change -= qOwed * q;
        double diOwed = (change - (change % di)) / di;
        change -= diOwed * di;
        double nOwed = (change - (change % n)) / n;
        change -= nOwed * n;
        double pOwed = (change - (change % p)) / p;
        change -= pOwed * p;

        System.out.println("Dollars: " + (int)dolOwed);
        System.out.println("Quarters: " + (int)qOwed);
        System.out.println("Dimes: " + (int)diOwed);
        System.out.println("Nickels: " + (int)nOwed);
        System.out.println("Pennies: " + (int)pOwed);
        System.out.println("------------------------");
    }
}
/*
Enter in cost: 125.32
Enter in amount paid: 140.00
Change Due: 14.68
------------------------
Dollars: 14
Quarters: 2
Dimes: 1
Nickels: 1
Pennies: 3
------------------------
 */