package Quarter1;

import java.util.Base64;

public class SPCTemplate23 {
    public static final String TEAM_NAME = "GoofyGoobers";  // TODO: Change


    /** 1. Palindrome Number (10 points)
     * Write a program that finds the closest palindrome number
     * greater than the provided input. A palindrome is a number
     * that remains the same when its digits are reversed.
     *
     * @param n Example: 115
     * @return – Example: 121
     */
    public int Problem1(int n) {
        /* Your code here */

        return -1;  // Remove
    }


    /** 2. Sum of Square Roots (10 points)
     * Write a program that finds the smallest positive
     * integer n for which the sum of the square roots of
     * the first n positive integers is greater than a given
     * threshold. Avoid using Math.pow() or similar functions to calculate squares.
     *
     * @param threshold Example: 10
     * @return – Example: 6  <br/>
     *     Explanation: sqrt(1) + sqrt(2) + ... + sqrt(5) =
     *                  8.38... < 10, but if we include sqrt(6),
     *                  the sum becomes 10.83... > 10, so we return 6.
     */
    public int Problem2(int threshold) {
        /* Your code here */
        double num = 0;
        int count = 0;
        for (int lcv = 1; num < threshold; lcv++) {
            num += Math.sqrt(lcv);
            count++;
        }
        return count;  // Remove
    }


    /** 3. GCD Calculation (10 points)
     * Write a program that takes two non-negative integers
     * and returns their Greatest Common Divisor (GCD).
     * Note: Euclid's GCD algorithm is defined as  <br/>
     * <pre>
     *     while b != 0:
     *         temp = b
     *         b = a MOD b
     *         a = temp
     *     return a
     * </pre>
     *
     * @param a Example: 54
     * @param b Example: 24
     * @return – Example: 6
     */
    public int Problem3(int a, int b) {
        /* Your code here */

        return -1;  // Remove
    }


    /** 4. Prime Factorization (20 points)
     * Given a positive integer n, provide its prime factorization.
     *
     * @param n Example: 60
     * @return – Example: "2 2 3 5"
     */
    public String Problem4(int n) {
        /* Your code here */
        String factors = "";
        while((n%2==0 || n%3==0) || (n%5==0 || n%7==0)) {
            if (n%2==0) {
                n /= 2;
                factors += "2 ";
            }
            if (n%3==0) {
                n /= 3;
                factors += "3 ";
            }
            if (n%5==0) {
                n /= 2;
                factors += "5 ";
            }
            if (n%7==0) {
                n /= 2;
                factors += "7 ";
            }
        }

        return factors.trim();  // Remove
    }


    /** 5. Fibonacci Sequence (20 points)
     * Write a program to generate the n-th Fibonacci number
     * where n is a positive integer input by the user.
     * Use an iterative approach.
     * Note: the Fibonacci sequence is defined as  <br/>
     * F(n) = F(n-1) + F(n-2);   F(0) = 0;   F(1) = 1
     *
     * @param n Example: 9
     * @return – Example: 34
     */
    public int Problem5(int n) {
        /* Your code here */

        return -1;  // Remove
    }


    /** 6. Permutations Count (20 points)
     * Given two integers n and r, write a program to compute
     * the number of permutations of n objects taken r at a time,
     * without using any external library or function for factorial.
     *
     * @param n Example: 5
     * @param r Example: 2
     * @return – Example: 20
     */
    public int Problem6(int n, int r) {
        /* Your code here */

        return -1;  // Remove
    }


    /** 7. Riemann Sum (40 points)
     * Implement the Left Riemann Sum for estimating the area
     * under a curve represented by a mathematical
     * function f(x) = x^2. Your program should take as input
     * the lower bound a, upper bound b, and the number of
     * sub-intervals n. Round the output to 3 decimals.
     * Note: The Left Riemann Sum <br/>
     * F(a, b, n f(x)) is defined as  <br/>
     * <pre>
     *     Let f(x) = x^2
     *
     *     Δx = (b-a) / n
     *     Sum = 0
     *     for i = 0 to n-1:
     *         Sum += f(a + i * Δx)
     *     return Δx * Sum
     * </pre>
     *
     * @param a Example: 0
     * @param b Example: 1
     * @param n Example: 1000
     * @return – Example: 0.333
     */
    public double Problem7(int a, int b, int n) {
        /* Your code here */

        return -1.0;  // Remove
    }


    /** 8. Euler’s Totient Function (40 points)
     * Euler’s Totient function ϕ(n) counts the positive
     * integers that are relatively prime to n.
     * Implement this function and output the result for an input n.
     * Note: the Totient Function can be computed as  <br/>
     * <pre>
     *     1. Initialization: set result to n
     *     2. Prime Factorization: For each prime factor p of n
     *        (you can iterate p from 2 to sqrt(n):
     *        - If p is a prime factor of n, do:
     *          * Subtract from the result its fraction:
     *            result *= (1 - 1/p)
     *          * While n MOD p = 0, divide n by p
     *     3. Special Case for Primes Greater than sqrt(n):
     *        - if n > 1 after the above loop, then n is a prime
     *          number greater than sqrt(n).
     *        - Subtract from the result its fraction:
     *          result *= (1 - 1/n)
     * </pre>
     *
     * @param n Example: 12
     * @return – Example: 4
     */
    public int Problem8(int n) {
        /* Your code here */

        return -1;  // Remove
    }


    /** 9. Collatz Conjecture Sequence Length (40 points)
     * For a given positive integer n, generate the Collatz
     * sequence and output the length of the sequence.
     * According to the conjecture, no matter what value of n,
     * the sequence will always reach 1.
     * Note: the Collatz conjecture is defined as  <br/>
     * F(N) = n/2 (if n is even)   OR   3n+1 (if n is odd)
     *
     * @param n Example: 6
     * @return – Example: 9
     */
    public int Problem9(int n) {
        /* Your code here */
        int count = 1;
        while (n != 1) {
            if (n%2==0) n = n/2;
            else n = 3*n+1;
            count++;
        }
        return count;  // Remove
    }


    /* DO NOT MODIFY BELOW */
    public static void main(String[] args) {
        if (TEAM_NAME == null) {
            System.out.println("ERROR: Please set TEAM_NAME first!");
            return;
        }
        try {
            SPCTemplate23 spc = new SPCTemplate23();
            int p1a1 = spc.Problem1(543);
            int p1a2 = spc.Problem1(8263);
            int p1a3 = spc.Problem1(415);
            int p2a1 = spc.Problem2(14);
            int p2a2 = spc.Problem2(100);
            int p2a3 = spc.Problem2(68);
            int p3a1 = spc.Problem3(54, 24);
            int p3a2 = spc.Problem3(48, 18);
            int p3a3 = spc.Problem3(100, 75);
            String p4a1 = spc.Problem4(60);
            String p4a2 = spc.Problem4(84);
            String p4a3 = spc.Problem4(100);
            int p5a1 = spc.Problem5(9);
            int p5a2 = spc.Problem5(10);
            int p5a3 = spc.Problem5(5);
            int p6a1 = spc.Problem6(5, 2);
            int p6a2 = spc.Problem6(6, 3);
            int p6a3 = spc.Problem6(7, 4);
            double p7a1 = spc.Problem7(0, 1, 1000);
            double p7a2 = spc.Problem7(0, 2, 1000);
            double p7a3 = spc.Problem7(1, 2, 1000);
            int p8a1 = spc.Problem8(12);
            int p8a2 = spc.Problem8(9);
            int p8a3 = spc.Problem8(7);
            int p9a1 = spc.Problem9(6);
            int p9a2 = spc.Problem9(7);
            int p9a3 = spc.Problem9(12);
            String header = p1a1 + "«" + p1a2 + "«" + p1a3 + "«" +
                    p2a1 + "«" + p2a2 + "«" + p2a3 + "«" +
                    p3a1 + "«" + p3a2 + "«" + p3a3 + "«" +
                    p4a1 + "«" + p4a2 + "«" + p4a3 + "«" +
                    p5a1 + "«" + p5a2 + "«" + p5a3 + "«" +
                    p6a1 + "«" + p6a2 + "«" + p6a3 + "«" +
                    p7a1 + "«" + p7a2 + "«" + p7a3 + "«" +
                    p8a1 + "«" + p8a2 + "«" + p8a3 + "«" +
                    p9a1 + "«" + p9a2 + "«" + p9a3;
            header = TEAM_NAME + "«" + header;
            String encodedString = Base64.getEncoder().encodeToString(header.getBytes());
            String url = "http://compsci.local/spc";
            System.out.println("Submit this string to: " + url + "\n" + encodedString);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
