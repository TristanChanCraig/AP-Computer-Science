package Quarter1;
import java.util.*;

public class LP5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        int ten = 10;

        int curNum = 0;

        while (num != 0) {
           curNum = num % ten;
           num -= curNum;
           System.out.println(curNum);
           ten *= 10;
        }

    }
}
/*
Enter a positive integer: 546
5
4
6
 */