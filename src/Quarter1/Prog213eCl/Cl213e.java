package Quarter1.Prog213eCl;

public class Cl213e {
    private int myU20;
    private int myE20to39;
    private int myNum;
    private int myE40to59;
    private int myE60to79;
    private int myA79;
    private int myTotalNum;

    public Cl213e(int num) {
        myNum = num;
        myU20 = 0;
        myE20to39 = 0;
        myE40to59 = 0;
        myE60to79 = 0;
        myA79 = 0;
        myTotalNum = 0;
    }

    public void calc() {
        if (myNum < 20) myU20++;
        else if (myNum >= 20 && myNum < 40) myE20to39++;
        else if (myNum >= 40 && myNum < 60) myE40to59++;
        else if (myNum >= 60 && myNum < 80) myE60to79++;
        else if (myNum >= 80) myA79++;
        myTotalNum += myNum;
    }

    public int getU20() {return myU20;}
    public int getE20to39() {return myE20to39;}
    public int getE40to59() {return myTotalNum;}
    public int getE60to79() {return myE60to79;}
    public int getA79() {return myA79;}
    public int getTotalNum() {return myTotalNum;}
}
