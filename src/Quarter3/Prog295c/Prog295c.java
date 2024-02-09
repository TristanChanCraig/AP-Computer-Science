package Quarter3.Prog295c;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog295c {
    public static void main(String[] args) {
        try {
            Scanner input1 = new Scanner(new File("Langdat/merge1.dat"));

            List<ArrayList> list = new ArrayList<>();

            while (input1.hasNext()) {
                int lcv = 0;
                String ss = input1.next();
                Employee e = new Employee(ss, input1.next());
                while (lcv < list.size() && list.get(lcv).getSS().compareTo(ss) <= 0)
            }

            Scanner input2 = new Scanner(new File("Langdat/merge2.dat"));

            while (input2.hasNext()) {

            }

            List<ArrayList> list2 = new ArrayList<>();

            Scanner input3 = new Scanner(new File("Langdat/merge3.dat"));

            while (input3.hasNext()) {

            }

            Scanner input4 = new Scanner(new File("Langdat/merge4.dat"));

            while (input4.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
