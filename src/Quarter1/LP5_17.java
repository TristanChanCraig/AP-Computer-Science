package Quarter1;
import java.util.*;

public class LP5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String password = "JonahIsABully";
        int tries = 0;

        for (int lcv = 0; lcv < 4; lcv++) {
            if (tries == 3) {
                System.out.print("Access Denied");
                break;
            }
            System.out.print("Enter the password: ");
            if (password.equals(input.nextLine())) {
                System.out.print("Welcome");
                break;
            }
            tries++;
        }
    }
}
/*
Enter the password: wah
Enter the password: wah
Enter the password: wah
Access Denied

Enter the password: JonahIsABully
Welcome
 */