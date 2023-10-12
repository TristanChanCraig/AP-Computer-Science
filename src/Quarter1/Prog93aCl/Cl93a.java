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
        myBaseRate = myKwhUsed * 0.0475;
        mySurcharge = Math.round((myBaseRate * 0.1) * 100.0) / 100.0;
        myCityTax = Math.round((myBaseRate * 0.03) * 100.0) / 100.0;
        myPay = Math.round((myBaseRate + mySurcharge + myCityTax) * 100.0) / 100.0;
        myLatePay = Math.round((myPay * 1.04) * 100.0) / 100.0;
    }

    public int getKwhUsed() { return myKwhUsed; }

    public double getPay() { return myPay; }

    public String toString() {
        return String.format("COMPSCI ELECTRIC\nKilowatts Used: %d\nBase Rate: $%.2f\nSurcharge: $%.2f\nCitytax: $%.2f\nPay this amount: $%.2f\nAfter July 27 pay: $%.2f", myKwhUsed, myBaseRate, mySurcharge, myCityTax, myPay, myLatePay);
    }

}
