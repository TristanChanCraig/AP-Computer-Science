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

        int dolOwed = (int)change/(int)dol;
        System.out.println("Dollars: " + dolOwed);
        change -= (double)dolOwed;

        int qOwed = (int)change/(int)q;
        System.out.println("Quarters: " + qOwed);
        change -= (double)qOwed;

        int diOwed = (int)change/(int)di;
        System.out.println("Dimes: " + diOwed);
        change -= (double)diOwed;

        int nOwed = (int)change/(int)n;
        System.out.println("Nickels: " + nOwed);
        change -= (double)nOwed;

        int pOwed = (int)change/(int)p;
        System.out.println("Pennies: " + pOwed);
        change -= (double)pOwed;
    }
}
