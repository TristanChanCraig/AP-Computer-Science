package Quarter2;

import java.util.Scanner;

public class MSOE2016_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a lowercase word: ");
        String str = input.nextLine();

        boolean pd = true;
        String f = "";
        String e = "";
        int cnt = str.length()-1;

        for (int lcv = 0; lcv < str.length()/2; lcv++) {
            f = str.substring(lcv, lcv+1);
            e = str.substring(cnt, cnt+1);
            if (!f.equals(e)) pd = false;
            cnt--;
        }

        if (pd) System.out.print("The word is a palindrome.");
        else System.out.print("The word is not a palindrome.");
    }
}
/*
Enter a lowercase word: abba
The word is a palindrome.

Enter a lowercase word: deified
The word is a palindrome.

Enter a lowercase word: wehatejonah
The word is not a palindrome.
 */