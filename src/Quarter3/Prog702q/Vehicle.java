package Quarter3.Prog702q;

public class Vehicle implements names {
    private String myName;
    private int myTire;
    private double myValue;

    public Vehicle(String name, int tire) {
        myName = name;
        myTire = tire;
        myValue = 0;
    }

    public String getName() { return myName; }
    public int getTire() { return myTire; }
    public double getValue() { return myValue; }
}
