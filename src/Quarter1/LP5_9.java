package Quarter1;

public class LP5_9 {
    public static void main(String[] args) {
        System.out.println("x^1\t\tx^2\t\tx^3\t\tx^4\t\tx^5");

        int x1 = 1;
        int x2 = 1;
        int x3 = 1;
        int x4 = 1;
        int x5 = 1;

        for (int lcv = 1; lcv <= 6; lcv++) {
            x1 = lcv;
            x2 = (int)Math.pow(x1, 2);
            x3 = (int)Math.pow(x1, 3);
            x4 = (int)Math.pow(x1, 4);
            x5 = (int)Math.pow(x1, 5);
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\n", x1, x2, x3, x4, x5);
        }
    }
}
