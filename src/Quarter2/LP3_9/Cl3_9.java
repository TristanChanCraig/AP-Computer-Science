package Quarter2.LP3_9;

public class Cl3_9 {
    private int myBdayY;
    private int myBdayM;
    private int myBdayD;
    private int myTdayY;
    private int myTdayM;
    private int myTdayD;
    private int myAdays;
    private int mySdays;

    public Cl3_9(int bDayy, int bDaym, int bDayd, int tDayy, int tDaym, int tDayd) {
        myBdayY = bDayy;
        myBdayM = bDaym;
        myBdayD = bDayd;
        myTdayY = tDayy;
        myTdayM = tDaym;
        myTdayD = tDayd;
        myAdays = 0;
        mySdays = 0;
    }

    public void calc() {
        myAdays = ((myTdayY - myBdayY) * 365) + ((myTdayM - myBdayM) * 30) + (myTdayD - myBdayD);
        mySdays = 8 * myAdays;
    }

    public String toString() { return "You have been alive for " + myAdays + " days.\nYou have slept for " + mySdays + " hours."; }
}
