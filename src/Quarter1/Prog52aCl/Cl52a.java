package Quarter1.Prog52aCl;

public class Cl52a { // Rectangle (Helper Class)
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    // Input Section (Constructor)
    public Cl52a(int len, int wid) {
        // Set up private data
        myLen = len;
        myWid = wid;
        myArea = 0;
        myPerim = 0;
    }

    // Calculation Section (Mutators/Setters)
    public void calc() {
        myArea = myLen * myWid;
        myPerim = 2 * myLen + 2 * myWid;
    }

    // Output Section (Accessors/Getters)
    public int getArea() { return myArea; }
    public int getPerim() { return myPerim; }
}
