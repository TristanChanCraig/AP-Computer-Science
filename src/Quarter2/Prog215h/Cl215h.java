package Quarter2.Prog215h;

import java.util.ArrayList;

public class Cl215h {

    private ArrayList<Double> myScores;
    private double score;
    private double myAvg = 0;
    private int myCnt = 0;
    private ArrayList<Double> sortedScores;


    public Cl215h(ArrayList<Double> scores) {
        myScores = scores;
        score = 0;
    }

    public void calc() {
        for (int lcv = 0; lcv < myScores.size(); lcv++) {
            for (int lcv2 = 0; lcv2 < myScores.size()-1; lcv2++) {
                if (myScores.get(lcv2) > myScores.get(lcv2+1)) {
                    double temp = myScores.get(lcv2+1);
                    myScores.set(lcv2+1, myScores.get(lcv2));
                    myScores.set(lcv2, temp);
                }
            }
        }

        double idk = 0;

        for (int lcv = 1; lcv < myScores.size() - 1; lcv++) {
            idk += myScores.get(lcv);
        }

        myAvg = idk / 6;
    }

    public void setCnt(int cnt) { myCnt = cnt; }

    public String toString() {
        return String.format("Contestant %d\n%.1f %.1f %.1f %.1f %.1f %.1f %.1f %.1f = %.2f", myCnt, myScores.get(0), myScores.get(1), myScores.get(2), myScores.get(3), myScores.get(4), myScores.get(5), myScores.get(6), myScores.get(7), myAvg);
    }
}
