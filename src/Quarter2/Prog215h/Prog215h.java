package Quarter2.Prog215h;

import Quarter2.Prog214c.Cl214c;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215h.txt"));

            ArrayList<Cl215h> list = new ArrayList<Cl215h>();

            while (input.hasNext()) {
                ArrayList<Double> gah = new ArrayList<Double>();
                gah.add(input.nextDouble());
                gah.add(input.nextDouble());
                gah.add(input.nextDouble());
                gah.add(input.nextDouble());
                gah.add(input.nextDouble());
                gah.add(input.nextDouble());
                gah.add(input.nextDouble());
                gah.add(input.nextDouble());

                Cl215h meep = new Cl215h(gah);
                list.add(meep);
                meep.calc();
            }

            for (int lcv = 0; lcv < list.size(); lcv++) {
                Cl215h eck = list.get(lcv);
                eck.setCnt(lcv+1);
                System.out.println(eck.toString());
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
