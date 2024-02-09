package Quarter3.Prog295c;

public class Employee {
    private String mySS;
    private String myCTD;
    private String myClass;
    private String myType;
    private String myDept;

    public Employee(String ss, String ctd) {
        mySS = ss;
        myCTD = ctd;
        myClass = "";
        myType = "";
        myDept = "";
    }

    public void calc() {
        myClass = myCTD.substring(0,1);
        myType = myCTD.substring(1,2);
        myDept = myCTD.substring(2,3);
    }

    public String getMySS() { return mySS; }
    public String getMyClass() { return myClass; }
    public String getMyType() { return myType; }
    public String getMyDept() { return myDept; }
}
