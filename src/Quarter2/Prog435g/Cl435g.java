package Quarter2.Prog435g;

public class Cl435g {
    private int myScore;
    private int myRank;

    public Cl435g(int score) {
        myScore = score;
        myRank = 0;
    }

    public void setRank(int rank) { myRank = rank; }
    public String toString() { return myScore + "\t\t" + myRank; }
}
