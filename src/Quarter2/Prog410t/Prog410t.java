package Quarter2.Prog410t;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner s1 = new Scanner(new File("Langdat/survey.dat"));
            Scanner s2 = new Scanner(new File("Langdat/survey2.dat"));

            System.out.println("ID\tIncome\tMembers)
            while (s1.hasNext()) {
                Cl410t wah = new Cl410t(s1.nextInt(), s1.nextInt(), s1.nextInt());
                wah.calc();
                System.out.println(wah.toString());
            }
            System.out.println("Households wit")

            while (s2.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}