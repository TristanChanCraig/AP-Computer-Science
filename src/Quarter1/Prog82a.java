package Quarter1;
import java.util.*;

public class Prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the speed limit: ");
        int sL = input.nextInt();

        System.out.print("Enter the vehicle speed: ");
        int vS = input.nextInt();

        int fine = 20 + ((vS - sL) * 12);

        System.out.print("Fine------------------" + fine + ".00");
    }
}
