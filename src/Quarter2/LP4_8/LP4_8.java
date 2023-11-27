package Quarter2.LP4_8;

import java.util.Scanner;

public class LP4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in value a: ");
        final int a = input.nextInt();

        System.out.print("Enter in value c: ");
        final int c = input.nextInt();

        System.out.print("Enter in value m: ");
        final int m = input.nextInt();

        System.out.print("Enter in the seed integer: ");
        int X0 = input.nextInt();

        System.out.printf("Seed = %d, a = %d, c = %d, m = %d\n\n", X0, a, c, m);

        for (int lcv = 0; lcv < 10; lcv++) {
            Cl4_8 bru = new Cl4_8(a, c, m, X0);
            X0 = bru.nextInt();
            System.out.println(bru.toString());
        }


    }
}
