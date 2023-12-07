package Quarter2.Prog214c;

public class Cl214c {
    private final double regularUnleaded;
    private final double premium;
    private final double highOctane;
    private double myCarWashCost;
    private double myGasCost;
    private double myGallons;
    private String myType;
    private String myNeedCW;
    private double myTotalDue;
    private double myTypeCost;

    public Cl214c(String type, double gallons, String needCW) {
        regularUnleaded = 1.359;
        premium = 1.479;
        highOctane = 1.429;
        myCarWashCost = 0.00;
        myGasCost = 0;
        myGallons = gallons;
        myType = type;
        myNeedCW = needCW;
        myTotalDue = 0;
        myTypeCost = 0;
    }

    public void calc() {
        if (myType.equals("R")) {
            myTypeCost = regularUnleaded;
        }
        else if (myType.equals("P")) {
            myTypeCost = premium;
        }
        else {
            myTypeCost = highOctane;
        }

        myGasCost = myGallons * myTypeCost;

        if (myNeedCW.equals("Y")) {
            myCarWashCost = 2;
            if (myGallons > 10) myCarWashCost = (2.00 - ((int)myGallons - 10) * 0.20);
        }
        if (myCarWashCost < 0) myCarWashCost = 0;
        myTotalDue = myGasCost + myCarWashCost;
    }

    public String getType() {
        if (myType.equals("R")) {
            return "Regular";
        }
        else if (myType.equals("P")) {
            return "Premium";
        }
        else {
            return "High Octane";
        }
    }

    public double getGallons() { return myGallons; }
    public double getTypeCost() { return myTypeCost; }
    public double getGasCost() { return myGasCost; }
    public String getNeedCw() { return myNeedCW; }
    public double getTotalDue() { return myTotalDue; }

    public String toString() {
        return "Bestest Gasoline Seller and Car Washering Company\n" +
                "------------------------------------------------------------\n" +
                String.format("%s\t\t\t%.1f @ %.3f\n", getType(), myGallons, myTypeCost) +
                "------------------------------------------------------------\n" +
                String.format("Gasoline\t\t\t\t%.2f\n", myGasCost) +
                String.format("Wash %s\t\t\t\t\t%.2f\n", myType, myCarWashCost) +
                "\t\t\t\t\t\t-------\n" +
                String.format("Total Due\t\t\t\t%.2f\n", myTotalDue);
    }
}
