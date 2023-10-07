package Quarter1.Prog82aCl;

public class Cl82a {
    private int mySL;
    private int myVS;
    private int myFine;

    public Cl82a(int sL, int vS) {
        mySL = sL;
        myVS = vS;
        myFine = 0;
    }
    public void calc() {myFine = 20 + ((myVS - mySL) * 5);}
    public int getFine() {return myFine;}
}
/*
Enter the speed limit: 30
Enter the vehicle speed: 42
Fine------------------$80.00

Enter the speed limit: 55
Enter the vehicle speed: 70
Fine------------------$95.00
 */