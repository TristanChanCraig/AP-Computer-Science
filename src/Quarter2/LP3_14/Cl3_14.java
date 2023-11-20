package Quarter2.LP3_14;

public class Cl3_14 {
    private int myAnyV;
    private int myMnyV;
    private int myAnjV;
    private int myMnjV;
    private int myActV;
    private int myMctV;
    private int myAv;
    private int myMv;
    private int myTv;
    private double myAp;
    private double myMp;

    public Cl3_14(int aNYv, int mNYv, int aNJv, int mNJv, int aCTv, int mCTv) {
        myAnyV = aNYv;
        myMnyV = mNYv;
        myAnjV = aNJv;
        myMnjV = mNJv;
        myActV = aCTv;
        myMctV = mCTv;
        myAv = 0;
        myMv = 0;
        myTv = 0;
        myAp = 0;
        myMp = 0;
    }

    public void calc() {
        myAv = myAnyV + myAnjV + myActV;
        myMv = myMnyV + myMnjV + myMctV;
        myTv = myAv + myMv;
        myAp = (double)myAv / myTv * 100;
        myMp = (double)myMv / myTv * 100;
    }

    public int getMyAv() {return myAv;}
    public int getMyMv() {return myMv;}
    public int getMyTv() {return myTv;}
    public double getMyAp() {return myAp;}
    public double getMyMp() {return myMp;}
}
