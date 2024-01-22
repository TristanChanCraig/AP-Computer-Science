package Quarter3.Prog505a;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505a.dat"));
            List<Cl505a> list = new ArrayList<Cl505a>();

            while (input.hasNext()) {
                String fname = input.next();
                String lname = input.next();
                int books = input.nextInt();
                String name = fname + " " + lname;
                Cl505a wowser = new Cl505a(name, books);
                list.add(wowser);
            }

            for (int lcv = 0; lcv < list.size(); lcv++) {
                Cl505a cur = list.get(lcv);
                cur.calc();
            }

            for (Cl505a x : list)
                System.out.println(x);

            double tot = 0;
            for (Cl505a p : list) tot += p.getPoints();
            double avg = tot / list.size();
            System.out.println("\nAverage points: " + avg);

            int bigPoints = list.get(0).getPoints();
            String bigName = list.get(0).getName();
            for (int lcv = 1; lcv < list.size(); lcv++) {
                Cl505a book = list.get(lcv);
                if (book.getPoints() > bigPoints) {
                    bigPoints = book.getPoints();
                    bigName = book.getName();
                }
            }

            System.out.println("The winner is " + bigName);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Sam Summer	4	45
Linda Lazy	2	20
Paul Prodder	5	60
K.C. Master	8	115
Richie Reader	6	75

Average points: 63.0
The winner is K.C. Master
 */