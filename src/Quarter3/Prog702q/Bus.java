package Quarter3.Prog702q;

public class Bus extends Vehicle {
    private String myHomeTown;

    public Bus(String name, int tire, String homeTown) {
        super(name, tire);
        myHomeTown = homeTown;
    }

    public String getHomeTown() { return myHomeTown; }
}
