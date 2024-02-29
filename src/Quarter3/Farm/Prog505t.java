package Quarter3.Farm;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505t.dat"));

            ArrayList<Horse> horses = new ArrayList<>();
            ArrayList<Cow> cows = new ArrayList<>();
            int haybales = input.nextInt();
            double hbCost = input.nextDouble();
            int corncobs = input.nextInt();
            double ccCost = input.nextDouble();
            int numCows = input.nextInt();

            for (int lcv = 0; lcv < numCows; lcv++) {
                int weight = input.nextInt();
                int dailyM = input.nextInt();
                int hbEaten = input.nextInt();
                int ccEaten = input.nextInt();
                Cow wow = new Cow("Cow " + lcv, weight, dailyM, hbEaten, ccEaten);
                cows.add(wow);
            }

            int numHorses = input.nextInt();

            for (int lcv = 0; lcv < numHorses; lcv++) {
                int weight = input.nextInt();
                int hbEaten = input.nextInt();
                int ccEaten = input.nextInt();
                int numRides = input.nextInt();
                double cost = input.nextDouble();
                Horse red = new Horse("Horse " + lcv, weight, hbEaten, ccEaten, numRides, cost);
                horses.add(red);
            }

            Farm f = new Farm(horses, cows, haybales, corncobs, hbCost, ccCost);

            double income = f.farmIncome();
            double fCost = f.getCost();
            int cWeight = f.getWeight();
            boolean enoughF = f.feedAllAnimals();

            for (Cow cow : cows) {
                haybales -= cow.getNumHayBales();
                corncobs -= cow.getNumCorn();
            }
            for (Horse horse : horses) {
                haybales -= horse.getNumHayBales();
                corncobs -= horse.getNumCorn();
            }

            double lowestMilk = Double.MAX_VALUE;
            int nLM = -1;
            double secLowestMilk = Double.MAX_VALUE;
            int nSM = -1;
            double thirdLowestMilk = Double.MAX_VALUE;
            int nTM = -1;
            for (int lcv = 0; lcv < cows.size(); lcv++) {
                Cow cow = cows.get(lcv);
                double milk = cow.getMilk();
                if (milk < lowestMilk) {
                    lowestMilk = milk;
                    nLM = lcv;
                }
                else if (milk < secLowestMilk) {
                    secLowestMilk = milk;
                    nSM = lcv;
                }
                else if (milk < thirdLowestMilk) {
                    thirdLowestMilk = milk;
                    nTM = lcv;
                }
            }
            cows.remove(nLM);
            nSM--;
            nTM--;
            cows.remove(nSM);
            nTM--;
            cows.remove(nTM);

            double lowestRI = Double.MAX_VALUE;
            int nLRI = -1;
            double secLowestRI = Double.MAX_VALUE;
            int nSRI = -1;
            for (int lcv = 0; lcv < horses.size(); lcv++) {
                Horse horse = horses.get(lcv);
                double rI = horse.getRideCost();
                if (lowestRI > rI) {
                    lowestRI = rI;
                    nLRI = lcv;
                }
                else if (secLowestRI > rI) {
                    secLowestMilk = rI;
                    nSRI = lcv;
                }
            }

            horses.remove(nLRI);
            nSRI--;
            horses.remove(nSRI);

            cows.set(0, new Cow("Cow", 1250, 80, 4, 3));

            int totAnimals = horses.size() + cows.size();

            System.out.printf("Income of the day: $%.2f\n", income);
            System.out.println("Feeding costs of the day: $" + fCost);
            System.out.println("Cumulative weight of all animals: " + cWeight);

            if (enoughF) {
                System.out.printf("There are %d bales of hay and %d cobs of corn left in the barn after successfully.\n", haybales, corncobs);
            } else {
                haybales = Math.abs(haybales);
                corncobs = Math.abs(corncobs);
                System.out.printf("There is insufficient food to feed the animals and we are requesting an immediate shipment of %d hay and $d corn.", haybales, corncobs);
            }

            System.out.print("Total number of cows and horses on the farm: " + totAnimals);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Income of the day: $38.05
Feeding costs of the day: $221.35
Cumulative weight of all animals: 42835
There are 920 bales of hay and 2439 cobs of corn left in the barn after successfully.
Total number of cows and horses on the farm: 20
 */