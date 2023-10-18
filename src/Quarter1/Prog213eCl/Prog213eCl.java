package Quarter1.Prog213eCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213eCl {
    public static void main(String[] args) {


        try {
            Scanner input = new Scanner(new File("Langdat/prog213e.dat"));

            int u20 = 0;
            int e20to39 = 0;
            int e40to59 = 0;
            int e60to79 = 0;
            int a79 = 0;
            int totalNum = 0;

            while (input.hasNext()) {
                int num = input.nextInt();
                Cl213e ah = new Cl213e(num);
                ah.calc();
                u20 += ah.getU20();
                e20to39 += ah.getE20to39();
                e40to59 += ah.getE40to59();
                e60to79 += ah.getE60to79();
                a79 += ah.getA79();
                totalNum += ah.getTotalNum();
            }

            System.out.println("Langner Family");
            System.out.println("Age Group\tDistribution\tPercentage");
            System.out.printf("<20\t\t\t%d\t\t\t%.2f\n", u20, (double)u20/totalNum*100);
            System.out.printf("20-39\t\t%d\t\t\t%.2f\n", e20to39, (double)e20to39/totalNum*100);
            System.out.printf("40-59\t\t%d\t\t\t%.2f\n", e40to59, (double)e40to59/totalNum*100);
            System.out.printf("60-79\t\t%d\t\t\t%.2f\n", e60to79, (double)e60to79/totalNum*100);
            System.out.printf(">79\t\t\t%d\t\t\t%.2f\n", a79, (double)a79/totalNum*100);
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
