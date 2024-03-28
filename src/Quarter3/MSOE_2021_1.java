package Quarter3;

import java.util.Scanner;

public class MSOE_2021_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a letter: ");
        String key = input.next().toLowerCase();

        System.out.print("Input a sentence: ");
        input.nextLine();
        String sent = input.nextLine().toLowerCase();

        String res = "not found";
        int start = 0;
        for (int lcv = 0; lcv <  sent.length(); lcv++) {
            if (sent.substring(lcv, lcv+1).equals(" ")) start = lcv+1;
            if (lcv == sent.length() - 1 && sent.substring(lcv, lcv+1).equals(key)) res = sent.substring(start, lcv+1);
        }
        start = 0;
        for (int lcv = 0; lcv <  sent.length()-1; lcv++) {
            if (sent.substring(lcv, lcv+1).equals(" ")) start = lcv+1;
            if (sent.substring(lcv, lcv + 2).equals(key + " ")) {
                res = sent.substring(start, lcv+1);
                lcv = sent.length();
            }
        }
        System.out.print(res);
    }
}
/*
Input a letter: g
Input a sentence: coffee is a way of stealing time that should by rights belong to your older self
stealing
 */
