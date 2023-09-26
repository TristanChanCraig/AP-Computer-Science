package Quarter1;
import java.util.*;

public class LP4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter package weight in kilograms: ");
        int k = input.nextInt();

        System.out.print("Enter package length in centimeter: ");
        int l = input.nextInt();

        System.out.print("Enter package width in centimeter: ");
        int w = input.nextInt();

        System.out.print("Enter package height in centimeter: ");
        int h = input.nextInt();

        int cC = l*w*h;

        if (cC >= 100000 && k >= 27) System.out.println("Too heavy and too large.");
        else if (k >= 27) System.out.println("Too heavy.");
        else if (cC >= 100000) System.out.println("Too large.");
    }
}
/*
Enter package weight in kilograms: 32
Enter package length in centimeter: 10
Enter package width in centimeter: 25
Enter package height in centimeter: 38
Too heavy.
 */