package Quarter1;
import java.util.*;

public class StrInt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String anagram = input.nextLine();

        word = word.toLowerCase();
        anagram = anagram.toLowerCase();

        if (word.length() != anagram.length()) {
            System.out.println("Not anagrams");
        } else {
            for (int lcv = 0; lcv < word.length(); lcv++) {
                String c = word.substring(lcv, lcv+1);
                int index = anagram.indexOf(c);

                if (index != -1)
                    anagram = anagram.substring(0, index) +
                              anagram.substring(index+1, anagram.length());
                else {
                    System.out.println("Not anagrams");
                    break;
                }
            }
        }
        System.out.println("Are the strings anagrams: " + anagram.isEmpty());
    }
}
/*
Army
Mary
Are the strings anagrams: true
 */