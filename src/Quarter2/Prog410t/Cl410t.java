package Quarter2.Prog410t;

public class Cl410t {
    private int myID;
    private int myAnnIC;
    private int myHHnum;
    private int myHHcnt;
    private int myPhhCnt;
    private double myAvgPhh;
    private int myRhhCnt;
    private double myRhhAvgIC;

    public Cl410t(int id, int annIC, int hhNum) {
        myID = id;
        myAnnIC = annIC;
        myHHnum = hhNum;
        myHHcnt += 1;
        myPhhCnt = 0;
        myAvgPhh = 0;
        myRhhCnt = 0;
        myRhhAvgIC = 0;
    }

    public void calc() {
        if (myAnnIC < 3750.00 + 750.00 * (myHHnum - 2)) myPhhCnt += 1;
        else {
            myRhhCnt++;
            myRhhAvgIC += myAnnIC;
        }
    }

    public double getMyAvgPhh() { return myAvgPhh = 1.0 * myPhhCnt / myHHcnt; }
    public double getMyRhhAvgIC() { return myRhhAvgIC = myRhhAvgIC / myRhhCnt; }
    public String toString() { return myID + "\t" + myAnnIC + "\t" + myHHnum; }
}
