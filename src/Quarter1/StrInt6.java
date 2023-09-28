package Quarter1;
import java.util.*;

public class StrInt6 {
    public static void main(String[] args) {
        Scanner cool = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String mytext = cool.nextLine().toLowerCase().trim();

        int Acount = 0;
        int Bcount = 0;
        int Ccount = 0;
        int Dcount = 0;
        int Ecount = 0;
        int Fcount = 0;
        int Gcount = 0;
        int Hcount = 0;
        int Icount = 0;
        int Jcount = 0;
        int Kcount = 0;
        int Lcount = 0;
        int Mcount = 0;
        int Ncount = 0;
        int Ocount = 0;
        int Pcount = 0;
        int Qcount = 0;
        int Rcount = 0;
        int Scount = 0;
        int Tcount = 0;
        int Ucount = 0;
        int Vcount = 0;
        int Wcount = 0;
        int Xcount = 0;
        int Ycount = 0;
        int Zcount = 0;

        for (int lcv = 0; lcv < mytext.length(); lcv++) {
            char cur = mytext.charAt(lcv);
            if (cur == 'a' && Acount < 1) Acount++;
            if (cur == 'b' && Bcount < 1) Bcount++;
            if (cur == 'c' && Ccount < 1) Ccount++;
            if (cur == 'd' && Dcount < 1) Dcount++;
            if (cur == 'e' && Ecount < 1) Ecount++;
            if (cur == 'f' && Fcount < 1) Fcount++;
            if (cur == 'g' && Gcount < 1) Gcount++;
            if (cur == 'h' && Hcount < 1) Hcount++;
            if (cur == 'i' && Icount < 1) Icount++;
            if (cur == 'j' && Jcount < 1) Jcount++;
            if (cur == 'k' && Kcount < 1) Kcount++;
            if (cur == 'l' && Lcount < 1) Lcount++;
            if (cur == 'm' && Mcount < 1) Mcount++;
            if (cur == 'n' && Ncount < 1) Ncount++;
            if (cur == 'o' && Ocount < 1) Ocount++;
            if (cur == 'p' && Pcount < 1) Pcount++;
            if (cur == 'q' && Qcount < 1) Qcount++;
            if (cur == 'r' && Rcount < 1) Rcount++;
            if (cur == 's' && Scount < 1) Scount++;
            if (cur == 't' && Tcount < 1) Tcount++;
            if (cur == 'u' && Ucount < 1) Ucount++;
            if (cur == 'v' && Vcount < 1) Vcount++;
            if (cur == 'w' && Wcount < 1) Wcount++;
            if (cur == 'x' && Xcount < 1) Xcount++;
            if (cur == 'y' && Ycount < 1) Ycount++;
            if (cur == 'z' && Zcount < 1) Zcount++;
        }
        int count = Acount + Bcount + Ccount + Dcount + Ecount + Fcount + Gcount + Hcount + Icount + Jcount + Kcount + Lcount + Mcount + Ncount + Ocount + Pcount + Qcount + Rcount + Scount + Tcount + Ucount + Vcount + Wcount + Xcount + Ycount + Zcount;
        System.out.println(count);
    }
}
/*
Enter a string: beautiful
8
 */