package Quarter1.Prog88aCl;
import java.util.*;

public class Prog88aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 13: ");
        int num1 = input.nextInt();

        System.out.print("Enter a number between 2 and 20: ");
        int num2 = input.nextInt();

        Cl88a wow = new Cl88a(num1, num2);
        wow.calc();

        int sum = wow.getMySum();
        int diff = wow.getMyDiff();
        int product = wow.getMyProduct();
        double avg = wow.getMyAvg();
        int absValue = wow.getMyAbsValue();
        int max = wow.getMyMax();
        int min = wow.getMyMin();

        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + product);
        System.out.println("Average = " + avg);
        System.out.println("Absolute Value = " + absValue);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
/*
Enter a number between 1 and 13: 13
Enter a number between 2 and 20: 20
Original numbers are 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Absolute Value = 7
Maximum = 20
Minimum = 13
 */