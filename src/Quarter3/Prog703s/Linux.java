package Quarter3.Prog703s;

public class Linux extends Computer {
    private int myCode;

    public Linux(String name, int num, double val, int code) {
        super(name, num, val);
        myCode = code;
    }

    public int getCode() { return myCode; }
}
