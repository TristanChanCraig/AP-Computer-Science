package Quarter3.Prog702q;

import Quarter3.Prog702p.Animal;
import Quarter3.Prog702p.Beeper;
import Quarter3.Prog702p.Hicca;
import Quarter3.Prog702p.Wallie;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog702q.txt"));

            List<Vehicle> list = new ArrayList<>();

            int num = input.nextInt();

            while (input.hasNext()) {
                if (num == 1) {
                    String name = input.next();
                    int tire = input.nextInt();
                    int worth = input.nextInt();
                    Vehicle v = new Car(name, tire, worth);
                    list.add(v);
                } else if (num == 2) {
                    String name = input.next();
                    int tire = input.nextInt();
                    int mileage = input.nextInt();
                    Vehicle v = new Truck(name, tire, mileage);
                    list.add(v);
                } else if (num == 3) {
                    String name = input.next();
                    int tire = input.nextInt();
                    String homeTown = input.next();
                    Vehicle v = new Bus(name, tire, homeTown);
                    list.add(v);
                }
                if (input.hasNext()) num = input.nextInt();
            }

            int totCWorth = 0;
            int cCnt = 0;

            double totTworth = 0;
            String tNameLeastVal = "";
            double tLeastVal = 99999999;

            String longestHTName = "";
            int longestHTNameCnt = 0;
            int totBworth = 0;

            int totCtires = 0;
            int totTtires = 0;
            int totBtires = 0;

            double totWorth = 0;

            for (Vehicle v : list) {
                if (v instanceof Car) {
                    totCWorth += ((Car)v).getWorth();
                    cCnt++;
                    totCtires += ((Car)v).getTire();
                } else if (v instanceof Truck) {
                    double tWorth = 50000 - (((Truck)v).getMileage() * 0.25);
                    totCWorth += tWorth;
                    totTtires += ((Truck)v).getTire();
                    if (tWorth < tLeastVal) {
                        tLeastVal = tWorth;
                        tNameLeastVal = ((Truck)v).getName();
                    }
                } else if (v instanceof Bus) {
                    totBtires += ((Bus)v).getTire();
                    if (((Bus)v).getHomeTown().length() > longestHTNameCnt) {
                        longestHTName = ((Bus)v).getHomeTown();
                        longestHTNameCnt = longestHTName.length();
                    }
                    totBworth += 50000;
                }
            }

            totWorth = totCWorth + totTtires + totBworth;

            System.out.println("Total Number of Vehicles: " + list.size());
            System.out.println("Total Amount of the Cars' Worth: $" + totCWorth);
            System.out.println("Total Amount of the Vehicles' Worth: $" + totWorth);
            System.out.println("Longest Home Destination Name: " + longestHTName);
            System.out.println("Truck With The Least Value: " + tNameLeastVal + " ($" + tLeastVal + ")");
            System.out.println("Total Number of Car Tires: " + totCtires);
            System.out.println("Total Number of Truck Tires: " + totTtires);
            System.out.println("Total Number of Bus Tires: " + totBtires);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Total Number of Vehicles: 13
Total Amount of the Cars' Worth: $178199
Total Amount of the Vehicles' Worth: $428294.0
Longest Home Destination Name: Minneapolis
Truck With The Least Value: Fred ($18750.0)
Total Number of Car Tires: 15
Total Number of Truck Tires: 95
Total Number of Bus Tires: 69
 */