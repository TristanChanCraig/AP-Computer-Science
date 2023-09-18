package Quarter1;
import java.util.*;

public class Prog65h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in the amount of pounds: ");
        int po = input.nextInt();

        System.out.print("Enter in the amount of schillings: ");
        int s = input.nextInt();

        System.out.print("Enter in the amount of pence: ");
        int pe = input.nextInt();

        double newPe = ((s * 12 + pe) / 2.4) / 100;

        double dP = po + newPe;

        System.out.printf("Decimal Pounds = %.2f", dP);
    }
}
/*
Enter in the amount of pounds: 7
Enter in the amount of schillings: 17
Enter in the amount of pence: 9
Decimal Pounds = 7.89
 */