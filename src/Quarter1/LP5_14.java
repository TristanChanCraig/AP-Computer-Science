package Quarter1;

public class LP5_14 {
    public static void main(String[] args) {
        int min = 1;
        int max = 6;
        int range = max - min + 1;

        System.out.println("Dice 1\tDice 2\tTotal");

        int total = 0;

        for (int lcv = 0; lcv < 5; lcv++) {
            int d1 = (int) (Math.random() * range) + min;
            int d2 = (int) (Math.random() * range) + min;
            total = d1 + d2;
            System.out.printf("\t%d\t\t%d\t\t%d\n", d1, d2, total);
        }
    }
}
/*
Dice 1	Dice 2	Total
	3		1		4
	5		4		9
	4		1		5
	3		3		6
	5		1		6
 */