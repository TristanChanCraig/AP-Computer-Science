package Quarter1;
import java.util.*;

public class LP4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 20;
        int min = 1;
        int range = max - min + 1;
        int secretNum = (int)(Math.random() * range) + min;

        System.out.print("Enter a number between 1 and 20: ");
        int playerNum = input.nextInt();

        System.out.println("Computer's number: " + secretNum);
        System.out.println("Player's number: " + playerNum);

        if (secretNum == playerNum) System.out.print("You won!");
        else System.out.println("Better luck next time.");
    }
}
/*
Enter a number between 1 and 20: 15
Computer's number: 9
Player's number: 15
Better luck next time.

Enter a number between 1 and 20: 3
Computer's number: 1
Player's number: 3
Better luck next time.

Enter a number between 1 and 20: 19
Computer's number: 5
Player's number: 19
Better luck next time.
 */