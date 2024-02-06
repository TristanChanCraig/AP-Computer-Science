package Quarter3;

import java.util.Scanner;

public class Prog162aRecursive {
    public static int factLoop(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) product *= i;
        return product;
    }

    public static int factRevLoop(int n) {
        int product = 1;
        for (int i = n; i > 0; i--) product *= i;
        return product;
    }

    public static int factorial(int n) {
        if (n <= 1) return n;         // Base/ending case
        return n * factorial(n-1); // Recursive case
    }

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = keys.nextInt();
        while (num != 0) {
            int fact = factorial(num);
            System.out.println(num + "! = " + fact);
            System.out.println();
            System.out.println("Enter a number: ");
            num = keys.nextInt();
        }
    }

}
/*
Enter a number: 1
1! = 1

Enter a number:
2
2! = 2

Enter a number:
3
3! = 6

Enter a number:
4
4! = 24

Enter a number:
5
5! = 120

Enter a number:
6
6! = 720

Enter a number:
7
7! = 5040

Enter a number:
8
8! = 40320

Enter a number:
9
9! = 362880

Enter a number:
0
 */