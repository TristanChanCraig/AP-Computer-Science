package Quarter3.AbstClLab;

public class Rectangle extends NotCircle {
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public void setHeight(double h) { height = h; }
    public void setWidth(double w) { width = w; }
    public double getHeight() { return height; }
    public double getWidth() { return width; }

    public void calculateArea() {
        System.out.println("Area: " + (width * height));
    }

    public void calculateCircumference() {
        System.out.println("Perimeter: " + (2 * width + 2 * height));
    }

    public void calculatePerimeter() {
        this.calculateCircumference();
    }
}
