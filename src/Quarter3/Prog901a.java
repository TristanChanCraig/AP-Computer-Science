package Quarter3;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Prog901a {
    public static void printFile(Scanner input) {
        String s = "";
        while (input.hasNext()) {
            s += input.nextLine() + "\n";
        }
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        if (s.length() == 0) return "";
        return reverseString(s.substring(1)) + s.substring(0,1);
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog512h.dat"));
            printFile(input);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
lufituaeb dna dalg sgnihT
lla dna efil gninrom dooG
klis ro ocilac ti eB
klim sa etihw sa htolc nI
erar os wohs a ekam tahT
riaf nemow uoy ot liaH
srewolf fo sdleif neerg uoy dnA
srewob ydahs uoy ot liaH
seton yb sevael rebmun dluoW
staorht esohw sdrib uoy ot liaH
hgih erusaem sduolc thgirb hcihW
yks gninrom eht ot liaH
dne on sah gnidneps siH
dneirf taerg ym si nus ehT
dlog eht snwo taht eh tuB
dloh gnihton stekcop yM
lufituaeb dna dalg sgnihT
lla dna efil gninrom dooG
 */