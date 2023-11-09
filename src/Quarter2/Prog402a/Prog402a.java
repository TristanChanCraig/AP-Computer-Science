package Quarter2.Prog402a;

import Quarter2.Prog214b.Cl214b;
import Quarter2.Prog435g.Cl435g;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prg402a.dat"));

            Cl402a[] manwth = new Cl402a[100];
            int cnt = 0;
            double avg = 0;

            while (input.hasNext()) {
                int ID = input.nextInt();
                int score = input.nextInt();
                Cl402a bleh = new Cl402a(ID, score);
                avg = bleh.getMyAvg();

                manwth[cnt] = bleh;
                cnt++;
            }

            for (int lcv = 0; lcv < cnt; lcv++) manwth[lcv].calc();

            System.out.println("ID\t\tScore\tDiff");
            for (int lcv = 0; lcv < cnt; lcv++) System.out.println(manwth[lcv].toString());
            System.out.printf("Average Score = %.2f", avg);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}