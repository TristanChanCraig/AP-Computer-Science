package Quarter2.Prog410t;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static Quarter2.Prog410t.Cl410t.getMyAvgPhh;
import static Quarter2.Prog410t.Cl410t.getMyRhhAvgIC;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner s1 = new Scanner(new File("Langdat/survey.dat"));
            Scanner s2 = new Scanner(new File("Langdat/survey2.dat"));

            Cl410t[] eek = new Cl410t[1000];
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
                eek[hhCnt] = wah;
                hhCnt++;
                pHHcnt += wah.calcPhh();
                rHHcnt += wah.calcRhh();
                rHHic += wah.calcRhhTic();

                rHHavgIC = getMyRhhAvgIC(rHHic, rHHcnt);
                avgPhh = getMyAvgPhh(pHHcnt, hhCnt);
            }

            Cl410t[] ree = new Cl410t[hhCnt];

            for (int lcv = 0; lcv < hhCnt; lcv++) ree[lcv] = eek[lcv];

            for (int lcv = 0; lcv < hhCnt; lcv++) {
                for (int lcv2 = 0; lcv2 < hhCnt - 1; lcv2++) {
                    if (ree[lcv2].getMyID() > ree[lcv2 + 1].getMyID()) {
                        Cl410t temp = ree[lcv2];
                        ree[lcv2] = ree[lcv2 + 1];
                        ree[lcv2 + 1] = temp;
                    }
                }
            }

            for (int lcv = 0; lcv < hhCnt; lcv++) { System.out.println(ree[lcv].toString()); }

            System.out.printf("Households with income exceeding an average income of $%.2f\n", rHHavgIC);
            System.out.printf("Percent of households below poverty level = %.2f percent\n\n", avgPhh);



            int hhCnt2 = 0;
            int pHHcnt2 = 0;
            int rHHic2 = 0;
            int rHHcnt2 = 0;
            double rHHavgIC2 = 0;
            double avgPhh2 = 0;

            Cl410t[] ok = new Cl410t[1000];

            System.out.println("Survey 2");
            System.out.println("ID\t\tIncome\tMembers");

            while (s2.hasNext()) {
                Cl410t wah = new Cl410t(s2.nextInt(), s2.nextInt(), s2.nextInt());
                ok[hhCnt2] = wah;
                hhCnt2++;
                pHHcnt2 += wah.calcPhh();
                rHHcnt2 += wah.calcRhh();
                rHHic2 += wah.calcRhhTic();

                rHHavgIC2 = getMyRhhAvgIC(rHHic2, rHHcnt2);
                avgPhh2 = getMyAvgPhh(pHHcnt2, hhCnt);
            }

            Cl410t[] oof = new Cl410t[hhCnt2];

            for (int lcv = 0; lcv < hhCnt2; lcv++) oof[lcv] = ok[lcv];

            for (int lcv = 0; lcv < hhCnt2; lcv++) {
                for (int lcv2 = 0; lcv2 < hhCnt2 - 1; lcv2++) {
                    if (oof[lcv2].getMyID() > oof[lcv2 + 1].getMyID()) {
                        Cl410t temp = oof[lcv2];
                        oof[lcv2] = oof[lcv2 + 1];
                        oof[lcv2 + 1] = temp;
                    }
                }
            }

            for (int lcv = 0; lcv < hhCnt2; lcv++) { System.out.println(oof[lcv].toString()); }

            System.out.printf("Households with income exceeding an average income of $%.2f\n", rHHavgIC2);
            System.out.printf("Percent of households below poverty level = %.2f percent\n\n\n", avgPhh2);




            int hhCnt3 = hhCnt + hhCnt2;
            int pHHcnt3 = pHHcnt + pHHcnt2;
            int rHHic3 = rHHic + rHHic2;
            int rHHcnt3 = rHHcnt + rHHcnt2;
            double rHHavgIC3 = getMyRhhAvgIC(rHHic3, rHHcnt3);
            double avgPhh3 = getMyAvgPhh(pHHcnt3, hhCnt3);

            Cl410t[] bleh = new Cl410t[hhCnt3];

            for (int lcv = 0; lcv < hhCnt; lcv++) bleh[lcv] = ree[lcv];
            for (int lcv = hhCnt; lcv < hhCnt3; lcv++) bleh[lcv] = oof[lcv-hhCnt];

            System.out.println("Survey 1 & Survey 2");
            System.out.println("ID\t\tIncome\tMembers");

            for (int lcv = 0; lcv < hhCnt3; lcv++) {
                for (int lcv2 = 0; lcv2 < hhCnt3 - 1; lcv2++) {
                    if (bleh[lcv2].getMyID() > bleh[lcv2 + 1].getMyID()) {
                        Cl410t temp = bleh[lcv2];
                        bleh[lcv2] = bleh[lcv2 + 1];
                        bleh[lcv2 + 1] = temp;
                    }
                }
            }

            for (int lcv = 0; lcv < hhCnt3; lcv++) { System.out.println(bleh[lcv].toString()); }

            System.out.printf("Households with income exceeding an average income of $%.2f\n", rHHavgIC3);
            System.out.printf("Percent of households below poverty level = %.2f percent", avgPhh3);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Survey 1
ID		Income	Members
2497	12500	2
3323	13000	5
4521	18210	4
6789	8000	2
5476	6000	1
4423	16400	3
6587	25000	4
3221	10500	4
5555	15000	2
1085	19700	3
3097	20000	8
4480	23400	5
2065	19700	2
8901	13000	3
1085	19700	3
2065	19700	2
2497	12500	2
3097	20000	8
3221	10500	4
3323	13000	5
4423	16400	3
4480	23400	5
4521	18210	4
5476	6000	1
5555	15000	2
6587	25000	4
6789	8000	2
8901	13000	3
Households with income exceeding an average income of $15743.57
Percent of households below poverty level = 0.00 percent

Survey 2
ID		Income	Members
1041	12180	4
1062	13240	3
1327	19800	2
1483	22458	8
1900	17000	2
2112	18125	7
2345	15623	2
3210	3200	6
3600	6500	5
3601	11970	2
4725	8900	3
6217	10000	2
9280	6200	1
1041	12180	4
1062	13240	3
1327	19800	2
1483	22458	8
1900	17000	2
2112	18125	7
2345	15623	2
3210	3200	6
3600	6500	5
3601	11970	2
4725	8900	3
6217	10000	2
9280	6200	1
Households with income exceeding an average income of $13499.67
Percent of households below poverty level = 7.14 percent


Survey 1 & Survey 2
ID		Income	Members
1041	12180	4
1062	13240	3
1085	19700	3
1327	19800	2
1483	22458	8
1900	17000	2
2065	19700	2
2112	18125	7
2345	15623	2
2497	12500	2
3097	20000	8
3210	3200	6
3221	10500	4
3323	13000	5
3600	6500	5
3601	11970	2
4423	16400	3
4480	23400	5
4521	18210	4
4725	8900	3
5476	6000	1
5555	15000	2
6217	10000	2
6587	25000	4
6789	8000	2
8901	13000	3
9280	6200	1
Households with income exceeding an average income of $14707.92
Percent of households below poverty level = 3.70 percent
 */