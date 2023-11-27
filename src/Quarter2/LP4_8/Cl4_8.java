package Quarter2.LP4_8;

public class Cl4_8 {
    private final int myA;
    private final int myC;
    private final int myM;
    private int myXn; // Seed

    public Cl4_8(int a, int c, int m, int X0) {
        myA = a;
        myC = c;
        myM = m;
        myXn = X0;
    }

    public int nextInt() {
        myXn = (myA * myXn + myC) % myM;
        return myXn;
    }

    public String toString() {
        return String.format("(%d * %d + %d) % d = %d",
                            myA, myXn, myC, myM, this.nextInt());
    }
}
