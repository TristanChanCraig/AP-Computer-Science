package Quarter2.Prog435a;

public class Cl435a {
    private int myVT;
    private int myGnum;
    private double myFTR;
    private String myCarT;
    private double myToll;
    private double myCost;

    public Cl435a(int VT, int gNum) {
        myVT = VT;
        myGnum = gNum;
        myFTR = 0;
        myCarT = "";
        myToll = 0;
        myCost = 0;
    }

    public void calc() {
        if (myVT == 1) {
            myCarT = "Compact Car";
            myFTR = 1.0;
        } else if (myVT == 2) {
            myCarT = "Small Car";
            myFTR = 1.3;
        } else if (myVT == 3) {
            myCarT = "Mid Size Car";
            myFTR = 1.6;
        } else if (myVT == 4) {
            myCarT = "Full Size Car";
            myFTR = 2.0;
        } else if (myVT == 5) {
            myCarT = "Truck";
            myFTR = 2.4;
        } else {
            myCarT = "16 Wheeler";
            myFTR = 2.7;
        }

        if (myGnum == 1) myToll = 1.35;
        else if (myGnum == 2) myToll = 2.00;
        else if (myGnum == 3) myToll = 2.50;
        else if (myGnum == 4) myToll = 3.25;
        else if (myGnum == 5) myToll = 4.10;
        else if (myGnum == 6) myToll = 4.8;
        else if (myGnum == 7) myToll = 5.50;
        else myToll = 6.00;

        myCost = myToll * myFTR;
    }

    public String toString() {
        return String.format("%s\t\t%.2f\t\t%.2f\t\t$%.2f", myCarT, myToll, myFTR, myCost);
    }
}
