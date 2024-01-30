package Quarter3.AbstClLab;

public abstract class NotCircle implements Shape {
    protected double height;

    public abstract double getHeight();
    public abstract void setHeight(double h);
    public void printClass() {
        System.out.println(this.getClass().getSimpleName());
    };

}
