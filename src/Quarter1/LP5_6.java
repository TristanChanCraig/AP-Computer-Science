package Quarter1;
import java.util.Scanner;

public class LP5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        int firstNum = num / 100;
        num -= firstNum * 100;
        int secondNum = num / 10;
        num -= secondNum * 10;
        int thirdNum = num;

        int digitsSum = firstNum + secondNum + thirdNum;

        System.out.print("The sum of the digits is: " + digitsSum);

    }
}
/*
Enter a positive integer: 892
The sum of the digits is: 19
 */