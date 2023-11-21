package Quarter2.LP3_14;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class LP3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in the election results for Aubrey in New York: ");
        int aNYv = input.nextInt();

        System.out.print("Enter in the election results for Martinez in New York: ");
        int mNYv = input.nextInt();

        System.out.print("Enter in the election results for Aubrey in New Jersey: ");
        int aNJv = input.nextInt();

        System.out.print("Enter in the election results for Martinez in New Jersey: ");
        int mNJv = input.nextInt();

        System.out.print("Enter in the election results for Aubrey in Connecticut: ");
        int aCTv = input.nextInt();

        System.out.print("Enter in the election results for Martinez in Connecticut: ");
        int mCTv = input.nextInt();

        Cl3_14 ahh = new Cl3_14(aNYv, mNYv, aNJv, mNJv, aCTv, mCTv);

        ahh.calc();

        System.out.println("Election Results for New York: ");
        System.out.printf("Aubrey: %d\nMartinez:%d\n\n", aNYv, mNYv);

        System.out.println("Election Results for New Jersey: ");
        System.out.printf("Aubrey: %d\nMartinez:%d\n\n", aNJv, mNJv);

        System.out.println("Election Results for Connecticut: ");
        System.out.printf("Aubrey: %d\nMartinez:%d\n\n", aCTv, mCTv);

        System.out.println("Candidate\t\tVotes\tPercentage");
        System.out.printf("Aubrey:\t\t\t%d\t%.2f percent\nMartinez:\t\t\t%d\t%.2f percent\nTotal Votes:\t%d", ahh.getMyAv(), ahh.getMyAp(), ahh.getMyMv(), ahh.getMyMp(), ahh.getMyTv());
    }
}
/*
Enter in the election results for Aubrey in New York: 314159
Enter in the election results for Martinez in New York: 271860
Enter in the election results for Aubrey in New Jersey: 89008
Enter in the election results for Martinez in New Jersey: 121032
Enter in the election results for Aubrey in Connecticut: 213451
Enter in the election results for Martinez in Connecticut: 231034
Election Results for New York:
Aubrey: 314159
Martinez:271860

Election Results for New Jersey:
Aubrey: 89008
Martinez:121032

Election Results for Connecticut:
Aubrey: 213451
Martinez:231034

Candidate		Votes	Percentage
Aubrey:			616618	49.71 percent
Martinez:			623926	50.29 percent
Total Votes:	1240544
 */