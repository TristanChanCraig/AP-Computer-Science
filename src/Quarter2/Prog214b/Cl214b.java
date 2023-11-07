package Quarter2.Prog214b;

public class Cl214b {
    private int myEnum;
    private double myHours;
    private double myRate;
    private double mySF;
    private double myYTDpay;
    private double myGrossPay;
    private double myWHtax;
    private double myFICAtax;
    private double myNetPay;

    public Cl214b(int eNum, double YTDpay, double rate, double SF, double hours) {
        myEnum = eNum;
        myHours = hours;
        myRate = rate;
        mySF = SF;
        myYTDpay = YTDpay;
        myGrossPay = 0;
        myWHtax = 0;
        myFICAtax = 0;
    }

    public void calc() {
        myGrossPay = myHours * myRate * mySF;
        if (myGrossPay < 100) myWHtax = myGrossPay * 0;
        else if (myGrossPay < 150) myWHtax = myGrossPay * 0.08;
        else if (myGrossPay < 200) myWHtax = myGrossPay * 0.12;
        else if (myGrossPay < 300) myWHtax = myGrossPay * 0.15;
        else myWHtax = myGrossPay * 0.175;

        if (myYTDpay > 17300) myFICAtax = 0;
        else if (myYTDpay + myGrossPay <= 17300) myFICAtax = myGrossPay * 0.0605;
        else if (myYTDpay + myGrossPay > 17300) myFICAtax = myGrossPay * 0.0605;
        else if (myYTDpay < 17300 && myYTDpay + myGrossPay > 17300) myFICAtax = (17300 - myYTDpay + myGrossPay) * 0.0605;
        else myFICAtax = 0;
    }
}
