package Quarter2.Prog213v;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog213v {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213v.dat"));
            ArrayList<Transaction> list = new ArrayList<Transaction>();

            double balance = input.nextDouble();
            Bank wow = new Bank(balance);

            String code = input.next();

            while (!code.equals("E")) {
                double amount = input.nextDouble();
                Transaction superman = new Transaction(code, amount);
                list.add(superman);
                code = input.next();
            }

            for (int lcv = 0; lcv < list.size(); lcv++) wow.calc(list.get(lcv));

            System.out.println("The final balanec is: $" + wow.getAmount());

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
