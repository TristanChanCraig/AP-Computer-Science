package Quarter1;
import java.util.*;

public class LP5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String password = "JonahIsABully";
        int tries = 0;

        for (int lcv = 0; lcv < 3; lcv++) {
            System.out.print("Enter the password: ");
            if (password.equals(input.nextLine())) {
                System.out.print("Welcome");
                break;
            }
            if (tries == 3) System.out.print("Access Denied");
        }
    }
}
