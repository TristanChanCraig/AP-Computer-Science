package Quarter1;
import java.util.*;

public class LP5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        int firstNum = num / 100;
        num -= firstNum * 100;
        int secondNum = num / 10;
        num -= secondNum * 10;
        int thirdNum = num;

        System.out.printf("%d\n%d\n%d", firstNum, secondNum, thirdNum);
    }
}
/*
Enter a positive integer: 546
5
4
6
 */