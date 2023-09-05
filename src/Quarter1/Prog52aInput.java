package Quarter1;

import java.util.*;

public class Prog52aInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter length: ");
        int len = input.nextInt();
        System.out.println();

        System.out.println("Please enter width: ");
        int wid = input.nextInt();
        System.out.println();

        int area = len * wid;
        int perim = 2 * len + 2 * wid;
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perim);
    }
}
/*
Please enter length:
5

Please enter width:
10

Area = 50
Perimeter = 30
 */