package Quarter1;

import java.util.*;
public class Prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Kilowatt Hours used");
        int kwh = input.nextInt();

        double baseRate = kwh * 0.0475;
        double surcharge = Math.round((baseRate * 0.1) * 100.0) / 100.0;
        double cityTax = Math.round((baseRate * 0.03) * 100.0) / 100.0;
        double totalBill = Math.round((baseRate + surcharge + cityTax) * 100.0) / 100.0;
        double lateTotalBill = Math.round((totalBill * 1.04) * 100.0) / 100.0;


        System.out.println("          COMPSCI ELECTRIC");
        System.out.println("------------------------------------");
        System.out.println("Kilowatts Used                   " + kwh);
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("Base Rate   " + kwh + " @ $0.0475       $ " + String.format("%.2f", baseRate));
        System.out.println("Surcharge                       $ " + String.format("%.2f", surcharge));
        System.out.println("City Tax                        $ " + String.format("%.2f", cityTax));
        System.out.println("                               -----");
        System.out.println("Pay this amount                 $ " + String.format("%.2f", totalBill));
        System.out.println("After December 25th Pay         $ " + String.format("%.2f", lateTotalBill));



    }
}
/*
Enter Kilowatt Hours used
993
          COMPSCI ELECTRIC
------------------------------------
Kilowatts Used                   993
------------------------------------

Base Rate   993 @ $0.0475       $ 47.17
Surcharge                       $ 4.72
City Tax                        $ 1.42
                               -----
Pay this amount                 $ 53.31
After December 25th Pay         $ 55.44
 */