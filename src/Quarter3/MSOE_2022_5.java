package Quarter3;

import java.util.Scanner;

public class MSOE_2022_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of seashells: ");
        int num = input.nextInt();

        System.out.println("Input all weight of the seashells: ");
        int ss = 0;
        for (int lcv = 0; lcv < num; lcv++) {
            ss += input.nextInt();
            input.nextLine();
        }
        input.close();

        int buckets = 0;
        while (buckets < ss) buckets += 100;
        System.out.println(buckets / 100);
    }
}
/*
Input the number of seashells: 3
Input all weight of the seashells:
100
25
50
2
 */