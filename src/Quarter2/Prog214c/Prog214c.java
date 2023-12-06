package Quarter2.Prog214c;
import Quarter2.Prog602b.InternetCustomer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog214c {
    public static void main(String[] args) {
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



            } catch (IOException e) {
                System.out.println("Can't find data file!");
            }
        }
    }
}
