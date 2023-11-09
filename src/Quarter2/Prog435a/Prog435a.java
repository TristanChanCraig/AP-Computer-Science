package Quarter2.Prog435a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog435a.dat"));

            Cl435a[] dude = new Cl435a[100];
            int cnt = 0;

            while (input.hasNext()) {
                int VT = input.nextInt();
                int gNum = input.nextInt();
                Cl435a gal = new Cl435a(VT, gNum);
                dude[cnt] = gal;
                cnt++;
            }

            for (int lcv = 0; lcv < cnt; lcv++) dude[lcv].calc();

            System.out.println("Car Type\t\tBase Toll\tFactor\t\tCost");
            for (int lcv = 0; lcv < cnt; lcv++) System.out.println(dude[lcv].toString());

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Car Type		Base Toll	Factor		Cost
Compact Car		1.35		1.00		$1.35
Small Car		2.50		1.30		$3.25
Mid Size Car		4.10		1.60		$6.56
Full Size Car		5.50		2.00		$11.00
Truck		2.00		2.40		$4.80
16 Wheeler		3.25		2.70		$8.78
Compact Car		4.80		1.00		$4.80
Small Car		6.00		1.30		$7.80
Mid Size Car		1.35		1.60		$2.16
Full Size Car		2.50		2.00		$5.00
Truck		4.10		2.40		$9.84
16 Wheeler		5.50		2.70		$14.85
Compact Car		6.00		1.00		$6.00
Small Car		1.35		1.30		$1.76
Mid Size Car		2.00		1.60		$3.20
Full Size Car		2.50		2.00		$5.00
Truck		3.25		2.40		$7.80
16 Wheeler		4.10		2.70		$11.07
 */