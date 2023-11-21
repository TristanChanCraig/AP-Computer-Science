package Quarter2.LP_9;

import java.util.Scanner;

public class LP3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birthdate: ");

        System.out.print("Year: ");
        int bDayy = input.nextInt();

        System.out.print("Month: ");
        int bDaym = input.nextInt();

        System.out.print("Day: ");
        int bDayD = input.nextInt();


        System.out.println("Enter today's date: ");

        System.out.print("Year: ");
        int tDayy = input.nextInt();

        System.out.print("Month: ");
        int tDaym = input.nextInt();

        System.out.print("Day: ");
        int tDayD = input.nextInt();


        Cl3_9 help = new Cl3_9(bDayy, bDaym, bDayD, tDayy, tDaym, tDayD);
        help.calc();
        System.out.print(help.toString());
    }
}
/*
Enter your birthdate:
Year: 1997
Month: 2
Day: 12
Enter today's date:
Year: 2012
Month: 08
Day: 03
You have been alive for 5646 days.
You have slept for 45168 hours.
 */