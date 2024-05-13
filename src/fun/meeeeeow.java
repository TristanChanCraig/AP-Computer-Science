package fun;

import java.util.Scanner;

public class meeeeeow {
    public static String gah(String s) {
        int rand = (int)(Math.random() * 6.9420);
        for (int lcv = 0; lcv < rand; lcv++) {
            for (int lcv2 = 0; lcv2 < lcv; lcv2++) s += s;
            s += "MEEEEEOW";
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in a string: ");
        String s = input.nextLine();
        System.out.print(gah(s));
    }
}
