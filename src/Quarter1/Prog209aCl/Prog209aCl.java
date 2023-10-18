package Quarter1.Prog209aCl;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Prog209aCl {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215a.dat"));

            int num = 0;
            int less500 = 0;
            int greaterOE500 = 0;
            int totalNum = 0;

            while (input.hasNext()) {
                num = input.nextInt();
                Cl209b wee = new Cl209b(num);
                wee.calc();
                less500 += wee.getLessT();
                greaterOE500 += wee.getGreaterOE();
                totalNum += wee.getTotalNum();
            }

            System.out.println("The number of numbers less than 500 is: " + less500);
            System.out.println("The number of numbers greater than or equal to 500 is: " + greaterOE500);
            System.out.print("The total number of numbers is: " + totalNum);
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
The number of numbers less than 500 is: 192
The number of numbers greater than or equal to 500 is: 208
The total number of numbers is: 400
 */
