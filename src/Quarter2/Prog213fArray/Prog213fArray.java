package Quarter2.Prog213fArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213fArray {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213f.dat"));

            Cl213f[] list = new Cl213f[1000];
            int cnt = 0;

            while (input.hasNext()) {
                int kwh = input.nextInt();

                if (kwh != -999) {
                    Cl213f yikes = new Cl213f(kwh);
                    list[cnt] = yikes;
                    cnt++;
                }
            }

            for (int lcv = 0; lcv < cnt; lcv++) list[lcv].calc();

            for (int lcv = 0; lcv < cnt; lcv++) System.out.println(list[lcv].toString());

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
The cost of 1338 is $93.66
The cost of 9631 is $521.55
The cost of 13561 is $682.44
 */