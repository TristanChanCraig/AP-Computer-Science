package Quarter2.Prog214b;

import Quarter2.Prog435g.Cl435g;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog214b.dat"));;

            Cl214b[] eek = new Cl214b[100];

            while (input.hasNext()) {
                for (int lcv = 0; lcv < 5; lcv++) {
                    eek[lcv] =
                }
            }


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}