package Quarter2.Prog402a;

public class Cl402a {
    private int myID;
    private int myScore;
    private double myDiff;
    private double myAvg;
    private int cnt;

    public Cl402a(int ID, int score) {
        myID = ID;
        myScore = score;
        myDiff = 0;
        myAvg += score;
        cnt++;
    }

    public void calc() {
        myAvg /= cnt;
        myDiff = myScore - myAvg;
    }

    public String toString() {
        return String.format("%d\t\t%d\t\t%.2f", myID, myScore, myDiff);
    }

    public double getMyAvg() {return myAvg;}

}
