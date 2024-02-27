package Quarter3.Farm;

import java.util.ArrayList;

public class Farm implements IFarm {
    private ArrayList<Horse> myHorses;
    private ArrayList<Cow> myCows;
    private int myNumHayBales;
    private int myNumCorn;
    private double myHayCost;
    private double myCornCost;

    private boolean feedCows() {

    }
    private boolean feedHorses() { return false; }
    public boolean feedAllAnimals() {}
    private double cowIncome(double perPound) { return 0; }
    private double horseIncome() { return 0; }
    public double farmIncome() {
        double fIncome = 0;
        for (Cow cow : myCows) fIncome += cow.value(myCornCost, myHayCost);
        for (Horse horse : myHorses) fIncome += horse.value(myCornCost, myHayCost);
        return fIncome;
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
    public ArrayList<Cow> getCows();
    public ArrayList<Horse>getHorses();

}
