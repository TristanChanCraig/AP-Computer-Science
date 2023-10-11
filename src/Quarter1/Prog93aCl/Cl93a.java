package Quarter1.Prog93aCl;

public class Cl93a {
    private int myKwhUsed;
    private double myBaseRate;
    private double mySurcharge;
    private double myCityTax;
    private double myPay;
    private double myLatePay;

    public Cl93a(int kwh) {
        myKwhUsed = kwh;
        myBaseRate = 0;
        mySurcharge = 0;
        myCityTax = 0;
        myPay = 0;
        myLatePay = 0;
    }

    public void calc() {

    }

    public double getKwhUsed() { return myKwhUsed; }
    public double getPay() { return myPay; }

    public String toString() {
        return "Kilowatt Hours Used: " + getKwhUsed(); // there is literally nothing else
    }

}
