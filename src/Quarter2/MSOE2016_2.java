package Quarter2;

import java.util.*;

public class MSOE2016_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of side a? ");
        double a = input.nextDouble();

        System.out.print("What is the length of side c? ");
        double c = input.nextDouble();

        System.out.print("What is the degree measure of angle a? ");
        double aA = input.nextInt();

        double aC = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(aA))/a)*c));
        double sV = 0;
        if (aA + aC < 180) sV = 180 - aC;

        System.out.printf("Angle C: %.2f degrees\n", aC);
        if (aA + aC < 180) System.out.printf("Second Value: %.2f", 180 - aC);
    }
}
