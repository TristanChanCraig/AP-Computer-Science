package Quarter1;
import java.util.*;

public class LP4_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Rectangular Prism");
        System.out.print("Enter the length: ");
        int l = input.nextInt();

        System.out.print("Enter the width: ");
        int w = input.nextInt();

        System.out.print("Enter the height: ");
        int h = input.nextInt();

        int v = l*w*h;
        System.out.println("The volume is: " + v);
        System.out.println();



        System.out.println("Sphere");
        System.out.print("Enter the radius: ");
        int r = input.nextInt();
        final double pi = 3.14159;
        double volume = (pi*Math.pow((r*2), 3)) / 6;
    }
}
