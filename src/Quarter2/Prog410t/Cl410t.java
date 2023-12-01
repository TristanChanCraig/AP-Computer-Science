package Quarter2.Prog410t;

public class Cl410t {
    private int myID;
    private int myAnnIC;
    private int myHHnum;

    public Cl410t(int id, int annIC, int hhNum) {
        myID = id;
        myAnnIC = annIC;
        myHHnum = hhNum;
    }

    public int calcPhh() { if (myAnnIC < 3750.00 + 750.00 * (myHHnum - 2)) return 1; else return 0; }

    public int calcRhh() { if (myAnnIC >= 3750.00 + 750.00 * (myHHnum - 2)) return 1; else return 0;}

    public int calcRhhTic() { if (myAnnIC >= 3750.00 + 750.00 * (myHHnum - 2) ) return myAnnIC; else return 0; }

    public double getMyAvgPhh(int pHHcnt, int hhCnt) { return 1.0 * pHHcnt / hhCnt; }
    public double getMyRhhAvgIC(int rHHic, int rHHcnt) { return 1.0 * rHHic / rHHcnt; }

    public String toString() { return myID + "\t" + myAnnIC + "\t" + myHHnum; }
}
