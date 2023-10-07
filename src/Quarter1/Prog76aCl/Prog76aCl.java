package Quarter1.Prog76aCl;
import java.util.*;

public class Prog76aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in a number you dislike between 1 and 9: ");
        int num = input.nextInt();

        Cl76a wow = new Cl76a(num);
        wow.calc();
        int secNum = wow.getSecNum();
        int lastNum = wow.getLastNum();

        System.out.println("\t\t\t" + num);
        System.out.println("\t\t\tx " + 9);
        System.out.println("----------------");
        System.out.println("\t\t\t" + secNum);
        System.out.println("\tX " + 12345679);
        System.out.println("----------------");
        System.out.print(lastNum);
    }
}
/*
			5
			x 9
----------------
			45
	X 12345679
----------------
555555555
 */