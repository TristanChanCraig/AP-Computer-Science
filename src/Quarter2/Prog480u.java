package Quarter2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog480u {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog480u.dat"));

            double[][] mat = new double[5][6];
            for (int r = 0; r < mat.length - 1; r++) {
                for (int c = 0; c < mat[0].length - 1; c++) {
                    while (input.hasNext()) {
                        int salesperson = input.nextInt();
                        int product = input.nextInt();
                        double cost = input.nextDouble();
                        mat[salesperson - 1][product - 1] = cost;
                    }
                }
            }

            double sum = 0;
            for (int r = 0; r < mat.length - 1; r++) {
                for (int c = 0; c < mat[0].length - 1; c++) {
                    sum += mat[r][c];
                }
                mat[r][5] = sum;
                sum = 0;
            }

            for (int c = 0; c < mat[0].length; c++) {
                for (int r = 0; r < mat.length - 1; r++) {
                    sum += mat[r][c];
                }
                mat[4][c] = sum;
                sum = 0;
            }

            System.out.println("Salesperson\t\t1\t\t2\t\t3\t\t4\t\t5\t\tTotal");
            for (int lcv = 0; lcv < mat.length; lcv++) {
                System.out.print(lcv + 1 + "\t\t\t\t");
                for (int lcv2 = 0; lcv2 < mat[0].length; lcv2++) {
                    System.out.printf("%.2f\t", mat[lcv][lcv2]);
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
