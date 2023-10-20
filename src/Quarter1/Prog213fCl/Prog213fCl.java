package Quarter1.Prog213fCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213fCl {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213f.dat"));

            int kwh = input.nextInt();

            while (input.hasNext() && kwh != -999) {
                Cl213f hi = new Cl213f(kwh);
                hi.calc();
                System.out.printf("The cost of %d is $%.2f\n", kwh, hi.getCost());
                kwh = input.nextInt();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
