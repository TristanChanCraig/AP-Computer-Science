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

        double dolOwed = Math.round(change / dol);
    }
}
