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

            List<Employee> list = new ArrayList<Employee>();

            while (input1.hasNext()) {
                int lcv = 0;
                String ss = input1.next();
                Employee e = new Employee(ss, input1.next());
                while (lcv < list.size() && list.get(lcv).getMySS().compareTo(ss) <= 0) lcv++;
                list.add(lcv, e);
            }

            Scanner input2 = new Scanner(new File("Langdat/merge2.dat"));

            while (input2.hasNext()) {
                int lcv = 0;
                String ss = input2.next();
                Employee e = new Employee(ss, input2.next());
                while (lcv < list.size() && list.get(lcv).getMySS().compareTo(ss) <= 0) lcv++;
                list.add(lcv, e);
            }


            for (Employee e : list) {
                System.out.println(e.getMySS());
            }
            System.out.println();
            System.out.println();

            List<Employee> list2 = new ArrayList<>();

            Scanner input3 = new Scanner(new File("Langdat/merge3.dat"));

            while (input3.hasNext()) {
                int lcv = 0;
                String ss = input3.next();
                Employee e = new Employee(ss, input3.next());
                while (lcv < list2.size() && list2.get(lcv).getMySS().compareTo(ss) <= 0) lcv++;
                list2.add(lcv, e);
            }

            Scanner input4 = new Scanner(new File("Langdat/merge4.dat"));

            while (input4.hasNext()) {
                int lcv = 0;
                String ss = input4.next();
                Employee e = new Employee(ss, input4.next());
                while (lcv < list2.size() && list2.get(lcv).getMySS().compareTo(ss) <= 0) lcv++;
                list2.add(lcv, e);
            }

            for (Employee e : list2) {
                System.out.println(e.getMySS());
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
