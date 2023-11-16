package Quarter2.LP3_10;

public class Cl3_10 {
    private int myBGs;
    private int myFries;
    private int mySodas;
    private double mySubTotal;
    private double myTax;
    private double myTotal;

    public Cl3_10(int BGs, int fries, int sodas) {
        myBGs = BGs;
        myFries = fries;
        mySodas = sodas;
        mySubTotal = 0;
        myTax = 0;
        myTotal = 0;
    }

    public void calc() {
        mySubTotal = (myBGs * 1.69) + (myFries * 1.09) + (mySodas * 0.99);
        myTax = mySubTotal * 0.065;
        myTotal = mySubTotal + myTax;
    }

    public String toString() {
        return String.format("Total before tax $%.2f\nTax: $%.2f\nFinal total: $%.2f", mySubTotal, myTax, myTotal);
    }
}
