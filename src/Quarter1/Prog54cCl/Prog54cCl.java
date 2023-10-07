package Quarter1.Prog54cCl;
import java.util.*;

public class Prog54cCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in the radius of the circle: ");
        double radius = input.nextDouble();

        Cl54c wow = new Cl54c(radius);
        wow.calc();

        double area = wow.getArea();
        double circum = wow.getCircum();

        System.out.printf("The radius of the circle is %.3f\n", radius);
        System.out.printf("The area of the circle is %.3f\n", area);
        System.out.printf("The circumference of the circle is %.3f\n", circum);
    }
}
/*
Enter in the radius of the circle: 3.712
The radius of the circle is 3.712
The area of the circle is 43.288
The circumference of the circle is 23.323
 */