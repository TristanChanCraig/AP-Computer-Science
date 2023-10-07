package Quarter1.Prog54cCl;

public class Cl54c {
    final double pi = 3.14159;
    double myRadius;
    double myCircum;
    double myArea;

    public Cl54c(double radius) {
        myRadius = radius;
    }

    public void calc() {
        myCircum = 2*pi*myRadius;
        myArea = Math.pow(myRadius, 2) * pi;
    }

    public double getCircum() {return myCircum;}
    public double getArea() {return myArea;}
}
