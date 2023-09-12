package Quarter1;
import java.util.*;

public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in the first time: ");
        int t1 = input.nextInt();

        System.out.print("Enter in the second time: ");
        int t2 = input.nextInt();

        int time = 0000;
        if (t1 < t2) time = t2-t1;
        else if (t1 > t2) time = 25 - (t1-t2);

        System.out.println(time);

    }
}
