package Quarter1;
import java.util.*;

public class LP4_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Rectangular Prism");
        System.out.print("Enter the length: ");
        int rpL = input.nextInt();

        System.out.print("Enter the width: ");
        int rpW = input.nextInt();

        System.out.print("Enter the height: ");
        int rpH = input.nextInt();

        int rpV = rpL*rpW*rpH;
        System.out.println("The volume is: " + rpV + "\n");



        System.out.println("Sphere");
        System.out.print("Enter the radius: ");
        int sR = input.nextInt();
        final double pi = 3.14159;
        double sV = (pi*Math.pow((sR*2), 3)) / 6;
        System.out.printf("%.3f\n\n", sV);



        System.out.println("Cube");
        System.out.println("Enter the length of each side: ");
        int cL = input.nextInt();
        int cV = cL * cL * cL;
        System.out.print("The volume is: " + cV);
    }
}
/*
Rectangular Prism
Enter the length: 3
Enter the width: 4
Enter the height: 5
The volume is: 60

Sphere
Enter the radius: 3
113.097

Cube
Enter the length of each side:
4
The volume is: 64
 */