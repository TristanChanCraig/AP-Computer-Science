package Quarter1;
import java.util.*;

public class LP4_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = input.nextDouble();
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        System.out.printf("Sin: %.3f\n", sin);
        System.out.printf("Cosine: %.3f\n", cos);
        System.out.printf("Tangent: %.3f\n", tan);
    }
}
/*
Enter an angle in degrees: 30
Sin: 0.500
Cosine: 0.866
Tangent: 0.577
 */
