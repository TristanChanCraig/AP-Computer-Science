package Quarter3.Prog702q;

public class Car extends Vehicle {
    private int myWorth;

    public Car(String name, int tire, int worth) {
        super(name, tire);
        myWorth = worth;
    }

    public int getWorth() { return myWorth; }
}
