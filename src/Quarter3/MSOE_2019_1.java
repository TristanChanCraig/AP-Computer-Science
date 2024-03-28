package Quarter3;

import java.util.Locale;
import java.util.Scanner;

public class MSOE_2019_1 {
    public static int numInLine(String key1, String key2, String line) {
        int cnt = 0;
        for (int lcv = 0; lcv < line.length() - key1.length() + 1; lcv++)
            if (line.substring(lcv, lcv + key1.length()).equals(key1) ||
                    line.substring(lcv, lcv + key1.length()).equals(key2)) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input two letters: ");
        String key1 = input.next().toLowerCase();
        String key2 = key1.substring(1, 2) + key1.substring(0, 1);
        System.out.print("Input a line of text: ");
        input.nextLine();
        String line = input.nextLine().toLowerCase();
        System.out.print("The result is: " + numInLine(key1, key2, line));
    }
}
/*
Input two letters: ie
Input a line of text: their fields are in the hidden foreign forest
The result is: 3
 */