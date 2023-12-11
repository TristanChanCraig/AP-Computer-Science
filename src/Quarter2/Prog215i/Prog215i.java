package Quarter2.Prog215i;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog215i {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215i.dat"));

            ArrayList<Cl215i> hi = new ArrayList<Cl215i>();

            while (input.hasNext()) {
                int vehicle = input.nextInt();
                if (vehicle != 0) {
                    double gallons = input.nextDouble();
                    double miles = input.nextDouble();
                    Cl215i bah = new Cl215i(vehicle, gallons, miles);
                    bah.calc();
                    hi.add(bah);
                }
            }


            System.out.println("Vehicle\t\tMiles\t\tGallons\t\tMPG");

            for (int lcv = 0; lcv < hi.size(); lcv++) {
                System.out.println(hi.get(lcv).toString());
            }
            System.out.println();

            double bestMPG = 0;
            int bestMPGnum = 0;
            double worstMPG = 0;
            int worstMPGnum = 0;
            double fleetAvg = 0;
            int cnt = 0;

            for (int lcv = 0; lcv < hi.size(); lcv++) {
                Cl215i blop = hi.get(lcv);
                if (blop.getMPG() > bestMPG) {
                    bestMPG = blop.getMPG();
                    bestMPGnum = blop.getVehicle();
                }

                if (blop.getMPG() < worstMPG || worstMPGnum == 0) {
                    worstMPG = blop.getMPG();
                    worstMPGnum = blop.getVehicle();
                }

                fleetAvg += blop.getMPG();
                cnt++;
            }
            fleetAvg /= cnt;

            System.out.println("MPG Statistics:");
            System.out.println("Best:\t\t\t\t" + bestMPGnum);
            System.out.println("Worst:\t\t\t\t" + worstMPGnum);
            System.out.printf("Fleet Average:\t\t%.1f\n", fleetAvg);
            System.out.print("Number of Vehicles:\t" + cnt);


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Vehicle		Miles		Gallons		MPG
1005		380.5		15.0		25.4
1007		0.0		0.0		0.0
1003		240.1		12.0		20.0
1006		172.3		9.0		19.1
1008		317.7		14.0		22.7
1001		0.0		0.0		0.0
1010		390.2		17.0		23.0
1015		152.1		4.0		38.0
1017		310.0		12.3		25.2
1020		409.9		17.9		22.9

MPG Statistics:
Best:				1015
Worst:				1007
Fleet Average:		19.6
Number of Vehicles:	10
 */