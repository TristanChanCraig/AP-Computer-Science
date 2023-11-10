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
                avg += score;
                Cl402a bleh = new Cl402a(ID, score);

                manwth[cnt] = bleh;
                cnt++;
            }

            avg /= cnt;

            for (int lcv = 0; lcv < cnt; lcv++) {
                manwth[lcv].inputAvg(avg);
                manwth[lcv].calc();
            }

            System.out.println("ID\t\tScore\tDiff");
            for (int lcv = 0; lcv < cnt; lcv++) System.out.println(manwth[lcv].toString());
            System.out.printf("Average Score = %.2f", avg);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
ID		Score	Diff
115		257		14.38
123		253		10.38
116		246		3.38
113		243		0.38
112		239		-3.62
104		239		-3.62
110		238		-4.62
218		243		0.38
208		242		-0.62
222		223		-19.62
223		230		-12.62
213		229		-13.62
207		228		-14.62
203		224		-18.62
305		265		22.38
306		262		19.38
311		256		13.38
325		246		3.38
321		245		2.38
323		245		2.38
301		242		-0.62
Average Score = 242.62
 */