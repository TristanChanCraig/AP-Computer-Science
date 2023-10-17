package Quarter1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213e {
    try {
        Scanner input = new Scanner(new File("Langdat/prog213e.dat"));

        int u20 = 0;
        int e20to39 = 0;
        int e40to59 = 0;
        int e60to79 = 0;
        int a79 = 0;

        while (input.hasNext()) {
            int curNum = input.nextInt();
            if (curNum < 20) u20++;
            else if (curNum >= 20 && curNum < 40) e20to39++;
            else if (curNum >= 40 && curNum < 60) e40to59++;
            else if (curNum >= 60 && curNum < 80) e60to79++;
            else if (curNum >= 80) a79;
        }

        int totalNum = lessT + greaterOE;

        System.out.println("The number of numbers less than 500 is: " + lessT);
        System.out.println("The number of numbers greater than or equal to 500 is: " + greaterOE);
        System.out.print("The total number of numbers is: " + totalNum);
    } catch (IOException e) {
        System.out.println("Can't find data file!");
    }
}
