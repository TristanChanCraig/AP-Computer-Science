package Quarter1.Prog82aCl;
import java.util.*;
public class Prog82aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the speed limit: ");
        int sL = input.nextInt();

        System.out.print("Enter the vehicle speed: ");
        int vS = input.nextInt();

        Cl82a wow = new Cl82a(sL, vS);
        wow.calc();

        int fine = wow.getFine();

        System.out.print("Fine------------------$" + fine + ".00");
    }
}
/*
Enter the speed limit: 30
Enter the vehicle speed: 42
Fine------------------$80.00

Enter the speed limit: 55
Enter the vehicle speed: 70
Fine------------------$95.00
 */
