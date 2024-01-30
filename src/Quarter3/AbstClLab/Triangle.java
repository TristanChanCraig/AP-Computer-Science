package Quarter3.AbstClLab;

public class Triangle extends NotCircle {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.base = base;
        this.height = height;
    }
    public void setHeight(double h) { height = h; }
    public void setBase(double b) { base = b; }
    public double getHeight() { return height; }
    public double getBase() { return base; }

    public void calculateArea() {
        System.out.println("Area: " + (0.5 * base * height));
    }

    public void calculateCircumference() {
        double hype = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)); // Math.hypot
        System.out.println("Perimeter: " + (hype + base + height));
    }

    public void calculatePerimeter() {
        this.calculateCircumference();
    }
}
