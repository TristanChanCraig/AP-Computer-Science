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
        max = 4;
        range = max - min + 1;
        int op = (int)(Math.random() * range) + min;

        System.out.printf("What is %d %s %d?", num1, num2, op);


    }
}
