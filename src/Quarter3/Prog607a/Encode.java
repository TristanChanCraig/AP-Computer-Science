package Quarter3.Prog607a;

public class Encode {
    private String myDate;
    private String mAlp;
    private String dAlp;
    private String yAlp;
    private String code;

    public Encode(String date) {
        myDate = date;
        mAlp = " ABCDEFGHIJKL";
        dAlp = " QRSTUVWXYZ";
        yAlp = " ZYXWVUTSRQPONMLKJIHGFEDCBA";
        code = "";
    }

    public void calc() {
        if (myDate.substring(0, 1).equals("0")) {
            code += mAlp.substring(Integer.parseInt(myDate.substring(1, 2)), Integer.parseInt(myDate.substring(1, 2)) + 1);
        } else {
            code += mAlp.substring(Integer.parseInt(myDate.substring(0, 2)), Integer.parseInt(myDate.substring(0, 2)) + 1);
        }

        if (myDate.substring(2, 3).equals("0")) {
            code += "O" + dAlp.substring(Integer.parseInt(myDate.substring(3, 4), Integer.parseInt(myDate.substring(3, 4) + 1)));
        } else {
            code += dAlp.substring(Integer.parseInt(myDate.substring(2, 3)), Integer.parseInt(myDate.substring(2, 3)) + 1) + dAlp.substring(Integer.parseInt(myDate.substring(3, 4)), Integer.parseInt(myDate.substring(3, 4)) + 1);
        }

        code += yAlp.substring((Integer.parseInt(myDate.substring(4, 6)) - 70), Integer.parseInt(myDate.substring(4, 6)) - 70 + 1);
    }

    public String getCode() { return code; }
}
