package Quarter1;

public class Prog122c {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int num3 = 4;
        double num4 = 4;
        int lcv = 0;

        while (lcv < 5) {
            System.out.println(num1 + "\t" + num2 + "\t" + num3 + "\t" + (int)num4);
            num1 += 2;
            num2 += 2;
            num3 += 4;
            num4 = Math.pow(Math.sqrt(num4) + 2, 2);
            lcv++;
        }
    }
}
/*
2	3	4	4
4	5	8	16
6	7	12	36
8	9	16	64
10	11	20	100
 */