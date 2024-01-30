package Quarter3.AbstClLab;

import java.util.Scanner;

public class ABCLab {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        // Circle
        System.out.print("Enter circle radius: ");
        double r = kbd.nextDouble();
        Shape sh1 = new Circle(r);
        // Rectangle
        System.out.print("Enter rectangle height: ");
        double rh = kbd.nextDouble();
        System.out.print("Enter rectangle width: ");
        double rw = kbd.nextDouble();
        Shape sh2 = new Rectangle(rh, rw);
        // Triangle
        System.out.print("Enter triangle base: ");
        double tb = kbd.nextDouble();
        System.out.print("Enter triangle height: ");
        double th = kbd.nextDouble();
        Shape sh3 = new Triangle(th, tb);

        ((Circle)sh1).printClass();
        sh1.calculateArea();
        sh1.calculateCircumference();
        System.out.println();

        ((Rectangle)sh2).printClass();
        sh2.calculateArea();
        ((Rectangle)sh2).calculatePerimeter();
        System.out.println();

        ((Triangle)sh3).printClass();
        sh3.calculateArea();
        ((Triangle)sh3).calculatePerimeter();
    }
}
/*
Enter circle radius: 69
Enter rectangle height: 69
Enter rectangle width: 69
Enter triangle base: 69
Enter triangle height: 69
Circle
Area: 14957.122623741005
Circumference: 433.53978619539146

Rectangle
Area: 4761.0
Perimeter: 276.0

Triangle
Area: 2380.5
Perimeter: 235.58073580374355

 */