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

            System.out.println("Merge 1 combined with Merge 2");
            System.out.println("social security#\tClass\tType\tDept");
            for (Employee e : list) {
                e.calc();
                System.out.println(e.getMySS() +  "\t\t\t" + e.getMyClass() +  "\t\t" + e.getMyType() +  "\t\t" + e.getMyDept());
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

            System.out.println("Merge 3 combined with Merge 4");
            System.out.println("social security #\tClass\tType\tDept");
            for (Employee e : list2) {
                e.calc();
                System.out.println(e.getMySS() +  "\t\t\t" + e.getMyClass() +  "\t\t" + e.getMyType() +  "\t\t" + e.getMyDept());
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
C:\Users\chan.t3\.jdks\openjdk-20.0.2\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=52207:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\chan.t3\IdeaProjects\AP-Computer-Science\out\production\Desktop Quarter3.Prog295c.Prog295c
Merge 1 combined with Merge 2
social security#	Class	Type	Dept
000-00-0001			A		B		1
111-11-1111			A		B		1
123-45-6789			C		F		5
222-22-2227			D		L		9
321-01-2345			A		B		1
357-86-4219			C		F		5
411-52-9485			D		L		9
432-23-3489			A		B		1
514-98-1234			A		B		1
514-98-5555			C		F		5
521-96-8743			C		F		5
522-77-8765			C		F		5
522-77-8766			C		F		5
522-77-8767			C		F		5
525-25-2525			A		B		1
531-45-9260			C		F		5
538-11-1234			D		L		9
539-12-1235			D		L		9
540-13-1236			D		L		9
541-14-1237			C		F		5


Merge 3 combined with Merge 4
social security #	Class	Type	Dept
000-00-0001			A		B		1
111-11-1111			A		B		1
123-45-6789			C		F		5
222-22-2227			D		L		9
321-01-2345			A		B		1
357-86-4219			C		F		5
411-52-9485			D		L		9
432-23-3489			A		B		1
514-98-1234			A		B		1
514-98-5555			C		F		5
521-96-8743			C		F		5
522-77-8765			C		F		5
522-77-8766			C		F		5
522-77-8767			C		F		5
525-25-2525			A		B		1
531-45-9260			C		F		5
538-11-1234			D		L		9
539-12-1235			D		L		9
540-13-1236			D		L		9
541-14-1237			C		F		5
 */