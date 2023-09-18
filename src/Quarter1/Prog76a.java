package Quarter1;
import java.util.*;

public class Prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in a number you dislike between 1 and 9: ");
        int dislikedNum = input.nextInt();
        System.out.println("  " + dislikedNum);
        System.out.println("X " + 9);
        System.out.println("------");
        System.out.println("  " + dislikedNum * 9);
        System.out.println("X " + 12345679);
        System.out.println("------");
        System.out.println(dislikedNum * 9 * 12345679 + "      Surprise!");
    }
}
/*
Enter in a number you dislike between 1 and 9: 5
  5
X 9
------
  45
X 12345679
------
555555555      Surprise!
 */
