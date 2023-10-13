package Quarter1.Prog88aCl;

public class Cl88a {
    private int myNum1;
    private int myNum2;
    private int mySum;
    private int myDiff;
    private int myProduct;
    private double myAvg;
    private int myAbsValue;
    private int myMax;
    private int myMin;

    public Cl88a(int num1, int num2) {
        myNum1 = num1;
        myNum2 = num2;
        mySum = 0;
        myDiff = 0;
        myProduct = 0;
        myAvg = 0;
        myAbsValue = 0;
        myMax = 0;
        myMin = 0;
    }

    public void calc() {
        mySum = myNum1 + myNum2;
        myDiff = myNum1 - myNum2;
        myProduct = myNum1 * myNum2;
        myAvg = (myNum1 + myNum2) / 2.0;
        myAbsValue = Math.abs(myDiff);
        if (myNum1 > myNum2) {
            myMax = myNum1;
            myMin = myNum2;
        }
        else {
            myMax = myNum2;
            myMin = myNum1;
        }
    }

    public int getMySum() {return mySum;}
    public int getMyDiff() {return myDiff;}
    public int getMyProduct() {return myProduct;}
    public double getMyAvg() {return myAvg;}
    public int getMyAbsValue() {return myAbsValue;}
    public int getMyMax() {return myMax;}
    public int getMyMin() {return myMin;}
}
