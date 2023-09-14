package Quarter1;
import java.util.*;

public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in the first time in military format: ");
        int t1 = input.nextInt();

        System.out.print("Enter in the second time in military format: ");
        int t2 = input.nextInt();

        int time = Math.abs(t1 - t2);

        if (t1 > t2) {
            time = 2400 - t1 + t2;
        }

        int m = 0;
        int h = 0;

        while (time > 59) {
            time -= 100;
            h += 1;
        }
        while (time > 0) {
            time -= 1;
            m += 1;
        }

        System.out.println("The difference between the two times is "  + h + " hours and " + m + " minutes.");


    }
}
