package Quarter3.Prog702q;

import Quarter3.Prog702p.Animal;
import Quarter3.Prog702p.Beeper;
import Quarter3.Prog702p.Hicca;
import Quarter3.Prog702p.Wallie;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog702q.dat"));

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
                num = input.nextInt();
            }

            int totWorth = 0;
            int cCnt = 0;
            int vCnt = 0;

            String longestHTName = "";
            int longestHTNameCnt = 0;

            int totCtires = 0;
            int totTtires = 0;
            int totBtires = 0;

            for (Vehicle v : list) {
                if (v instanceof Car) {
                    totWorth += ((Car)v).getWorth();
                    cCnt++;
                    totCtires += ((Car)v).getTire();
                } else if (v instanceof Truck) {

                } else if (v instanceof Bus) {

                }
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
