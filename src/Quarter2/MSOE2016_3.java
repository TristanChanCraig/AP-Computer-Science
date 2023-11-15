package Quarter2;
import java.util.*;

public class MSOE2016_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first Radii of the spherical lens surface? ");
        double r1 = input.nextDouble();

        System.out.print("What is the second Radii of the spherical lens surface? ");
        double r2 = input.nextDouble();

        System.out.print("What is the thickness of the lens? ");
        double d = input.nextDouble();

        System.out.print("What is the refractive index of the lens material? ");
        double n = input.nextDouble();

        double f = 1/((n-1)*((1/r1)-(1/r2)+(((n-1)*d)/n*r1*r2)));

        System.out.print("The focal length of the lens: " + f);
    }
}
