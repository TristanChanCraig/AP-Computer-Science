package Quarter1;
import java.util.*;

public class Prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the amount saved? ");
        int p = input.nextInt(); // amount originally saved

        System.out.print("What is the interest rate? ");
        double r = input.nextDouble(); // rate of interest in percent

        System.out.print("What is the number of times compounded per year? ");
        int n = input.nextInt(); // number of days compounded per year

        System.out.print("What is the number of days at interest? ");
        double t = input.nextDouble(); // number of days the money is to be kept in the savings account

        double a = p*(Math.pow(1+((.01*r)/n),(n*t)/365)); // amount
        double i = a-p; // interest earned

        System.out.printf("The interest earned is $%.2f\n", i);
        System.out.printf("The total amount in savings is now $%.2f", a);
    }
}
/*
What is the amount saved? 5000
What is the interest rate? 11.5
What is the number of times compounded per year? 365
What is the number of days at interest? 900
The interest earned is $1638.96
The total amount in savings is now $6638.96

What is the amount saved? 10000
What is the interest rate? 16.5
What is the number of times compounded per year? 365
What is the number of days at interest? 90
The interest earned is $415.14
The total amount in savings is now $10415.14

What is the amount saved? 1500
What is the interest rate? 8.5
What is the number of times compounded per year? 365
What is the number of days at interest? 365
The interest earned is $133.06
The total amount in savings is now $1633.06
 */
