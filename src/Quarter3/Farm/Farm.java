package Quarter3.Farm;

import java.util.ArrayList;

public class Farm implements IFarm {
    private ArrayList<Horse> myHorses;
    private ArrayList<Cow> myCows;
    private int myNumHayBales;
    private int myNumCorn;
    private double myHayCost;
    private double myCornCost;

    public Farm(ArrayList<Horse> horses, ArrayList<Cow> cows, int numHayBales, int numCorn, double hayCost, double cornCost) {
        myHorses = horses;
        myCows = cows;
        myNumHayBales = numHayBales;
        myNumCorn = numCorn;
        myHayCost = hayCost;
        myCornCost = cornCost;
    }

    private boolean feedCows() {
        double cHayBales = 0;
        double cCorn = 0;
        for (Cow cow : myCows) {
            cHayBales += cow.getNumHayBales();
            cCorn += cow.getNumCorn();
        }
        return (myNumHayBales > cHayBales && myNumCorn > cCorn);
    }
    private boolean feedHorses() {
        double hHayBales = 0;
        double hCorn = 0;
        for (Horse horse : myHorses) {
            hHayBales += horse.getNumHayBales();
            hCorn += horse.getNumCorn();
        }
        return (myNumHayBales > hHayBales && myNumCorn > hCorn);
    }
    public boolean feedAllAnimals() { return (feedCows() && feedHorses()); }
    private double cowIncome(double perPound) {
        double cIncome = 0;
        for (Cow cow : myCows) cIncome += cow.value(myCornCost, myHayCost);
        return cIncome;
    }
    private double horseIncome() {
        double hIncome = 0;
        for (Horse horse : myHorses) hIncome += horse.value(myCornCost, myHayCost);
        return hIncome;
    }
    public double farmIncome() {
        return cowIncome(0.20) + horseIncome();
//        double fIncome = 0;
//        for (Cow cow : myCows) fIncome += cow.value(myCornCost, myHayCost);
//        for (Horse horse : myHorses) fIncome += horse.value(myCornCost, myHayCost);
//        return fIncome;
    }
    public int getWeight() {
        int weight = 0;
        for (Cow cow : myCows) weight += cow.getWeight();
        for (Horse horse : myHorses) weight += horse.getWeight();
        return weight;
    }
    public double getCost() {
        double totFeedCost = 0;
        for (Cow cow : myCows) totFeedCost += cow.getFeedCost(myCornCost, myHayCost);
        for (Horse horse : myHorses) totFeedCost += horse.getFeedCost(myCornCost, myHayCost);
        return totFeedCost;
    }
    public ArrayList<Cow> getCows() { return myCows; }
    public ArrayList<Horse> getHorses() { return myHorses; }

}
