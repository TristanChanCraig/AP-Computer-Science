package Quarter1.Prog76aCl;

public class Cl76a {
    private int myNum;
    private int mySecNum;
    private int myLastNum;

    public Cl76a(int num) {
        myNum = num;
        mySecNum = 0;
        myLastNum = 0;
    }
    public void calc() {
        mySecNum = myNum * 9;
        myLastNum = mySecNum * 12345679;
    }

    public int getSecNum() {return mySecNum;}
    public int getLastNum() {return myLastNum;}
}
