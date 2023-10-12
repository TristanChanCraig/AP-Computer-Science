package Quarter1.Prog88aCl;
import java.util.*;

public class Prog88aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 13");
        int num1 = input.nextInt();

        System.out.print("Enter a number between 2 and 20");
        int num2 = input.nextInt();

        Cl88a wow = new Cl88a(num1, num2);
        wow.calc();

        int sum = wow.getMySum();
        int diff = wow.getMyDiff()
    }
}
