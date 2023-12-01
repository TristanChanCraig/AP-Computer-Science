package Quarter2.Prog410t;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner s1 = new Scanner(new File("Langdat/survey.dat"));
            Scanner s2 = new Scanner(new File("Langdat/survey2.dat"));

            int hhCnt = 0;
            int pHHcnt = 0;
            int rHHcnt = 0;
            int rHHic = 0;
            double avgPhh = 0;
            double rHHavgIC = 0;

            System.out.println("Survey 1");
            System.out.println("ID\t\tIncome\tMembers");

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

            System.out.printf("Households with income exceeding an average income of $%.2f\n", rHHavgIC);
            System.out.printf("Percent of households below poverty level = %.2f percent\n\n", avgPhh);



            hhCnt = 0;
            pHHcnt = 0;
            rHHic = 0;
            avgPhh = 0;
            rHHavgIC = 0;

            System.out.println("Survey 2");
            System.out.println("ID\t\tIncome\tMembers");

            while (s2.hasNext()) {
                Cl410t wah = new Cl410t(s2.nextInt(), s2.nextInt(), s2.nextInt());
                hhCnt++;
                pHHcnt += wah.calcPhh();
                rHHcnt += wah.calcRhh();
                rHHic += wah.calcRhhTic();

                rHHavgIC = wah.getMyRhhAvgIC(rHHic, rHHcnt);
                avgPhh = wah.getMyAvgPhh(pHHcnt, hhCnt);

                System.out.println(wah.toString());
            }

            System.out.printf("Households with income exceeding an average income of $%.2f\n", rHHavgIC);
            System.out.printf("Percent of households below poverty level = %.2f percent\n\n\n", avgPhh);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}