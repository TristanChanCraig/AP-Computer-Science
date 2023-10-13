package Quarter1.Prog93aCl;
import java.util.Scanner;

public class Prog93aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Kilowatt Hours used: ");
        int kwh = input.nextInt();

        Cl93a wow = new Cl93a(kwh);
        wow.calc();
        System.out.print(wow.toString());
    }
}
/*
Enter Kilowatt Hours used: 993
COMPSCI ELECTRIC
Kilowatts Used: 993
Base Rate: $47.17
Surcharge: $4.72
Citytax: $1.42
Pay this amount: $53.31
After July 27 pay: $55.44
 */