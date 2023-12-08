package Quarter2.Prog215i;

public class Cl215i {
    private int myVehicle;
    private double myGallons;
    private double myMiles;
    private double myMPG;

    public Cl215i(int vehicle, double gallons, double miles) {
        myVehicle = vehicle;
        myGallons = gallons;
        myMiles = miles;
        myMPG = 0;
    }

    public void calc() {
        if (myMiles == 0 && myGallons == 0) myMPG = 0;
        else myMPG = myMiles / myGallons;
    }

    public double getMPG() { return myMPG; }
    public int getVehicle() { return myVehicle; }

    public String toString() {
        return String.format("%d\t\t%.1f\t\t%.1f\t\t%.1f", myVehicle, myMiles, myGallons, myMPG);
    }
}
