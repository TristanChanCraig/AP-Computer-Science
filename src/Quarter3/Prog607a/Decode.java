package Quarter3.Prog607a;

public class Decode {
    private String myDate;
    private String mAlp;
    private String dAlp;
    private String yAlp;
    private String myCode;

    public Decode(String code) {
        myCode = code;
        mAlp = " ABCDEFGHIJKL";
        dAlp = " QRSTUVWXYZ";
        yAlp = " ZYXWVUTSRQPONMLKJIHGFEDCBA";
        myDate = "";
    }

    public void calc() {
        myDate += mAlp.indexOf(myCode.substring(0, 1)) + "/";

        if (!myCode.substring(1, 2).equals("O")) {
            myDate += dAlp.indexOf(myCode.substring(1, 2));
            myDate += dAlp.indexOf(myCode.substring(2, 3)) + "/";
        } else {
            myDate += dAlp.indexOf(myCode.substring(2, 3)) + "/";
        }

        myDate += Integer.parseInt(String.valueOf(yAlp.indexOf(myCode.substring(3,4)) + 70));
    }

    public String getDate() { return myDate; }
}
