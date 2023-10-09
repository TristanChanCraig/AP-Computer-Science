package Quarter1;
import java.util.Scanner;

public class LP5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        int min = 1;
        int max = 10;
        int roundedDownNum = 0;

        while (true) {
            if (min <= num && num < max) {
                roundedDownNum = min;
                break;
            }
            else {
                min *= 10;
                max *= 10;
            }
        }

        int currNum = 0;
        int digitsSum = 0;

        while (true) {
            currNum = num / roundedDownNum;
            num -= currNum * roundedDownNum;
            digitsSum += currNum;
            roundedDownNum /= 10;
            if (roundedDownNum == 0) break;
        }

        System.out.print("The sum of the digits is: " + digitsSum);

    }
}
/*
Enter a positive integer: 892
The sum of the digits is: 19
 */