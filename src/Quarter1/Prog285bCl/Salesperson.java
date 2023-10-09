package Quarter1.Prog285bCl;

public class Salesperson {
    private int myID;
    private int myCode;
    private double mySales;
    private double myComm;

    private void calc() {
        if (myCode == 5 || myCode == 8) {
            if (mySales <= 5000)
                myComm = getSales() * 0.075;
            else
                myComm = 5000 * 0.075 + (mySales - 5000) * 0.085;
        } else if (myCode == 17) {
            if (mySales <= 3500)
                myComm = mySales * 0.075;
            else
                myComm = 3500 * 0.095 + (getSales() - 3500) * 0.12;
        }
    }

    public Salesperson(int id, int code, double sales) {
        myID = id;
        myCode = code;
        mySales = sales;
        myComm = 0;
    }

    public void setComm() {calc();}

    public int getID() {return myID;}
    public int getCode() {return myCode;}
    public double getComm() {return myComm;}
    public double getSales() {return mySales;}

    public String toString() {
        return myID + "\t" + myCode + "\t" + mySales + "\t" + myComm;
    }
}
