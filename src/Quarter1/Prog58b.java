package Quarter1;
import java.util.*;

public class Prog58b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A: ");
        double a = input.nextDouble();
        System.out.print("Enter B: ");
        double b = input.nextDouble();
        System.out.print("Enter C: ");
        double c = input.nextDouble();

        double root1 = (-1*b + Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
        double root2 = (-1*b - Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);

        System.out.println((int)root1);
        System.out.println((int)root2);
    }
}
/*
Enter A: 1
Enter B: 5
Enter C: 6
-2
-3

Enter A: 1
Enter B: 1
Enter C: -2
1
-2

Enter A: 1
Enter B: 1
Enter C: -6
2
-3
 */