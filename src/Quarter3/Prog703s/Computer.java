package Quarter3.Prog703s;

public class Computer implements comps {
    private String myName;
    private int myNum;
    private double myVal;

    public Computer(String name, int num, double val) {
        myName = name;
        myNum = num;
        myVal = val;
    }

    public String getName() { return myName; }
    public int getNumber() { return myNum; }
    public double getValue() { return myVal; }
}
