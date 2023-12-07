package Quarter2.Prog214c;
import Quarter2.Prog602b.InternetCustomer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog214c {
        public static void main(String[] args) {
            try {
                Scanner input = new Scanner(new File("Langdat/prog214c.dat"));

                ArrayList<Cl214c> list = new ArrayList<Cl214c>();

                while (input.hasNext()) {
                    String type = input.next();
                    double gallons = input.nextDouble();
                    String needCW = input.next();

                    Cl214c poopyhead = new Cl214c(type, gallons, needCW);
                    list.add(poopyhead);
                }

                for (int lcv = 0; lcv < list.size(); lcv++) {
                    Cl214c me = list.get(lcv);
                    me.calc();
                }

                for (int lcv = 0; lcv < list.size(); lcv++) {
                    Cl214c me = list.get(lcv);
                    System.out.println(me.toString());
                }

            } catch (IOException e) {
                System.out.println("Can't find data file!");
            }
        }
}
/*
Bestest Gasoline Seller and Car Washering Company
------------------------------------------------------------
Premium			15.0 @ 1.479
------------------------------------------------------------
Gasoline				22.19
Wash P					0.00
						-------
Total Due				22.19

Bestest Gasoline Seller and Car Washering Company
------------------------------------------------------------
Regular			21.4 @ 1.359
------------------------------------------------------------
Gasoline				29.08
Wash R					0.00
						-------
Total Due				29.08

Bestest Gasoline Seller and Car Washering Company
------------------------------------------------------------
High Octane			7.5 @ 1.429
------------------------------------------------------------
Gasoline				10.72
Wash H					2.00
						-------
Total Due				12.72

Bestest Gasoline Seller and Car Washering Company
------------------------------------------------------------
Regular			17.9 @ 1.359
------------------------------------------------------------
Gasoline				24.33
Wash R					0.60
						-------
Total Due				24.93
 */