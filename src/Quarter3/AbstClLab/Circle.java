package Quarter3.AbstClLab;

public class Circle implements Shape {
    private double radius;

    public Circle(double rad) {
        radius = rad;
    }

    public void setRadius(double rad) { radius = rad; }
    public double getRadius() { return radius; }

    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area: " + area);
    }

    public void calculateCircumference() {
        double circ = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circ);
    }

    public void printClass() {
        System.out.println(this.getClass().getSimpleName());
    }
}
