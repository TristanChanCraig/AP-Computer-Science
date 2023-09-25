package Quarter1;
import javax.swing.text.DefaultTextUI;
import java.nio.channels.FileLock;
import java.util.*;

public class StrInt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().toLowerCase();

        for (int lcv = 0; lcv < str.length(); lcv++) {
            String c = str.substring(lcv, lcv+1);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println("First non-repeating character is: " + c);
                break;
            }
        }
    }
}
/*
morning
First non-repeating character is: m
 */