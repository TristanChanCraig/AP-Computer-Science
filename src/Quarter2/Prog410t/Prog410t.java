package Quarter2.Prog410t;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner s1 = new Scanner(new File("Langdat/survey.dat"));
            Scanner s2 = new Scanner(new File("Langdat/survey2.dat"));

            System.out.println("ID\tIncome\tMembers");

            int hhCnt = 0;
            int pHHcnt = 0;
            int rHHcnt = 0;
            int rHHic = 0;
            double avgPhh = 0;
            double rHHavgIC = 0;

            while (s1.hasNext()) {
                Cl410t wah = new Cl410t(s1.nextInt(), s1.nextInt(), s1.nextInt());
                hhCnt++;
                pHHcnt += wah.calcPhh();
                rHHcnt += wah.calcRhh();
                rHHic += wah.calcRhhTic();

                rHHavgIC = wah.getMyRhhAvgIC(rHHic, rHHcnt);
                avgPhh = wah.getMyAvgPhh(pHHcnt, hhCnt);

                System.out.println(wah.toString());

            }

            System.out.printf("Households with income exceeding an average income of %.2f", rHHavgIC);
            System.out.printf("Percent of households below poverty level = $.2f percent", avgPhh);



            while (s2.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}