package Quarter1.Prog93aCl;
import java.util.Scanner;

public class Prog93aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Kilowatt Hours used");
        int kwh = input.nextInt();

        Cl93a wow = new Cl93a(kwh);
        wow.calc();
        System.out.print(wow.toString());
    }
}
