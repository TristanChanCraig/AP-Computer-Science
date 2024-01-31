package Quarter3.Prog703s;

public class Windows extends Computer {
    private double myWVNumber;

    public Windows(String name, int num, double val, double wvNumber) {
        super(name, num, val);
        myWVNumber = wvNumber;
    }

    public double getWVNumber() { return myWVNumber; }
}
