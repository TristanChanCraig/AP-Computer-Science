package Quarter1;
import java.util.*;

public class Prog54c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in the radius of the circle: ");
        double radius = input.nextDouble();
        final double pi = 3.14159;
        double area = Math.pow(radius, 2) * pi;
        double circum = 2*pi*radius;

        System.out.printf("The radius of the circle is %.3f", radius);
        System.out.println();
        System.out.printf("The area of the circle is %.3f", area);
        System.out.println();
        System.out.printf("The circumference of the circle is %.3f", circum);
        System.out.println();
    }
}
/*
Enter in the radius of the circle: 3.712
The radius of the circle is 3.712
The area of the circle is 43.288
The circumference of the circle is 23.323
 */