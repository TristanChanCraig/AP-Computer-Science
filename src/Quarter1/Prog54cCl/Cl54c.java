package Quarter1.Prog54cCl;

public class Cl54c {
    final double pi = 3.14159;
    private double myRadius;
    private double myCircum;
    private double myArea;

    public Cl54c(double radius) {
        myRadius = radius;
        myCircum = 0;
        myArea = 0;
    }

    public void calc() {
        myCircum = 2*pi*myRadius;
        myArea = Math.pow(myRadius, 2) * pi;
    }

    public double getCircum() {return myCircum;}
    public double getArea() {return myArea;}
}
