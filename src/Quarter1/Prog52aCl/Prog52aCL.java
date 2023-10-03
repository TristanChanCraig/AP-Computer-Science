package Quarter1.Prog52aCl;
import java.util.*;

public class Prog52aCL { // Driver Class (main)
    public static void main(String[] args) {
        // Input Section
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = input.nextInt();
        System.out.print("Enter width: ");
        int w = input.nextInt();

        // Calculation Section
        Cl52a wow = new Cl52a(l, w);
        wow.calc(); // Don't forget to call calc!

        int area = wow.getArea();
        int perim = wow.getPerim();

        // Output Section
        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perim);
    }
}
