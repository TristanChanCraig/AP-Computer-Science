package Quarter3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505t.dat"));

            List<Animal> animals = new ArrayList<>();
            int haybales = input.nextInt();
            double hbCost = input.nextDouble();
            int corncobs = input.nextInt();
            double ccCost = input.nextDouble();
            int numCows = input.nextInt();
            double income = 0;

            for (int lcv = 0; lcv < numCows; lcv++) {
                int weight = input.nextInt();
                int dailyM = input.nextInt();
                int hbEaten = input.nextInt();
                int ccEaten = input.nextInt();
                Cow wow = new Cow("Cow " + lcv, weight, dailyM, hbEaten, ccEaten);
                animals.add(wow);
                haybales -= hbEaten;
                corncobs -= ccEaten;
                income += wow.value(ccCost, hbCost);
            }

            int numHorses = input.nextInt();

            for (int lcv = 0; lcv < numHorses; lcv++) {
                int weight = input.nextInt();
                int hbEaten = input.nextInt();
                int ccEaten = input.nextInt();
                int numRides = input.nextInt();
                double cost = input.nextDouble();
                Horse red = new Horse("Horse " + lcv, weight, hbEaten, ccEaten, numRides, cost);
                animals.add(red);
                haybales -= hbEaten;
                corncobs -= ccEaten;
                income += red.value(ccCost, hbCost);
            }



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
