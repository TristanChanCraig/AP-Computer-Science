package Quarter3.Prog702q;

public class Truck extends Vehicle {
    private int myMileage;

    public Truck(String name, int tire, int mileage) {
        super(name, tire);
        myMileage = mileage;
    }

    public int getMileage() { return myMileage; }
}
