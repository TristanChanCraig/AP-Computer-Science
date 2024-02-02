package Quarter3.Prog703s;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog703s.txt"));

            List<Computer> list = new ArrayList<>();
            int num = input.nextInt();

            while (input.hasNext()) {
                if (num == 1) {
                    String name = input.next();
                    int number = input.nextInt();
                    double val = input.nextDouble();
                    String color = input.next();
                    Computer c = new Apple(name, number, val, color);
                    list.add(c);
                } else if (num == 2) {
                    String name = input.next();
                    int number = input.nextInt();
                    double val = input.nextDouble();
                    double wvNumber = input.nextDouble();
                    Computer c = new Windows(name, number, val, wvNumber);
                    list.add(c);
                } else if (num == 3) {
                    String name = input.next();
                    int number = input.nextInt();
                    double val = input.nextDouble();
                    int code = input.nextInt();
                    Computer c = new Linux(name, number, val, code);
                    list.add(c);
                }
                if (input.hasNext()) num = input.nextInt();
            }

            int greenCnt = 0;
            int goldCnt = 0;

            int v7cnt = 0;

            int last5cnt = 0;

            for (Computer c : list) {
                if (c instanceof Apple) {
                    if (((Apple)c).getColor().equals("Green")) greenCnt++;
                    else if (((Apple)c).getColor().equals("Gold")) goldCnt++;
                } else if (c instanceof Windows) {
                    if (((Windows)c).getWVNumber() == 7.0) v7cnt++;
                } else if (c instanceof Linux) {
                    int code2 = ((Linux)c).getCode();
                    while (code2 > 10) {code2 %= 10;}
                    if (code2 == 5) last5cnt++;
                }
            }

            System.out.println("Number of Green Apple Computers: " + greenCnt);
            System.out.println("Number of Gold Apple Computers: " + goldCnt);

            System.out.println("Number of Windows Machines on Version 7.0: " + v7cnt);

            System.out.println("Number of Linux Machines Hava a Secret Code Number Ending in 5: " + last5cnt);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Number of Green Apple Computers: 1
Number of Gold Apple Computers: 0
Number of Windows Machines on Version 7.0: 2
Number of Linux Machines Hava a Secret Code Number Ending in 5: 4
 */