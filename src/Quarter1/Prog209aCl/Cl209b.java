package Quarter1.Prog209aCl;

public class Cl209b {
    private int myLessT;
    private int myGreaterOE;
    private int myNum;
    private int myTotalNum;

    public Cl209b(int num) {
        myNum = num;
        myLessT = 0;
        myGreaterOE = 0;
        myTotalNum = 0;
    }

    public void calc() {
        if (myNum < 500) myLessT++;
        else if (myNum >= 500) myGreaterOE++;
        myTotalNum += myLessT + myGreaterOE;
    }

    public int getLessT() {return myLessT;}
    public int getGreaterOE() {return myGreaterOE;}
    public int getTotalNum() {return myTotalNum;}
}
