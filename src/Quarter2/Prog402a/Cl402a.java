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
        myAvg = 0;
        cnt++;
    }

    public void calc() {
        myDiff = myScore - myAvg;
    }

    public void inputAvg(double avg){
        myAvg = avg;
    }

    public String toString() {
        return String.format("%d\t\t%d\t\t%.2f", myID, myScore, myDiff);
    }

    public double getMyAvg() {return myAvg;}

}
