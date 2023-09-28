package Quarter1;
import java.util.*;

public class LP4_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 10;
        int min = 1;
        int range = max - min + 1;

        int num1 = (int)(Math.random() * range) + min;
        int num2 = (int)(Math.random() * range) + min;

        String ops = "*+-/";
        max = 3;
        min = 0;
        range = max - min + 1;
        int opNum = (int)(Math.random() * range) + min;
        String op = ops.substring(opNum, opNum+1);

        System.out.printf("What is %d %s %d? ", num1, op, num2);
        int guess = input.nextInt();
        int answer = 0;
        if (op.equals("*")) answer = num1 * num2;
        if (op.equals("+")) answer = num1 + num2;
        if (op.equals("-")) answer = num1 - num2;
        if (op.equals("/")) answer = num1 / num2;

        if (answer == guess) System.out.print("Correct!");
        else System.out.println("Wrong!");
    }
}
/*
What is 10 / 10? 0
Wrong!

What is 8 * 8? 64
Correct!
 */
