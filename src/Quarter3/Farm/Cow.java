package Quarter3.Farm;

public class Cow extends Animal {
    private static double MILK_PRICE_LB = 0.20;
    private double myMilk;

    public Cow(String name, int weight, double milk, int corn, int hay) {
        super(name, weight, corn, hay);
        myMilk = milk;
    }

    public double value(double cornCost, double hayCost) {
        return myMilk * MILK_PRICE_LB - getFeedCost(cornCost, hayCost);
    }

    public double getMilk()      { return myMilk; }
    public double getMilkPrice() { return MILK_PRICE_LB; }
}
