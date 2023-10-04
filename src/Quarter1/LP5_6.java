package Quarter1;
import java.util.Scanner;

public class LP5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        int digitsSum = 0;

        int ten = 10;

        int curNum = 0;

        while (num != 0) {
            curNum = num % ten;
            num -= curNum;
            if (curNum >= 10) curNum -= (curNum-1);
            digitsSum += curNum;
            ten *= 10;
        }
        System.out.print(digitsSum);
    }
}
