package Quarter3.Prog702p;

public class Wallie extends Animal {
    private int mySteps;

    public Wallie(String name, int steps) {
        super(name);
        mySteps = steps;
    }

    public int getSteps() { return mySteps; }
}
