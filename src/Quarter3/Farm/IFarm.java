package Quarter3.Farm;

import java.util.ArrayList;

public interface IFarm {
    private boolean feedCows() { return false; }
    private boolean feedHorses() { return false; }
    public boolean feedAllAnimals();
    private double cowIncome(double perPound) { return 0; }
    private double horseIncome() { return 0; }
    public double farmIncome();
    public int getWeight();
    public double getCost();
    public ArrayList<Cow> getCows();
    public ArrayList<Horse>getHorses();
}
