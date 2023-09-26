package Quarter1;
import java.util.*;

public class LP4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of eggs purchased: ");
        int eggs = input.nextInt();

        int dEggs = (eggs - (eggs % 12)) / 12;
        int rEggs = eggs % 12;
        double perD = 0;

        if (dEggs < 4) perD = 0.5;
        else if (dEggs < 6) perD = 0.45;
        else if (dEggs < 11) perD = 0.4;
        else perD = 0.35;

        double cost = (dEggs * perD) + (rEggs * (perD / 12));

        System.out.printf("The bill is equal to: $%.2f", cost);
    }
}
/*
Enter the number of eggs purchased: 18
The bill is equal to: $0.75
 */
