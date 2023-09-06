package Quarter1;
import java.util.*;
public class Prog54b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three digit number: ");
        int num1 = input.nextInt();

        System.out.println("Enter a three digit number: ");
        int num2 = input.nextInt();

        System.out.println("Enter a three digit number: ");
        int num3 = input.nextInt();

        System.out.println("Enter a three digit number: ");
        int num4 = input.nextInt();

        int sum = num1 + num2 + num3 + num4;
        int avg = sum /= 4;

        System.out.println("The sum of the four numbers is: " + sum);
        System.out.println("The average of the four numbers is: " + avg);

    }
}

/*
Enter a three digit number:
475
Enter a three digit number:
821
Enter a three digit number:
369
Enter a three digit number:
562
The sum of the four numbers is: 556
The average of the four numbers is: 556

 */
