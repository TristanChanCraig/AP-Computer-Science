package Quarter1;
import java.util.Scanner;

public class LP5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        String num = input.nextLine();

        int digitsSum = 0;

        for (int lcv = 0; lcv < num.length(); lcv++) {
            digitsSum += (int)num.substring(lcv, lcv+1);
        }
        System.out.print(digitsSum);
    }
}
