package Quarter3.Prog607a;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prog607a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        while (cont) {
            System.out.println("-----Menu-----");
            System.out.println("0) Quit");
            System.out.println("1) Encode Date");
            System.out.println("2) Decode Date");
            System.out.print("Select an option: ");

            int option = input.nextInt();

            if (option == 1) {
                System.out.print("Enter Date (mmddyy): ");
                String date = input.next();
                Encode e = new Encode(date);
                e.calc();
                System.out.println(e.getCode());
            } else if (option == 2) {
                System.out.print("Enter Code: ");
                String code = input.next();
                Decode d  = new Decode(code);
                d.calc();
                System.out.println(d.getDate());
            } else if (option == 0) {
                cont = false;
            } else {
                System.out.println("That is not an option! Please try again.");
            }
            System.out.println();
        }
    }
}
/*
-----Menu-----
0) Quit
1) Encode Date
2) Decode Date
Select an option: 1
Enter Date (mmddyy): 091483
IQTN

-----Menu-----
0) Quit
1) Encode Date
2) Decode Date
Select an option: 1
Enter Date (mmddyy): 011484
AQTM

-----Menu-----
0) Quit
1) Encode Date
2) Decode Date
Select an option: 2
Enter Code: AQQV
1/11/75

-----Menu-----
0) Quit
1) Encode Date
2) Decode Date
Select an option: 2
Enter Code: KORH
11/2/89

-----Menu-----
0) Quit
1) Encode Date
2) Decode Date
Select an option: 0
 */