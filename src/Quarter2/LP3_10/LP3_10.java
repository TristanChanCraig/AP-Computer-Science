package Quarter2.LP3_10;

import java.util.Scanner;

public class LP3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of burgers: ");
        int BGs = input.nextInt();

        System.out.print("Enter the number of fries: ");
        int fries = input.nextInt();

        System.out.print("Enter the number of sodas: ");
        int sodas = input.nextInt();

        Cl3_10 gosh = new Cl3_10(BGs, fries, sodas);
        gosh.calc();

        System.out.print(gosh.toString());
    }
}
/*
Enter the number of burgers: 2
Enter the number of fries: 5
Enter the number of sodas: 5
Total before tax $13.78
Tax: $0.90
Final total: $14.68
 */